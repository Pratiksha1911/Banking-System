package bank.pojo;

public class Emp {
	private int id;
	private String name;
	private String email;
	private String contact;
	private String address;
	private String password;
	private int salary;
	private String rateofinterest;
	private String loan;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRateofinterest() {
		return rateofinterest;
	}
	public void setRateofinterest(String rateofinterest) {
		this.rateofinterest = rateofinterest;
	}
	public String getLoan() {
		return loan;
	}
	public void setLoan(String loan) {
		this.loan = loan;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", address=" + address
				+ ", password=" + password + ", salary=" + salary + ", rateofinterest=" + rateofinterest + ", loan="
				+ loan + "]";
	}
}