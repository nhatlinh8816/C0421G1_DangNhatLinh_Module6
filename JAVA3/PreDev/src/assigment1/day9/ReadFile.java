package assigment1.day9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
	static final String FILE_PATH = "G:\\JAVA3\\PreDev\\src\\assigment1\\day9\\STD.txt";
	static List<Student> students = new ArrayList<>();
	
	public List<Student> readFile() {
		File file = new File(FILE_PATH);
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			//khai bao doi tuong dong
	
			while ((line = bufferedReader.readLine())!=null ) {
				String[]result = line.split(",");
//				for (int i = 0; i < result.length; i++) {
//					System.out.println(result.length);
//					System.out.println(result[i]);
//					
//				}
				String id = result[0];
				String name = result[1];
				String phone = result[2];
				String email = result[3];
				int weight = Integer.parseInt(result[4]);
				students.add(new Student(id, name, phone, email, weight));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return students;

		
	}
	public static void main(String[] args) {
		ReadFile readFile = new ReadFile();
		List<Student> students = readFile.readFile();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
}
