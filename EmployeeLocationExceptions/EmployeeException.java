package day7.task1;

public class EmployeeException extends Exception{

	private String msg;
	@Override
	public String toString() {
		return "EmployeeException [msg=" + msg + "]";
	}
	public EmployeeException() {
		super();
	}
	public EmployeeException(String message) {
		super(message);
		this.msg = message;
	}
}
