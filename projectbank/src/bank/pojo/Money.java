package bank.pojo;

public class Money {
	private int withdraw;
	public long balance;

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	
	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Money [withdraw=" + withdraw + ", balance=" + balance + "]";
	}
}
