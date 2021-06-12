package bank.execute;

import java.util.Scanner;

import bank.accounts.SavingAccount;


public class SavAcc {
	Scanner sc = new Scanner(System.in);
	public void sav() {
		int choice;	
		SavingAccount sa = new SavingAccount();
		do {
			System.out.println("Enter 1: Deposit Amount");
			System.out.println("      2: Withdraw Amount");
			System.out.println("      3: Check Interest Amount");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				sa.deposit();
				break;

			case 2:
				sa.withdraw();
				break;

			case 3:
				sa.interest();
				break;

			default: 
				System.out.println("Select A valid Choice");
				break;

			}
		}while (choice!=0);
	}
}