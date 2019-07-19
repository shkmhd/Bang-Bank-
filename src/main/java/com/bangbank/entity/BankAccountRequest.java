package com.bangbank.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_BANK_ACCOUNT_REQUEST")
public class BankAccountRequest {
	@Id
	@GeneratedValue
	@Column(name = "RequestId")
	private int BARid;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "MIDDLE_NAME")
	private String middleName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "FATHERS_NAME")
	private String fatherName;
	@Column(name = "MOBILE_NO")
	private long mobileNo;
	@Column(name = "EMAIL")
	private String emailId;
	@Column(name = "AADHAR_CARD_NUMBER")
	private long aadharCardNo;
	@Column(name = "DATE_OF_BIRTH")
	private Date DOB;
	@Column(name = "RESIDENTIAL_ADDRESS_ID")
	private String residentialAddress;
	@Column(name = "PERMENANT_ADDRESS_ID")
	private String permenantAddress;
	@Column(name = "OCCUPATION")
	private String occupation;
	@Column(name = "APPROVED")
	private String Approved;
	public int getBARid() {
		return BARid;
	}
	public void setBARid(int bARid) {
		BARid = bARid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getAadharCardNo() {
		return aadharCardNo;
	}
	public void setAadharCardNo(long aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public String getPermenantAddress() {
		return permenantAddress;
	}
	public void setPermenantAddress(String permenantAddress) {
		this.permenantAddress = permenantAddress;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getApproved() {
		return Approved;
	}
	public void setApproved(String approved) {
		Approved = approved;
	}
	public BankAccountRequest(int bARid, String title, String firstName, String middleName, String lastName,
			String fatherName, int mobileNo, String emailId, int aadharCardNo, Date dOB, String residentialAddress,
			String permenantAddress, String occupation, String approved) {
		super();
		BARid = bARid;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.aadharCardNo = aadharCardNo;
		DOB = dOB;
		this.residentialAddress = residentialAddress;
		this.permenantAddress = permenantAddress;
		this.occupation = occupation;
		Approved = approved;
	}
	public BankAccountRequest() {
		super();
	}
	@Override
	public String toString() {
		return "BankAccountRequest [BARid=" + BARid + ", title=" + title + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", fatherName=" + fatherName + ", mobileNo=" + mobileNo
				+ ", emailId=" + emailId + ", aadharCardNo=" + aadharCardNo + ", DOB=" + DOB + ", residentialAddress="
				+ residentialAddress + ", permenantAddress=" + permenantAddress + ", occupation=" + occupation
				+ ", Approved=" + Approved + "]";
	}
	

}
