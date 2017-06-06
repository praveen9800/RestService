package com.restapi;

import java.util.HashMap;
import java.util.Map;

import com.restapi.model.Account;

public class DatabaseClass {

	private static Map<Integer, Account> accounts = new HashMap<>();
	
	public static Map<Integer, Account> getAccounts() {
		return accounts;
	}
	
	
	
	
}
