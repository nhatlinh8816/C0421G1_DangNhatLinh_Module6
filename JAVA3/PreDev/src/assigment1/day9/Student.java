package assigment1.day9;

public class Student {
	private String id;
	private String name;
	private String phone;
	private String email;
	private int weight;
	
	public Student(String id, String name, String phone, String email, int weight) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.weight = weight;
	}

	public Student() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", weight=" + weight
				+ "]";
	}
	
	
	
	
}
