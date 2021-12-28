package assigment2.exception;

public class BirthDayException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Year of Birthday mush between 1900 to 2021";
	}

}
