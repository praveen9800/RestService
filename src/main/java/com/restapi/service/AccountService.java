package com.restapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.restapi.DatabaseClass;
import com.restapi.model.Account;

public class AccountService {

	private Map<Integer, Account> accounts = DatabaseClass.getAccounts();
	
	public AccountService() {
		accounts.put(12345, new Account(12345,"Reka",120000.00,"INR","Investment Account", "Credit"));
		accounts.put(22312, new Account(22312,"Ram",87000.12,"INR","Savings Account","Debit"));
		accounts.put(30945, new Account(30945,"Bala",1000.1,"USD","Term Deposit","Credit"));
	}
	
	
	public List<Account> getAllAccounts() {
		return new ArrayList<Account>(accounts.values()); 
	}
	
	public Account getAccount(int accNo) {
		return accounts.get(accNo);
	}
	
	
	
	public Account addAccount(Account account) {
		//account.setAccNo(accounts.size()+1);
		accounts.put(account.getAccNo(), account);
		return account;
	}
	
}
