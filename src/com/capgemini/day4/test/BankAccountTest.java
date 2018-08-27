package com.capgemini.day4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.BankAccount;
import com.capgemini.day4.CurrentBankAccount;
import com.capgemini.day4.SavingBankAccount;

class BankAccountTest {

	BankAccount account;
	BankAccount account1;

	@BeforeEach
	void setUp() {
		account = new SavingBankAccount("John Doe", 50000,true);
		account1 = new CurrentBankAccount("John Doe", 50000,10000);
	}

	@Test
	void testWithdraw() {
		assertEquals(45000.0, account.withdraw(5000), 0.02);
		assertEquals(38000.0, account.withdraw(7000), 0.02);
		assertEquals(33432.66, account.withdraw(4567.34), 0.02);
		assertEquals(33432.66, account.withdraw(120000), 0.02);
	}

	@Test
	void testDeposit() {
		assertEquals(55000.0, account.deposit(5000));
		assertEquals(59567.34, account.deposit(4567.34));
	}
	
	@Test
	void testTotalBankAccounts() {
		assertEquals(2, BankAccount.totalBankAccounts());
		BankAccount account1 = new BankAccount("Jane Doe", "SAVING", 34000);
		assertEquals(3, BankAccount.totalBankAccounts());
		BankAccount account2 = new BankAccount();
		BankAccount account3 = new BankAccount();
		assertEquals(5, BankAccount.totalBankAccounts());
	}

	@AfterEach
	void tearDown() {
		account = null;
		BankAccount.totalAccounts=0;
		
	}
}