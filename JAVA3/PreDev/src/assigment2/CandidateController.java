package assigment2;

import java.net.BindException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import assigment2.exception.BirthDayException;
import assigment2.exception.EmailException;



public class CandidateController {
	static Scanner scanner = new Scanner(System.in);
	static List<Candidate> candidateList =  new ArrayList<>();
	static CandidateManagement candidateManagement;
	private static String inputOutput(String message){
        System.out.println(message);
        String output = scanner.nextLine();
        return output;
    }
	public static void main(String[] args) {
		CandidateController.openMenu();
		
	}
	public static void openMenu() {
		
		int choice; 
		do {		
			System.out.println("----- Candidate Management -----");
			System.out.println("Please choice an option");
			System.out.println("1.Add an candidate");
			System.out.println("2.Display an candidate");
			System.out.println("3.Out");
			choice = CandidateController.inputChoice();
			switch (choice) {
			case 1:
				CandidateController.addCandidate();
				break;
			case 2:
				for (Candidate candidate : candidateList) {
					System.out.println(candidate.showInfo()+candidate.showMe());
				}
				break;
			default:
				break;
			}
		} while (choice!=3);
		System.out.println("Good bye!");
		
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
	
	public static void addCandidate() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int id;
		if (candidateList.isEmpty()) {
			id = 1;
		}else {
			id = candidateList.size()+1;
		}
		System.out.println("input name:");
		String name = scanner.nextLine(); 
		String birthday = null;
		try {
			birthday = CandidateController.inputBirthday();
		} catch (BirthDayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("input phone:");
		String phone = scanner.nextLine();
		String email = null ;
		try {
			 email = CandidateController.inputEmail();
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Certificate> certificateList = new ArrayList<Certificate>();
		int choiceCertificate;
		do {
			System.out.println("1.Add certificate");
			System.out.println("2.Save certificate ");
			choiceCertificate = CandidateController.inputChoice();
			switch (choiceCertificate) {
			case 1:
				new CentificateController().addCentificate(certificateList);
				break;
			default:
				break;
			}
		} while (choiceCertificate!=2);
		int candidateType;
		do {
			System.out.println("---Input number of type Candidate---");
			System.out.println("1.Experiece");
			System.out.println("2.Fresher");
			System.out.println("3.Intern");
			Scanner scanner = new Scanner(System.in);
			candidateType = scanner.nextInt();
		} while (candidateType!=1&&candidateType!=2&&candidateType!=3);
		switch (candidateType) {
		case 1:
			System.out.println("Input number of year experience");
			int expInYear;
			expInYear = Integer.parseInt(scanner.nextLine());
			String proSkill = inputOutput("Input proskill");
			Experience newExperience = new Experience(id, name, birthday , phone, email, candidateType, certificateList, expInYear, proSkill);
			candidateList.add(newExperience);	
//			try {
//				connection = JDBCApp.getConnect();
//				preparedStatement = connection.prepareStatement
//						("Insert into experience (candidateID,fullName,birthDay,phone,email,candidateType,certificates,expInYear,proSkill) "
//								+ " value (?,?,?,?,?,?,?,?,?) ");
//				preparedStatement.setInt(1, newExperience.getCandidateID());
//				preparedStatement.setString(2, newExperience.getFullName());
//				preparedStatement.setString(3, newExperience.getBirthDay());
//				preparedStatement.setString(4, newExperience.getPhone());
//				preparedStatement.setString(5, newExperience.getEmail());
//				preparedStatement.setInt(6, newExperience.getCandidateType());
//				preparedStatement.setInt(7, newExperience.getCertificates());
//				preparedStatement.setInt(8, newExperience.getExpInYear());
//				preparedStatement.setString(9, newExperience.getProSkill());
//				preparedStatement.executeUpdate();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			break;
		case 2:
			System.out.println("Input graduation date");
			String graduationDate;
			graduationDate = scanner.nextLine();
			System.out.println("Input graduation rank");
			String graduationRank;
			graduationRank = scanner.nextLine();
			String education = inputOutput("Input education");		
			candidateList.add(new Fresher(id, name, birthday, phone, email, candidateType, certificateList, graduationDate, graduationRank, education));	
			break;
		case 3:
			System.out.println("Input major");
			String major;
			major = scanner.nextLine();
			System.out.println("Input semester");
			String semester;
			semester = scanner.nextLine();
			String university = inputOutput("Input university");		
			candidateList.add(new Intern(id, name, birthday, phone, email, candidateType, certificateList, major, semester, university));	
			break;
		default:
			break;
		}
	}
	public static String inputEmail() throws EmailException   {
		System.out.println("---Input email---");
		String email;
		Scanner scanner = new Scanner(System.in);
		email = scanner.nextLine();
		if (!Pattern.matches("^\\w+@\\w+(\\.\\w+){1,2}$", email)) {
			throw new EmailException();
		}
		return email;
	}
	public static String inputBirthday() throws BirthDayException   {
		System.out.println("---Input birthday---");
		String birthDay;
		Scanner scanner = new Scanner(System.in);
		birthDay = scanner.nextLine();
		String[]date = birthDay.split("/");
		String year = date[2];
		int yearNum = Integer.parseInt(year);
		if (1900<= yearNum && yearNum <= 2021) {
			return birthDay;
		}else {
			throw new BirthDayException();
		}
		
	}
	
}