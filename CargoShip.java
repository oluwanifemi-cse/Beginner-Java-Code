//Oluwanifemi Maiorano

public class CargoShip extends Ship {

	private double tonnage; // how much a ship can carry

	private double maxSpeed;

	public CargoShip() {

		super(); // this will call the initial parent default constructor (ship default
					// constructor)

		this.tonnage = 10; // 10 tons

		this.maxSpeed = 15; // 15mph

	}

	public CargoShip(String xShipName, String xLaunchDate, double xTonnage, double xMaxSpeed) {

		super(xShipName, xLaunchDate);


		this.setTonnage(xTonnage);
		
		this.setMaxSpeed(xMaxSpeed);
		
		
		
		

	}

	// accesors (getters)

	public double getTonnage() {

		return this.tonnage;

	}

	public double getMaxSpeed() {

		return this.maxSpeed;

	}
	
	
	// mutators (setters) 
	
	
	public void setTonnage(double xTonnage) {
		
		if(xTonnage > 0) { //tonnage can't ofc be 0 or lower
			
			this.tonnage = xTonnage;
			
		}
		
		
		else {
			
			System.out.println("Invalid Tonnage entered.");
			
		}
		
		
	}
	
	
	public void setMaxSpeed(double xMaxSpeed) {
		
		if(xMaxSpeed > 0) { //max speed can't be 0 or lower
			
			this.maxSpeed = xMaxSpeed;
			
			
		}
		
		
		else {
			
			System.out.println("Invalid Speed Entered.");
			
			
		}
		
		
		
	}
	
	
	public String toString() {
		
		return "Ship name: " + this.getShipName() + "\nTonnage: " +this.tonnage + " DWT" + "\nMaximum Speed: " +this.maxSpeed + " MPH";
		
		
	}
	
	

}
