package lab5.tasks;

public class ValidateAgeException extends Exception{
	
	ValidateAgeException (String s){
		super(s);
	}
	
	int inputAge;

	public ValidateAgeException(int inputAge) {
		super();
		this.inputAge = inputAge;
	}

	@Override
	public String toString() {
		return " Age below 15 is Invalid ";
	}
}
