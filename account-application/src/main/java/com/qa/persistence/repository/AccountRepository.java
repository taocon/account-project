package com.qa.persistence.repository;

public interface AccountRepository {

	String getAllAccounts();
	String createAccount(String accout);
	String deleteAccount(Long id);
	String updateAccount(Long id, String accountToUpdate);

}