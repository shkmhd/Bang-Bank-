package com.bangbank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bangbank.dao.TransactionDao;
import com.bangbank.entity.Account;
import com.bangbank.entity.Transaction;
import com.bangbank.dao.AccountDao;



@Service
public class BankTransactionService {

	/*
	 * @Autowired private TransactionDao txnDao;
	 */
	TransactionDao txnDao=new TransactionDao();
	
	/*
	 * @Autowired private AccountDao accDao;
	 */
	private AccountDao accDao=new AccountDao();
	@Transactional
	public boolean transfer(Transaction transaction,String TransactionMode) {	
		
		
	
		Account acc1 = accDao.fetchById(transaction.getFrmAcc().getAccId());
		Account acc2 = accDao.fetchById(transaction.getToAccNo());
		
		if(transaction.getAmt() < acc1.getBalance()) {
			
		acc1.setBalance(acc1.getBalance() - transaction.getAmt());
		acc2.setBalance(acc2.getBalance() + transaction.getAmt());
		
		System.out.println("Transaction Successful");
		
		accDao.addToDataBase(acc1);
		accDao.addToDataBase(acc2);
		
		transaction.setMode(TransactionMode);
		
		txnDao.addToDataBase(transaction);
		
		return true;
		}
		
		else
			{
			System.out.println("Sorry!No Sufficient Funds are available");
			return false;
			}
		
		
	}
	
}
