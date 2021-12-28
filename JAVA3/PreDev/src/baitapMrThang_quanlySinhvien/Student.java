package baitapMrThang_quanlySinhvien;

public class Student {
	private int id;
	private String firstName;
	private String midName;
	private String lastName;
	private String fullName;
	private String birthday;
	private int age;
	private String grade;
	
	public Student(int id, String firstName, String midName, String lastName, String fullName, String birthday, int age,
			String grade) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.birthday = birthday;
		this.age = age;
		this.grade = grade;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", midName=" + midName + ", lastName=" + lastName
				+ ", fullName=" + fullName + ", birthday=" + birthday + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
	
}
