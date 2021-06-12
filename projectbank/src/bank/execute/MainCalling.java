package bank.execute;

import java.util.Scanner;
import bank.authorization.Register;


public class MainCalling {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Register r = new Register();

		do {
			System.out.println("Enter 1: Registration");
			System.out.println("      2: Login");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				r.Form();
				break;

			case 2:
				r.login();
				break;

			default:
				System.out.println("Enter Correct option");
				break;
			}
		}while (choice!=0);
	}
}