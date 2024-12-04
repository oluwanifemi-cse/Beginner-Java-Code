//Oluwanifemi Maiorano

public class CruiseShip extends Ship {

	private int passengerCapacity;

	private int crewMembers;

	public CruiseShip() {

		super(); // this should be calling the (Ship) default constructor, so those values such
					// as name and launch date should already be assigned

		this.passengerCapacity = 0;

		this.crewMembers = 0;

	}

	public CruiseShip(String xShipName, String xLaunchDate, int xPassengerCapacity, int xCrewMembers) {

		super(xShipName, xLaunchDate); // this SHOULD go to the parameterized constructor in the Ship Parent class and
										// now assign ship name and launch date.
		
		
		this.setPassengerCapacity(xPassengerCapacity);
		
		this.setCrewMemberAmount(xCrewMembers);
		
		

	}

	// accessors (getters)

	public int getPassengerCapacity() {

		return this.passengerCapacity;

	}

	public int getCrewMembers() {

		return this.crewMembers;

	}

	
	
	
	
	
	// mutators (setters)

	public void setPassengerCapacity(int xPassengerCapacity) {

		if (xPassengerCapacity > 0) { // the passenger amount cant be 0 or lower

			this.passengerCapacity = xPassengerCapacity;

		}

		else {

			System.out.println("Invalid Capacity Entered.");

		}

	}

	public void setCrewMemberAmount(int xCrewMembers) {

		if (xCrewMembers > 0) { // the crew members amount also can't be 0 or lower

			this.crewMembers = xCrewMembers;

		}

		else {

			System.out.println("Invalid Crew Member Amount Entered.");

		}

	}
	
	
	
	//other methods
	
	
	
	//toString method
	
	
	//this toString method overrides the toString method in SHIP
	
	public String toString() {
		
		
		return "Ship name: " + this.getShipName() + "\nPassenger Capacity: " +this.passengerCapacity + "\nCrew Members: " + this.crewMembers;
		
		
	}
	
	
	
	//ASK QUESTION: ask if she wants us to display the Launch date or not. 
	
	// dont display launch date
	

}
