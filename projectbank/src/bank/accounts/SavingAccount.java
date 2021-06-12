package bank.accounts;

import java.util.Scanner;

public class SavingAccount {
	double amount;double withdrawAmount;double withdraw;double interest;
	Scanner sc = new Scanner(System.in);

	public double deposit() {
		System.out.println("Enter Amount: ");
		amount=sc.nextDouble();
		
		return amount;
	}

	public void withdraw() {
		System.out.println("Enter Amount: ");
		withdrawAmount=sc.nextDouble();

		if(withdrawAmount<amount) {
			withdraw = amount - withdrawAmount ;
			System.out.println("Your Availabe Balance: "+withdraw);
		}else {
			System.out.println("You have insufficient balance & Your Available balance: "+amount);
		}
	}

	public void interest() {
		if(amount>10000 || withdraw>10000) {
			amount = amount * 3/100;
			System.out.println("Interest Amount for this month: "+amount);
		}else {
			System.out.println("You are not eligible for interest scheme");
		}
	}
}