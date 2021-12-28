package assigment2;

import java.util.List;

public class Intern extends Candidate {
	private String major;
	private String semester;
	private String university;
	
	
	public Intern() {
	}




	public Intern(int candidateID, String fullName, String birthDay, String phone, String email, int candidateType,
			List<Certificate> certificates, String major, String semester, String university) {
		super(candidateID, fullName, birthDay, phone, email, candidateType, certificates);
		this.major = major;
		this.semester = semester;
		this.university = university;
	}




	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}


	@Override
	public String showMe() {
		// TODO Auto-generated method stub
		return "Intern [major=" + major + ", semester=" + semester + ", university="
		+ university + "]";
	}

	
}
