package com.restapi;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restapi.model.Account;
import com.restapi.service.AccountService;

@Path("/")
public class AccountResource {

	AccountService accountService = new AccountService();
	
	@GET
	@Path("/accounts")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Account> getAccounts() {
		
		System.out.println ("Req: Get All Accounts");
		return accountService.getAllAccounts();
				
	}

	@POST
	@Path("/accounts")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Account addAccount(Account account) {
		System.out.println ("Req: Add Account");
		return accountService.addAccount(account);
	}
	
	
	@GET
	@Path("accounts/{accNo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Account getAccountInfo(@PathParam("accNo") Integer accNo) {
		System.out.println ("Req: Get Account Details");
		return accountService.getAccount(accNo);
		
	}
	
	public static void main(String args[]){
		System.out.println("Application Started");
	}
	
}
