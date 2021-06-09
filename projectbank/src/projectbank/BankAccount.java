package projectbank;

import java.util.Random;
import java.util.Scanner;

public class BankAccount {
	    String name;
	    String address;
	    String email_id;
		int contact_no ;
		String adhaar_no;
		String password;
		long depamount; long widamount; int total;
		int count = 0;
		int choice = 0;
		long totalamount;
		BankAccount ba[];
	
		
		
		BankAccount[] e = new BankAccount[20];
		Scanner sc = new Scanner(System.in);

		public void BankAccount() 
		{
			System.out.println("How Much Account you want to open");
			int n = sc.nextInt();
			ba = new BankAccount[n];
			for (int i = 0; i < ba.length; i++) 
			{
				System.out.println("Enter Your Name");
				name = sc.next();
				
				System.out.println("Enter Your Address");
				address = sc.next();
				
				System.out.println("Enter your Adhaar Number");
			    adhaar_no = sc.next();
				
				System.out.println("Enter your contact number");
			    contact_no = sc.nextInt();
				
				System.out.println("Enter your Email ID");
			    email_id = sc.next();
				
				ba[count] = new BankAccount();
				count++;
				
				String s = ba[i].getAdhaar_no();
				String account_no = new StringBuffer(s).reverse().toString();
				System.out.println("Your Account Number IS:"+account_no);
			}
			
			
		}
		
		
		
		private String getAdhaar_no() {
			// TODO Auto-generated method stub
			return null;
		}



		void login() {
			do {
				System.out.println("Login Credential");
				System.out.print("Enter Email: ");
				email_id=sc.next();
				System.out.print("Enter Password: ");
				password=sc.next();
			}
			while (email_id == password);
		}
		void randomNumbers(){
			Random value = new Random();
			String start = "BE";
			int r = value.nextInt(10);
			start += Integer.toString(r);

			int count = 0;
			int n = 0;
			for(int i=0;i<12;i++)
			{
				if(count==4) {
					start +=" ";
					count = 0;
				}
				else {
					n=value.nextInt(10);
					start += Integer.toString(n);
					count++;
				}

			}
		}
		void deposit() {

			Scanner sc = new Scanner(System.in);
			System.out.println("Your Total Amount IS :"+totalamount);
			System.out.println("========Enter your Deposite Amount========");
			depamount = sc.nextLong();
			totalamount = totalamount+depamount;
			System.out.println();
			System.out.println("Your Total Amount IS :"+totalamount);
			}
		void withdraw() {

			System.out.println("Your Total Amount IS :"+totalamount);
			System.out.println("========Enter your Withdrow Amount========");
			widamount = sc.nextLong();
			if(widamount>totalamount)
			{
				System.out.println("Sorry You don't have credit balance ");
				System.out.println("Your Total Amount IS :"+totalamount);
				overDraft();
			}
			else
			{
				totalamount = totalamount-widamount;
				System.out.println();
				System.out.println("Your Total Amount IS :"+totalamount);
			}
		}
		

		public void overDraft()
		{
			String option;
			System.out.println("========You want to use overdraft facility But Limit is 100000 only========");
			System.out.println("======================If Yes enter y or NO enter n=========================");
			option = sc.next(); 
			if(option.equals("y"))
			{
				System.out.println("Your Total Amount IS :"+totalamount);
				System.out.println("========Enter your Withdrow Amount========");
				widamount = sc.nextLong();
				if(widamount>100000)
				{
					System.out.println("Over Draft Limit is 100000");
					overDraft();
				}
				else
				{	
					totalamount = totalamount-widamount;
					System.out.println();
					System.out.println("Your Total Amount IS :"+totalamount);		
				}
				
			}
			
			else
			{
				System.out.println("========Wronge Option========");
			}
		}
		
		
		void balance() {
			totalamount = depamount - widamount;
			System.out.println(totalamount);
		}
		

		
		public void showAccountDetail() 
		{
			System.out.println("===============Your Account Details===============");
			System.out.println();
			for (int i = 0; i <ba.length; i++) 
			{
				System.out.println(ba[i]);
			}
		}

		
		void details() {

			do {


				System.out.println("=====Deposit 1:=====");
				
				System.out.println("=====Withdraw 2:=====");
				
				System.out.println("===== Check Balance 3:=====");
				
				System.out.println("=====View Details 4:=====");
				
				System.out.println("===== Update Details 5:=====");
				
				System.out.println("===== Delete Account 6:=====");
				
				System.out.println("Enter your Choice");
				
				choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					deposit();
					break;

				case 2:
					withdraw();
					break;

				case 3:
					balance() ;
					break;

				case 4:
					BankAccount();
					System.out.println();
					System.out.println();
					break;
					

				case 5:
					System.out.println("Enter email for Update");
					String email = sc.next();
					for(BankAccount j:e) {
						if(j!=null && j.email_id == email) {
							System.out.print("Enter Name: ");
							j.name=sc.next();
							System.out.print("Enter Email: ");
							j.email_id=sc.next();
							System.out.print("Enter Contact: ");
							j.contact_no=sc.nextInt();
							System.out.println("Enter Address: ");
							j.address=sc.next();
							System.out.println();
						}
					}
					break;

				case 6:
					System.out.println("Enter email For DELETE EMP");
					email=sc.next();
					for(int i=0;i<e.length;i++) {
						if (e[i]!=null && e[i].email_id==email) {
							e[i]=null;
						}
					}
					break;	

				default:
					System.out.println("Wrong Choice");
					break;
					
				}
			}
			while (choice!=0);
		}
	


		public static void main(String[] args) {
			BankAccount g = new BankAccount();
			g.randomNumbers();
			g.login();
			g.details();
		}
		}
