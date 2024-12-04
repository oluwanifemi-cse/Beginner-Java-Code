//Oluwanifemi Maiorano

public class Ship {

	private String shipName;

	private String launchDate; // this will be in the month/day/year format, read as a String.

	// default constructor

	public Ship() {

		this.shipName = "Unknown";

		this.launchDate = "01/01/1990";

	}

	// parameterized Constructor

	public Ship(String xShipName, String xLaunchDate) {

		
		this.setShipName(xShipName);
		
		this.setLaunchDate(xLaunchDate);
		
		

	}

//accessors (getters)

	public String getShipName() {

		return this.shipName;

	}

	public String getLaunchDate() {

		return this.launchDate;

	}

//mutators (setters)

	public void setShipName(String xShipName) {

		if (xShipName != null) {

			this.shipName = xShipName;

		}

		else {

			System.out.println("Please enter a Ship Name.");

		}

	}

	public void setLaunchDate(String xLaunchDate) { // mm/dd/yyyy format

	try {
		
		int launchYear = Integer.parseInt(xLaunchDate.substring(6, 10)); // this will take the last 4 indexes of the
																		// string (the year) and turn it into an integer
																		// only for this mutator.
		

		if (launchYear >= 1990 && launchYear <= 2019) {

			this.launchDate = xLaunchDate; // because the years have to be between 1990 and 2019 inclusive, if they
											// match, then set this launch date to the one entered by the user

		}
		
		
		else {
			
			System.out.println("\nInvalid Launch Year Entered. Setting " +this.shipName +"'s launch date to default: 01/01/1990");
			
			
			}
		
		}catch(Exception StringIndexOutOfBoundsException) {
			
			
			
			System.out.println("\nError: Please enter your launch date in the \"mm//dd//yy\" format.");
			
		}

	
	}	
	
	//other methods
	
	
	//to string
	
	public String toString() {
		
		return "\nShip's Name: " + this.shipName;
		
		
	}
	
	

}
