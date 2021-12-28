package assigment1.day9;

public class Error {

	private String errorEmail;
	private String errorPhone;
	
	

	public Error( String errorEmail, String errorPhone) {
		super();

		this.errorEmail = errorEmail;
		this.errorPhone = errorPhone;
	}

	public Error() {
		super();
	}

	

	public String getErrorEmail() {
		return errorEmail;
	}

	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}

	public String getErrorPhone() {
		return errorPhone;
	}

	public void setErrorPhone(String errorPhone) {
		this.errorPhone = errorPhone;
	}

	@Override
	public String toString() {
		return "Error [ errorEmail=" + errorEmail + ", errorPhone=" + errorPhone + "]";
	}
	
	
	
	
	
	
}
