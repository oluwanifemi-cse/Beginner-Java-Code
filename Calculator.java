
import java.util.Scanner;

public class Calculator {

	private double result;

	private double precision = 0.0000001;

	// default constructor

	public Calculator() {

		this.result = 0;
	}

	// parametereized constructor

	public Calculator(double xResult) {

		this.setResult(xResult);

	}

	// accessor

	public double getResult() {

		return this.result;

	}

	// mutator

	public void setResult(double xResult) {

		this.result = xResult;

	}

	public void calculate() {

		boolean done = false;

		Scanner key = new Scanner(System.in);

		while (!done) {

			System.out.println("Result = " + this.result);

			// op = operator

			char op = key.next().charAt(0); // using the "char" (character) variable type since were just wanting an
											// operator

			if (op == 'E' || op == 'e') { // to read a char, do it exactly how its done right here

				System.out.println("Exiting the Program!");

				done = true;

			}

			else {

				double num2 = key.nextDouble();

				try { // go ahead and TRY running this code, if it fails, that run excep

					this.result = evaluate(op, this.result, num2);

				}

				catch (DivideByZeroException e) { // prints error code

					System.out.println(e.getMessage());

				}

				catch (UnknownOperatorException e) {

					System.out.println(e.getMessage());

				}

				catch (Exception e) {

					System.out.println(e.getMessage());

				}

				finally {

					// code that ALWAYS runs

				} // end of finally

			} // end of else

		} // end of while loop

	}

	public double evaluate(char op, double num1, double num2) throws DivideByZeroException, UnknownOperatorException { // we
																														// included
																														// this
																														// for
		// the divison case

		double answer = 0;

		switch (op) {

		case '+': // addition

			answer = num1 + num2;

			break;

		case '-': // subtractiion

			answer = num1 - num2;

			break;

		case '*': // multiplication

			answer = num1 * num2;

			break;

		case '/': // division

			if (num2 < precision && num2 > -precision) { // (-precision) means negative of the value precision

				// throw exception

				throw new DivideByZeroException();

			}

			else { // meaning this answer is not close to the true value of 0

				answer = num1 / num2;

			}

			break;

		default:
			throw new UnknownOperatorException();

		}

		return answer;

	}

	// other methods

	// overloading methods (both have the same construction name and variable name

	public double calc(double s) {

		return s;

	}

	// wrapper classes

	public double calc(String s) { // converting string to number

		double num = Double.parseDouble(s); // s - string, what this code does is tkes whatever is of S and sets it to a
											// double?

		return num;

	}

	public int calc2(String s) {

		int num = 5 + Integer.parseInt(s); // converts the string (s) to an integer, double, or any primitiive type

		return num;

	}

}
