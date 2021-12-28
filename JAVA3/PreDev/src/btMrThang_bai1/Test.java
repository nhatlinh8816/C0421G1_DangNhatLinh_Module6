package btMrThang_bai1;

public class Test {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Nam", 21, 6000, 100000, 500, 0);
		Employee employee2 = new Employee("Vy", 30, 4000, 100000, 260, 0);
		Employee employee3 = new Employee("Tuan", 21, 6000, 100000, 800, 1);
		//1
		System.out.println(employee1.getBonus(employee1.getSales())); 
		//2
		System.out.println(employee2.getBonus(employee2.getAmount()));
		//3
		System.out.println(employee3.getBonus(employee3.getPart(), employee3.getTypeEmployee()));
	}

}
