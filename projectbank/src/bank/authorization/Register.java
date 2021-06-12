package bank.authorization;

import java.util.HashMap;
import java.util.Scanner;

import bank.execute.CurrAcc;
import bank.execute.SavAcc;
import bank.pojo.Emp;

public class Register {
	HashMap<String, String> hm = new HashMap<String, String>();
	Scanner sc = new Scanner(System.in);
	String name;String email;String contact;String address;String password;
	CurrAcc c = new CurrAcc();
	SavAcc s = new SavAcc();

	public void Form() {	
		Emp e = new Emp();
		System.out.println("This is the Registration Form");
		System.out.println("Enter Name: ");
		name=sc.next();
		e.setName(name);
		System.out.println("Enter Email: ");
		email=sc.next();
		e.setEmail(email);
		System.out.println("Enter Contact: ");
		contact=sc.next();
		e.setContact(contact);
		System.out.println("Enter Address: ");
		address=sc.next();
		e.setAddress(address);
		System.out.println("Enter Password: ");
		password=sc.next();
		e.setPassword(password);	
		hm.put(email, password);
	}

	public void login() {
		System.out.println("Enter Credential for Login");
		System.out.println("Enter Email: ");
		email = sc.next();
		System.out.println("Enter Password: ");
		password = sc.next();
		if(hm.get(email)!=null && hm.get(email).equals(password)) {
			System.out.println("Successfully Login");
			int choice;
			do {
				System.out.print("Enter 1: Current Account");
				System.out.print("      2: Saving Account");
				choice=sc.nextInt();
				switch (choice) {
				case 1:
					c.register();
					break;

				case 2:
					s.sav();
					break;

				default:
					System.out.println("Enter Correct option");
					break;
				} 
			}while (choice!=0);
		}else {
			System.out.println("Wrong Credential");
		}
	}
}
