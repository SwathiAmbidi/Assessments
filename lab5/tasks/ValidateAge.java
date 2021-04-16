package lab5.tasks;

public class ValidateAge {
	
	private int age;
	public ValidateAge (int age) throws ValidateAgeException {
		
		
		
		if(age>15) {
			this.age = age;
		}
		else {
			throw new ValidateAgeException(age);
		}
	}

}
