package assigment1.day9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class WriteFile {
	static final String FILE_PATH = "G:\\JAVA3\\PreDev\\src\\assigment1\\day9\\error.txt";
	static final String EMAIL_REGEX = "^\\w+@\\w+(\\.\\w+){1,2}$";
	static final String PHONE_REGEX = "^(091)[\\d]{7}$";
	static List<Error> errors = new ArrayList<>();
	static final String NEWLINE = "\n";
	static final String COMMA = ",";
	public void writeFile() {
		File file = new File(FILE_PATH);
		FileWriter fileWriter = null;
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			List<Student> students = new ReadFile().readFile();
			String errorEmail = "";
			String errorPhone = "";
			for (Student student : students) {
				if (!Pattern.matches(EMAIL_REGEX, student.getEmail())) {
					errorEmail = "Wrong format email";
				}else {
					errorEmail = "";
				}
				if (!Pattern.matches(PHONE_REGEX, student.getPhone())) {
					errorPhone = "Wrong format phone";
				}else {
					errorPhone = "";
				}
				errors.add(new Error(errorEmail,errorPhone));
			}
			for (Error error : errors) {
				System.out.println(error);
			}
			fileWriter = new FileWriter(file,true);
			for (int i = 0; i < errors.size(); i++) {
				fileWriter.append("Line "+ String.valueOf(i+1)+":");
				fileWriter.append(errors.get(i).getErrorEmail());
				fileWriter.append(COMMA);
				fileWriter.append(errors.get(i).getErrorPhone());
				fileWriter.append(NEWLINE);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new WriteFile().writeFile();
	}
}
