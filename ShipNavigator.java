//Oluwanifemi Maiorano

import java.util.Scanner;

public class ShipNavigator {

	public static void main(String[] args) {

		// create the objects of the type CruiseShip and CargoShip

		Scanner key = new Scanner(System.in);

		System.out.println("Welcome to the Ship Navigator!");

		System.out.println(""); // empty print statement for spacing

	
		
		boolean goAgain = true;
	
		do {
		
		System.out.println("Enter the name of the Ship: ");

		String shipName = key.nextLine();

		System.out.println("");

		
		
		System.out.println("Enter the launch date of the Ship: ");

		String launchDate = key.nextLine();
		
		System.out.println("");

	
		
		System.out.println("Is this ship a Cruise Ship or Cargo Ship?");

		String shipType = key.nextLine();
		
		System.out.println("");

		
		
		//Cruise Ship Prints
		
		
		
		if (shipType.equalsIgnoreCase("Cruise Ship") || shipType.equalsIgnoreCase("Cruise")) { // if the user enters
																								// Cruise Ship or Cruise

			System.out.println("Enter the Ship's Passenger Capacity: ");

			int passengerCapacity = key.nextInt();
			
			System.out.println();

			
			
			System.out.println("How many Crew Members are on this ship? ");

			int crewMembers = key.nextInt();
			
			System.out.println("");

			
			
			
			System.out.println("Creating your Cruise Ship!");

		
			//created the cruise1 object here because i've got all the values given for the cruise1 parameter now.
			
			
			CruiseShip cruise1 = new CruiseShip(shipName, launchDate, passengerCapacity, crewMembers); 
			
			System.out.println("");
			
			System.out.println("Printing Details... ");
			
			System.out.println("");
			
			
			System.out.println(cruise1.toString());
			

		}
		
		
		
		//Cargo Ship Prints
		
		
		
		else if (shipType.equalsIgnoreCase("Cargo Ship") || (shipType.equalsIgnoreCase("Cargo"))) {
			
			
			System.out.println("Enter the Ship's Tonnage (DWT): ");
			
			int userEnteredTonnage = key.nextInt();
			
			
			System.out.println("");
			
		
			
			System.out.println("Enter the Ship's Maxmium Speed: ");
		
			double userEnteredMaxSpeed = key.nextDouble();
			
			
			
			
			System.out.println("Creating your Cargo Ship!");
			
			System.out.println("");
			
			
			CargoShip cargo1 = new CargoShip(shipName, launchDate, userEnteredTonnage, userEnteredMaxSpeed);
			
			
			System.out.println("\nPrinting Details...");
			
			System.out.println("");
			
			
			
			
			System.out.println(cargo1.toString());
			
			
			
			
			
			
			
		}
		
		
		
		
		else {
			
			
			System.out.println("Invalid Ship Type Entered. Exiting Program.");
			
			System.exit(0);
			
			
			
		}
		
		
		System.out.println("");
		
		key.nextLine(); //deals with the newline character logic error
		
		System.out.println("Do you want to construct another Ship?");
		
		String yesNo = key.nextLine();
		
		System.out.println();
		
		
		
		
		if(yesNo.equalsIgnoreCase("No")) {
			
			goAgain = false;
			
			
		}
		
		
		
		
	
	}while(goAgain == true);
		
		//FINISH CODE: only thing left is to put this in a do-while loop or while loop and then we done ganger !
		
		

		System.out.println("Thank you for participating! Goodbye!");
		
		
	}

}
