package assigment2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CentificateController {
	public static Scanner scanner =new Scanner(System.in);
	static List<Certificate> certificateList =  new ArrayList<>();
	public  void displayCentificate() {
		if (certificateList.size()==0) {
			System.out.println("Not any centifate");
		}
		for (Certificate certificate : certificateList) {
			System.out.println(certificate.toString());
		}
	}
	
	public void addCentificate(List<Certificate> certificateList) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int id;
		if (certificateList.size()==0) {
			id = 1;
		}else {
			id = certificateList.size()+1;
		}
		System.out.println("input centificate Name");
		String name = scanner.nextLine();
		System.out.println("input centificate Rank");
		String rank = scanner.nextLine();
		System.out.println("input centificate Date");
		String date = scanner.nextLine();
		Certificate newCertificate = new Certificate(id,name,rank,date);
		certificateList.add(newCertificate);
		try {
			connection = JDBCApp.getConnect();
			preparedStatement = connection.prepareStatement
					("Insert into centificate (certificatedID,certificateName,certificateRank,certificateDate) "
							+ " value (?,?,?,?) ");
			preparedStatement.setInt(1, newCertificate.getCertificatedID());
			preparedStatement.setString(2, newCertificate.getCertificateName());
			preparedStatement.setString(3, newCertificate.getCertificateRank());
			preparedStatement.setString(4, newCertificate.getCertificateDate());
			preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
