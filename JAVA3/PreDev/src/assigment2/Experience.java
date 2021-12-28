package assigment2;

import java.util.List;

public class Experience extends Candidate {
	private int expInYear;
	private String proSkill;
	

	public Experience() {
		// TODO Auto-generated constructor stub
	}



	public Experience(int expInYear, String proSkill) {
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}




	public Experience(int candidateID, String fullName, String birthDay, String phone, String email, int candidateType,
			List<Certificate> certificates, int expInYear, String proSkill) {
		super(candidateID, fullName, birthDay, phone, email, candidateType, certificates);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}



	public int getExpInYear() {
		return expInYear;
	}


	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}


	@Override
	public String showMe() {
		// TODO Auto-generated method stub
		return "Experience [expInYear=" + expInYear + ", proSkill=" + proSkill + "]";
	}



	
	
	


	
	
}


	


	


	
	




	




	




	




	

	
	
	

	
	
	
	

