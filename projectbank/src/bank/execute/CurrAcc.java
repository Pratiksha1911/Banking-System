package bank.execute;

import java.util.Scanner;

import bank.accounts.CurrentAccount;

public class CurrAcc {
	Scanner sc = new Scanner(System.in);
	
	public void register() {
		int choice;
		CurrentAccount ca = new CurrentAccount();
		System.out.println("Enter 1: Salary Section");
		System.out.println("      2: Loan Section");
		System.out.println("      3: Withdraw Amount");
		System.out.println("      4: Check Balance");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			ca.salary();
			break;
			
		case 2:
			ca.loan();
			break;
			
		case 3:
			ca.withdraw();
			break;
			
		case 4:
			ca.balance();
			break;
		}while (choice!=0);
	}
}
