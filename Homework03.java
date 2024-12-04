//written by Oluwanifemi Maiorano

package homeworkAssignments;

import java.util.Scanner;

import java.util.Random;

public class Homework03 {

	public static final int MAX = 3;

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		Random r = new Random();

		System.out.println("Let\'s place rock paper scissors!!!");

		System.out.println("");

		// empty line once again for spacing
		
		
		
		String userResponse;
		
		do {
			
			int scoreProgram = 0;
			
			int scoreUser = 0;
			
			System.out.println("");
			
			System.out.println("We will play a best out of 3!");
			
			System.out.println("");
			
			System.out.println("Let\'s begin!");
		
		
		for (int rounds = 0; rounds < 3; rounds++) 
		
		{

			System.out.println("");

			System.out.println("Rock, Paper, Scissors...");

			System.out.println("");

			System.out.println("Shoot!");

			System.out.println();

			System.out.println("(Type below: Rock, Paper, or Scissors)");

			String RPS = key.next();

			int programRPS = r.nextInt(MAX);

			int rock = 0;
			
			int paper = 1;
			
			int scissors = 2;
			
			
			if (programRPS == rock)
					
				//if the program picks rock, these are the outcomes
			{
				if(RPS.equalsIgnoreCase("rock"))
					//if the user picks rock
					
				{
					System.out.println("");
					
					System.out.println("We tied! No points to either of us! I chose rock!");
				
					System.out.println("");
					
					System.out.println("The score is " +scoreProgram + "-" +scoreUser);
				}
			
				if(RPS.equalsIgnoreCase("paper"))
					//if the user picks paper
				
				{
					
					System.out.println("");
					
					System.out.println("Dang it... i lost this round! I chose rock!");
					
					scoreUser++;
					
					
					System.out.println("");
					
					System.out.println("The score is now " +scoreProgram +"-" +scoreUser);
					
				}
				
				if(RPS.equalsIgnoreCase("scissors"))
					//if the user picks scissors
				
				{
					
					System.out.println("");
					
					System.out.println("I win this round!!! I chose rock!");
					
					scoreProgram++;
					
					System.out.println("");
					
					System.out.println("The score is now "+scoreProgram +"-" +scoreUser);
				
				
				}
				
				else if (!RPS.equalsIgnoreCase("rock") && !RPS.equalsIgnoreCase("paper") && !RPS.equalsIgnoreCase("scissors"))
				{
					System.out.println();
					
					System.out.println("You didn't enter Rock Paper or Scissors! I get an automatic point!");
				
					System.out.println();
					
					scoreProgram++;
					
					System.out.println("The score is now "+scoreProgram +"-" +scoreUser);
				}
				
				
			}
			
			if (programRPS == paper)
				//if the program chooses paper, these are the outcomes
			{
				
				
				if (RPS.equalsIgnoreCase("rock"))
				{
					System.out.println("");
					
					System.out.println("I win this round!!! I chose paper!");
					
					scoreProgram++;
					
					System.out.println("");
					
					System.out.println("The score is now "+scoreProgram +"-" +scoreUser);
					
				}
				
				if (RPS.equalsIgnoreCase("paper"))
				{
					
					System.out.println("");
					
					System.out.println("We tied! No points to either of us! I chose paper!");
					
					System.out.println("");
					
					System.out.println("The score is " +scoreProgram + "-" +scoreUser);
					
				}
				
				if (RPS.equalsIgnoreCase("Scissors"))
					
				{
					System.out.println("");
					
					
					System.out.println("Dang it!!! I chose paper! I lost this round!");
					
					scoreUser++;
					
					System.out.println("");
					
					System.out.println("The score is now " +scoreProgram +"-" +scoreUser);
					
				}
				
				else if (!RPS.equalsIgnoreCase("rock") && !RPS.equalsIgnoreCase("paper") && !RPS.equalsIgnoreCase("scissors"))
				
				//since doing "else" will make the program account for cases where the user types "Rock" or "rock", use 
					
					//else if and simply translate it to: "if the answer entered is not rock, paper, or scissors, then:" 
					
					//this will be how the program determines if it will give a point to itself, since the problem asks for us
					
					//to make the program give itself a point if the user enters the wrong thing.
				
				{
					System.out.println();
					
					System.out.println("You didn't enter Rock Paper or Scissors! I get an automatic point!");
				
					System.out.println();
					
					scoreProgram++;
					
					System.out.println("The score is now "+scoreProgram +"-" +scoreUser);
				}
				
				
			}			
		
			if (programRPS == scissors)
			{
		
				if (RPS.equalsIgnoreCase("rock"))
				{
					System.out.println("");
					
					System.out.println("Dang it man! I chose scissors!");
					
					scoreUser++;
					
					System.out.println("");
					
					System.out.println("The score is now "+scoreProgram +"-" +scoreUser);
					
					
				}
				
				if (RPS.equalsIgnoreCase("paper"))
				{
					System.out.println("");
					
					System.out.println("Hah I win this round! I chose scissors");
					
					scoreProgram++;
					
					System.out.println("");
					
					System.out.println("The score is now "+scoreProgram +"-"+scoreUser);
					
				}
				
				if (RPS.equalsIgnoreCase("scissors"))
				{
					
					System.out.println("");
					
					System.out.println("Welp we tied! I chose scissors as well!");
					
					System.out.println("");
					
					System.out.println("The score is "+scoreProgram +"-"+scoreUser);
				}
				
				else if (!RPS.equalsIgnoreCase("rock") && !RPS.equalsIgnoreCase("paper") && !RPS.equalsIgnoreCase("scissors"))
				{
					System.out.println();
					
					System.out.println("You didn't enter Rock Paper or Scissors! I get an automatic point!");
				
					System.out.println();
					
					scoreProgram++;
					
					System.out.println("The score is now "+scoreProgram +"-" +scoreUser);
				}
				
				
			}
				
				
			
			
			
			
				
				
				
				
				//ignore this for the time being but this will ask the user if they want to play again
				
				
			if (scoreProgram == 2 && scoreUser == 0)
			{
				
				System.out.println("");
				
				System.out.println("I win automatically! I'm up 2-0! You wouldn't be able to comeback!");
				
				rounds = 2;
				
			}
			
			
			if (scoreUser == 2 && scoreProgram ==0 )

			{
				System.out.println("");
				
				System.out.println("Dang...you beat me 2-0... I automatically lose...");
			
				 rounds = 3;
			
			}
			
		} //end of for loop
			
			
			if (scoreProgram > scoreUser)
			{
				System.out.println("");
				
				System.out.println("I won! Woohoo! ");
			}
			
			if (scoreProgram == scoreUser)
			{
				System.out.println("");
				
				System.out.println("Welp... we tied! No winner!");
			}
			
			if (scoreProgram < scoreUser)
				
			{
				System.out.println("");
				
				System.out.println("Dang it man! I lost!!");
			}
			
			
			
		
		
		
	
		System.out.println("");
		
		System.out.println("Would you like to play again?");
		
		userResponse = key.next();

		}while(userResponse.equalsIgnoreCase("yes"));

		
		System.out.println("Thank you for playing! I hope to see you again!");
		
		System.exit(0);
		
		
	}

}
