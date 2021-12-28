package assigment2.exception;

public class EmailException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "wrong format. Please reinput";
	}
	
}
