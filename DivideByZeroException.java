
public class DivideByZeroException extends Exception {

	public DivideByZeroException() {

		super("Cannot divide by zero!");

	}
	
	public DivideByZeroException(String msg) {
		
		super(msg);
		
	}

}
