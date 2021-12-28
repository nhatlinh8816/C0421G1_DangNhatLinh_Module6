package btMrThang_bai1;

public class Employee {
	private String nameString;
	private int amount;
	private double sales;
	private double salary;
	private int part;
	private int typeEmployee;
	
	
	
	
	


	public Employee(String nameString, int amount, double sales, double salary, int part, int typeEmployee) {
		this.nameString = nameString;
		this.amount = amount;
		this.sales = sales;
		this.salary = salary;
		this.part = part;
		this.typeEmployee = typeEmployee;
	}




	public Employee() {
	}




	public String getNameString() {
		return nameString;
	}




	public void setNameString(String nameString) {
		this.nameString = nameString;
	}




	public int getAmount() {
		return amount;
	}




	public void setAmount(int amount) {
		this.amount = amount;
	}




	public double getSales() {
		return sales;
	}




	public void setSales(double sales) {
		this.sales = sales;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	




	public int getPart() {
		return part;
	}




	public void setPart(int part) {
		this.part = part;
	}




	public int getTypeEmployee() {
		return typeEmployee;
	}




	public void setTypeEmployee(int typeEmployee) {
		this.typeEmployee = typeEmployee;
	}



	//1
	public double getBonus(double sales) {
		double bonus = 0;
		if (sales > 5000) {
			return bonus = 0.05*sales;
		}
		return bonus;
	}
	
	//2
	public double getBonus(int amount) {
		double bonus = 0;
		if (amount > 25) {
			return bonus = 100*amount+50*(amount-25);
		}else if (amount>0) {
			return bonus = 100*amount;
		}else {
			return bonus;
		}
	}
	//3. 0: parttime; 1: fulltime
	
	public double getBonus(int part,int typeEmployee) {
		double bonus = 0;
		if (part>250&&typeEmployee==0) {
			return bonus = 0.01*part;
		}
		if (part>700&&typeEmployee==1) {
			return bonus = 0.01*part;
		}
		return bonus;
	}
	
	
	
	
}
