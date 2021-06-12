package bank.accounts;

import java.util.Scanner;

import bank.pojo.Emp;
import bank.pojo.Money;

public class CurrentAccount {
	int salary;
	Emp e = new Emp();
	Money m = new Money();
	Scanner sc = new Scanner(System.in);
	int loan1;double loanamount;long totalloan;int withdraw; long balance; long n;

	public void salary() {
		System.out.println("Enter your Salary: ");
		salary=sc.nextInt();
		e.setSalary(salary);
		System.out.println("Your Salary is: "+e.getSalary());
	}

	public void loan() {
		if(salary > 1500000) {
			loanamount = salary * 0.15;
			totalloan = (long) (salary +loanamount);
			System.out.println("Loan Amount allocated: "+totalloan);
		}else if (salary>1000000) {
			loanamount = salary + 18/100;
			totalloan = (long) (salary +loanamount);
			System.out.println("Loan Amount allocated: "+totalloan);
		}else if (salary>500000) {
			loanamount = salary + 5/100;
			totalloan = (long) (salary + loanamount);
			System.out.println("Loan Amount allocated: "+totalloan);
		}else {
			System.out.println("Loan cannot be allocated for "+salary);
		}
	}
	
	public void withdraw() {
		System.out.println("Enter amount to withdraw: ");
		withdraw = sc.nextInt();
		m.setWithdraw(withdraw);
	}
	
	public void balance() {
		System.out.println("Your Account Balance");
		balance = salary - withdraw;
		m.setBalance(balance);
		System.out.println(balance);	
	}
}
