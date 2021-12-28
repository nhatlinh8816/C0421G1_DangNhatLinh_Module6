package baitapMrThang_quanlySinhvien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assigment2.Candidate;
import assigment2.CandidateController;

public class StudentController {
	public static List<Student> students = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);
	
	private static String inputOutput(String message){
        System.out.println(message);
        String output = scanner.nextLine();
        return output;
    }
	
	public static void main(String[] args) {
		StudentController.openMenu();
		
	}
	
	public static int inputChoice() {
		
		int choice = 0;
		boolean check = false;
		while (!check) {
			try {
				System.out.println("Input your choice");
				Scanner scanner = new Scanner(System.in);
				choice = scanner.nextInt();
				check = true;
			} catch (Exception e) {
				System.out.println("\"The system has encountered an unexpected problem, sincerely sorry !!!�");;
				check = false;
			}
		}
		return choice;
	}
	
	public static void openMenu() {
		
		int choice; 
		do {		
			System.out.println("---Student Management---");
			System.out.println("Please choose option");
			System.out.println("1.Display list of student");
			System.out.println("2.Add student");
			System.out.println("3.Delete student");
			System.out.println("4.Edit student");
			System.out.println("5.Find student by id");
			System.out.println("6.Find student by name");
			System.out.println("7.Find student by grade");
			System.out.println("8.Out");
			choice = StudentController.inputChoice();
			switch (choice) {
			case 1:
				StudentController.display();
				break;
			case 2:
				StudentController.create();
				break;
			case 3:
				int deleteId =Integer.parseInt(inputOutput("input id of student you want delete")) ;
				StudentController.delete(deleteId);
				break;
			case 4:
				int editId =Integer.parseInt(inputOutput("input id of student you want delete")) ;
				StudentController.edit(editId);
				break;
			case 5:
				int id =Integer.parseInt(inputOutput("input id")) ;
				StudentController.findById(id);
				break;
			case 6:
				String name = inputOutput("input name");
				StudentController.findByName(name);
				break;
			case 7:
				StudentController.findByGrade();
				break;
			}
		} while (choice!=8);
		System.out.println("Good bye!");
		
	}

	private static void findByGrade() {
		// TODO Auto-generated method stub
		
	}

	private static void findByName(String name) {
		List<Student> students = new ArrayList<Student>();
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		Student student = null;
		try {
			connection = JDBCApp.getConnect();
			preparedStatement = connection.prepareStatement ("select * from Student where lastName like ?");
			preparedStatement.setString(1, "%"+name+"%");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				student = new Student();
				student.setId(resultSet.getInt("id"));
				student.setFirstName(resultSet.getString("firstName"));
				student.setMidName(resultSet.getString("midName"));
				student.setLastName(resultSet.getString("lastName"));
				student.setFullName(resultSet.getString("fullName"));
				student.setBirthday(resultSet.getString("birthday"));
				student.setAge(resultSet.getInt("age"));
				student.setGrade(resultSet.getString("grade"));
				students.add(student);
			}
			for (Student studentObj : students) {
				System.out.println(studentObj);
			}
			if (students.isEmpty()) {
				System.out.println("Not Found");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	private static Student findById(int id) {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		Student student = null;
		try {
			connection = JDBCApp.getConnect();
			preparedStatement = connection.prepareStatement ("select * from Student where id = ?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				student = new Student();
				student.setId(resultSet.getInt("id"));
				student.setFirstName(resultSet.getString("firstName"));
				student.setMidName(resultSet.getString("midName"));
				student.setLastName(resultSet.getString("lastName"));
				student.setFullName(resultSet.getString("fullName"));
				student.setBirthday(resultSet.getString("birthday"));
				student.setAge(resultSet.getInt("age"));
				student.setGrade(resultSet.getString("grade"));
				return student;
			}else {
				System.out.println("not found");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
		
	}

	private static void edit(int id) {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		String firstName = inputOutput("input first name");
		String midName = inputOutput("input mid name");
		String lastName = inputOutput("input last name");
		String fullName = inputOutput("input full name");
		String birthday = inputOutput("input birthday");
		int age =Integer.parseInt(inputOutput("input age")) ;
		String grade = inputOutput("input grade");
		Student student = StudentController.findById(id);
		if (student!=null) {
			try {
				connection = JDBCApp.getConnect();
				preparedStatement = connection.prepareStatement 
						("update Student set id = ?,firstName=?,midName=?,lastName=?,fullName=?,birthday=?,age=?,grade=? where id = ? ");
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, firstName);
				preparedStatement.setString(3, midName);
				preparedStatement.setString(4, lastName);
				preparedStatement.setString(5, fullName);
				preparedStatement.setString(6, birthday);
				preparedStatement.setInt(7, age);
				preparedStatement.setString(8, grade);
				preparedStatement.setInt(9, id);
				preparedStatement.executeUpdate();
				System.out.println("update success");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			System.out.println("update failed");
		}
		
	}


	private static void delete(int id) {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		Student student = StudentController.findById(id);
		if (student!=null) {
			try {
				connection = JDBCApp.getConnect();
				preparedStatement = connection.prepareStatement ("delete from Student where id = ?");
				preparedStatement.setInt(1, id);
				preparedStatement.executeUpdate();
				System.out.println("Delete success");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			System.out.println("Delete failed");
		}
		
	}

	private static void create() {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		int id =Integer.parseInt(inputOutput("input id")) ;
		String firstName = inputOutput("input first name");
		String midName = inputOutput("input mid name");
		String lastName = inputOutput("input last name");
		String fullName = inputOutput("input full name");
		String birthday = inputOutput("input birthday");
		int age =Integer.parseInt(inputOutput("input age")) ;
		String grade = inputOutput("input grade");
		
		try {
			connection = JDBCApp.getConnect();
			preparedStatement = connection.prepareStatement ("insert into Student values(?,?,?,?,?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, firstName);
			preparedStatement.setString(3, midName);
			preparedStatement.setString(4, lastName);
			preparedStatement.setString(5, fullName);
			preparedStatement.setString(6, birthday);
			preparedStatement.setInt(7, age);
			preparedStatement.setString(8, grade);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static void display() {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		try {
			connection = JDBCApp.getConnect();
			preparedStatement = connection.prepareStatement("Select * from Student");
			ResultSet resultSet = preparedStatement.executeQuery();
			Student student;
			while (resultSet.next()) {
				student = new Student();
				student.setId(resultSet.getInt("id"));
				student.setFirstName(resultSet.getString("firstName"));
				student.setMidName(resultSet.getString("midName"));
				student.setLastName(resultSet.getString("lastName"));
				student.setFullName(resultSet.getString("fullName"));
				student.setBirthday(resultSet.getString("birthday"));
				student.setAge(resultSet.getInt("age"));
				student.setGrade(resultSet.getString("grade"));
				students.add(student);
			}
			for (Student studentObj : students) {
				System.out.println(studentObj);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			JDBCApp.closeConnection(connection);
		}
	
	}


}
