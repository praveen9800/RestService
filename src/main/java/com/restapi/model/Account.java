package com.restapi.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {

   
    private int accNo;
    private String accName;
    private double amount;
    private String currency;
    private String accType;
    private String balType;
    
    public Account() {
    	
    }
    
   
	public Account(int accNo, String accName, double amount, String currency,String accType, String balType) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.amount = amount;
		this.currency = currency;
		this.accType=accType;
		this.balType=balType;
	}


	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getAccName() {
		return accName;
	}


	public void setAccName(String accName) {
		this.accName = accName;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAccType() {
		return accType;
	}


	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getBalType() {
		return balType;
	}


	public void setBalType(String balType) {
		this.balType = balType;
	}


	
}
