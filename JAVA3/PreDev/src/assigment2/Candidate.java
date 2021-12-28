package assigment2;

import java.util.List;

public abstract class Candidate {
	public int candidateID;
	public String fullName;
	public String birthDay;
	public String phone;
	public String email;
	public static int candidateCount = 0;
	public int candidateType;
	public List<Certificate> certificates;
	

	public Candidate() {
	}


	public Candidate(int candidateID, String fullName, String birthDay, String phone, String email, int candidateType,
			List<Certificate> certificates) {
		super();
		this.candidateID = candidateID;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.candidateType = candidateType;
		this.certificates = certificates;
		candidateCount ++;
	}

	public int getCandidateID() {
		return candidateID;
	}

	public void setCandidateID(int candidateID) {
		this.candidateID = candidateID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
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

	
	
	public static int getCandidateCount() {
		return candidateCount;
	}




	public static void setCandidateCount(int candidateCount) {
		Candidate.candidateCount = candidateCount;
	}


	public int getCandidateType() {
		return candidateType;
	}



	public void setCandidateType(int candidateType) {
		this.candidateType = candidateType;
	}
	
	

	
	public List<Certificate> getCertificates() {
		return certificates;
	}



	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}


// phuong thuc showInfo hien thi thong tin
	public String showInfo() {
		return "Candidate [candidateID=" + candidateID + ", fullName=" + fullName + ", birthDay=" + birthDay
				+ ", phone=" + phone + ", email=" + email + ", candidateCount=" + candidateCount + ", candidateType="
				+ candidateType + ", certificate=" + certificates.toString() + "]";
	}
	
	public abstract String showMe();


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Candidate))
			return false;
		Candidate other = (Candidate) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	//equal and hashcode de so sanh

	



	
	
	
}
