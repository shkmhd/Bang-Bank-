package com.bangbank.dto;

import java.util.Date;

import com.bangbank.entity.BankAccount;

public class TransactionDTO {
	
	
	private long frmAccNo;
	
	private long toAccNo;
	
	private double amt;
	
	private Date trnDate;

	private String mode;
	
	private String remarks;
	
	
	public long getFrmAccNo() {
		return frmAccNo;
	}
	public void setFrmAccNo(Long frmAccNo) {
		this.frmAccNo = frmAccNo;
	}
	public long getToAccNo() {
		return toAccNo;
	}
	public void setToAccNo(long toAccNo) {
		this.toAccNo = toAccNo;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public Date getTrnDate() {
		return trnDate;
	}
	public void setTrnDate(Date trnDate) {
		this.trnDate = trnDate;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Transaction [" +"frmAcc=" + frmAccNo + ", toAccNo=" + toAccNo + ", amt="
				+ amt + ", trnDate=" + trnDate + ", mode=" + mode + ", remarks=" + remarks + "]";
	}
	public TransactionDTO(int transactionId, long frmAccNo, long toAccNo, double amt, Date trnDate, String mode,
			String remarks) {
		
		
		this.frmAccNo = frmAccNo;
		this.toAccNo = toAccNo;
		this.amt = amt;
		this.trnDate = trnDate;
		this.mode = mode;
		this.remarks = remarks;
	}
	public TransactionDTO() {
	}
	
}