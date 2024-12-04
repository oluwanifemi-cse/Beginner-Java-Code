package homeworkAssignments;

//written by Oluwanifemi Maiorano

import java.util.Scanner;

public class Homework2 {
	
	public static void main(String[] args) {		
		
	
		
		
		
		//REMEMBER TO IMPLEMENT GOLD DIGGER ENDING IN EACH ONE
		//each scenario has to mention the fact that the furniture was nice and thats why the man decided that you were a gold digger
		//when you pick back up, make sure to finish the endings and correct spelling errors and such.
		
		
		//finish creating endings
		
		
		
		
		
		
		
		Scanner key = new Scanner(System.in);
		

		
		
		System.out.println("You came here because you wish to play this adventure, right?");
		
		System.out.println("");
		
		System.out.println("(Enter true or false)");
		
		boolean bool = key.nextBoolean();
		
		
		if(bool)
		{
			
			System.out.println("");
			
			System.out.println("Great.");
		
		
	
			
			
		
		

		System.out.println("");
		
		System.out.println("(Your walking down the side of a road in South Carolina. The time is around 3pm."
				+ "\nYou see a man in the distance, but think nothing of it. He looks somewhat creepy..."
				+ "\nAs you walk past him, he says something to you-)");
		
		System.out.println("");
		
		System.out.println("\"Hello! Sorry to distrub you, I was wondering if you"
				+ "\nwould like to embark upon an adventure with me!?\"");
		
		System.out.println("");
		
		//I will once again be using blank print lines in order to creating proper spacing in the console
		
		
		System.out.println("\"Respond with yes if you would wish to! If not, respond with no!\"");
		
		String response = key.next();
		
		if(response.equals("yes"))
			
		{
			System.out.println("");
			
			System.out.println("\"Great! We will now begin a wonderful journey together! \n"
					+ "I\'m super happy to have you alongside me!\" ");
		}
		
		else if(response.equals("no"))
		
		{
			
			System.out.println("");
			
			System.out.println("\"Oh...well I hope to see you again! \n"
					+ "Maybe you will change your mind then!\"");
	
			System.out.println("");
			
			System.out.println("(As you're walking away from the man, you forgot to pay attention-)");
			
			System.out.println("");
			
			System.out.println("(-to where you were walking...you end up walking into a poll and unfortunately pass away.)");
			
			System.out.println("");
			
			System.out.println("...");
			
			System.out.println("");
			
			System.out.println("Ending 1/9: Unadventorous ");
			
			System.exit(0);
			//Unadventorous ending
			//system.exit(0) is a way to end the code
		}
		
		else
		{
			System.out.println("");
			
			System.out.println("\"Uhhh...what? You know what, nevermind...\"");
			
			System.out.println("");
			
			System.out.println("***Please enter a valid statement. Ending adventure.***");
			
			System.exit(0);
			
		}
		
		System.out.println("");
		
		System.out.println("");
		
		System.out.println("");
		
		System.out.println("\"Since you have agreed upon this adventure with me, "
				+ "I would first like to know your name!\"");
		
		System.out.println("");
		
		System.out.println("(Option A: Give name) (Option B: Refuse name) (Enter A or B below)");
		
		String nameResponse = key.next();
		
		if(nameResponse.equals("A"))
		//all if statements that come from giving the man your name will nest inside this if-block
		
		{
			System.out.println("");
			
			System.out.println("(Enter Name)");
			
			String userName = key.next();
			
			System.out.println("");
			
			System.out.println(userName +"! \"What a nice name! I like it!\"");
			
			System.out.println("");
			
			System.out.println("(The man appreciates your trust in him)");
			
			System.out.println("");
			
			System.out.println("\"Our adventure will consist of many different journeys and paths to take upon!"
					+ "\nbut first, we need to head back to my place...\" ");			
			
			System.out.println("");
			
			System.out.println("(As you arrive at his house, "
					+ "the man signals a gesture inviting for you to come inside.) ");
			
			System.out.println("");
			
			System.out.println("What do you do?");
			
			System.out.println("");
			
			System.out.println("(Option A: Walk into the house) (Option B: Run away)");
		
			String walkRun = key.next();
			
			if(walkRun.equals("A"))
			//will the user walk into his house?
			{
				System.out.println();
				
				System.out.println("(You walk into his house)");
				
				System.out.println("");
				
				System.out.println("\"Welp! This is the spot...what do you think?\"");
				
				System.out.println("");
				
				System.out.println("(The man has really nice furniture)");

				System.out.println("");

				
				System.out.println("(Option A: Compliment his housing) (Option B: Remain quiet)");
				
				String complimentQuiet = key.next();
				
				if(complimentQuiet.equals("A"))
				{
					System.out.println("");
					
					System.out.println("(You compliment his furniture and overall house)");
					
					System.out.println("");
					
					System.out.println("\"Thank you! That really means a lot! I spent a lot of time with this house haha!\"");
					
					System.out.println("");

					System.out.println("\"Anyways, I don't really know how to tell you but...there really was no adventure I'm sorry. Who'd you think I was...a wizard?");
					
					System.out.println("The real reason why I lied about the adventure was because...well I just really wanted a friend."
							+ "\nI mean, my whole life I've really never had anyone I could call a friend... and I thought that maybe"
							+ "\nI could make that friend if I lied about something big... like this.\"");

					System.out.println("");
					
					System.out.println("\"I'm sorry. I truly am. I just wanted a friend man.\"");
					
					System.out.println("");
					
					System.out.println("(Option A: Forgive the man and become his friend) (Option B: Get angry at the man)");
					
					String forgiveAngry3 = key.next();
					
					if(forgiveAngry3.equals("A"))
					//good ending
					
					{
						System.out.println("");
						
						System.out.println("(You forgave the man and opted to become his friend)");
						
						System.out.println("");
						
						System.out.println("\"You..really wanna be my friend?? Wow! I've never had a friend before!!");
						
						System.out.println("");
						
						System.out.println("\"Let's go out and grab something to eat! On me tonight!\"");
						
						System.out.println("");
					
						System.out.println("(You and the man go out to eat and become great friends)");
						
						System.out.println("");
						
						System.out.println("(Turns out the man was also secretly wealthy and always makes sure to "
								+ "spoil you with gifts since you befriended him!");

						System.out.println("");
						
						System.out.println("(Ending 2/9: Best Friend Ever)");
						
						
						if(forgiveAngry3.equals("B"))
						{
							System.out.println("");
							
							System.out.println("(You get really angry at the man and visually upset with him)");
						
							System.out.println("...");
							
							System.out.println("(The man doesn't say anything.)");
							
							System.out.println("");
							
							System.out.println("...");
							
							System.out.println("You walk out of the house frustrated and continue your day.");

							System.out.println("");
							
							System.out.println("(Ending 3/9: Rude...");
							
				
							
								
								}
							

							//this is all inside the condition that he gives the man his name
						
							
						
						}
						
						
				}	
						
						
					//for the below code, this is if you chose to walk with the man inside his house.
					
					if(complimentQuiet.equals("B"))
						
					{
						System.out.println("");
						
						System.out.println("...");
						
						System.out.println("(An awkward silence passes)");
						
						System.out.println("");
						
						System.out.println("...");
						
						System.out.println("(The man didn't appreciate that...)");
						
						
						System.out.println();
						
						System.out.println("\"Anyways, I don't really know how to tell you but...there really was no adventure I'm sorry. Who'd you think I was...a wizard?");
						
						System.out.println("The real reason why I lied about the adventure was because...well I just really wanted a friend."
								+ "\nI mean, my whole life I've really never had anyone I could call a friend... and I thought that maybe"
								+ "\nI could make that friend if I lied about something big... like this.\"");
						
						System.out.println("");
						
						System.out.println("\"I'm sorry. I truly am. I just wanted a friend man.\"");
						
						System.out.println("");
						
						System.out.println("(Option A: Forgive the man and become his friend) (Option B: Get angry at the man)");
						
						
						String forgiveAngry23 = key.next();
						
						
						if(forgiveAngry23.equals("A"))
							
							
						{
							System.out.println("");
							
							System.out.println("(You forgave the man and opted to become his friend)");
							
							System.out.println("");
							
							System.out.println("\"Thank you so much... but... it's alright. I know you don't really wanna be my friend.\"");
							
							System.out.println("");
							
							System.out.println("\"You don't have to pretend. ");
							
							System.out.println("");
							
							System.out.println("...");
							
							System.out.println("(The man navigates you out his house after a long silence and you carry on about your day.)");
							
							
							System.out.println("(Ending 5/9: ...Awkward)");
							
						}
							if(forgiveAngry23.equals("B"))
							{
								
								
								System.out.println("");
								
								System.out.println("(You get really angry at the man and visually upset with him)");
							
								System.out.println("");
								
								System.out.println("\"Please... I just want a friend.\"");
								
								System.out.println("");
								
								System.out.println("...");
								
								System.out.println("");
								
								System.out.println("(You walk out of the house ignoring the man, continuing about your day.)");

								System.out.println("");
								
								System.out.println("(Ending 6/9: Jerk...)");
							}
								
								//running away ending
							
																
							//	int randomRecovery = key.nextInt();
								
						//		if(randomRecovery < 50)
									
							//	{
							//		System.out.println("...");
									
							//		System.out.println("(As your attempting to turn and run from the man, you slip and fall.");
									
							//		System.out.println("");
									
							//		System.out.println("(As your on the ground, the man grabs you)");
							//		
							//		System.out.println("");
							//		
							//		System.out.println("...");
							//		
							//		System.out.println("");
									
							//		System.out.println("Ending 3/9: Friends Forever)");			
									
									
									// this above code is for a condition where the user doesn't give the man their name
									
									
									//nested in condition that the user gives the man their name
							
									// use this code once you a condition where the user will run away from the man
									
			//	}
					
					
					
					
				
								

				}
			
			
			
				
			
				
		
			
			
		}
	
			
			
			if(walkRun.equals("B"))
				//will the user try and make an attempt to run from him?	
					
				{
					System.out.println("");
					
					System.out.println("(You don't trust the situation and make an attempt to run.)");
				
					System.out.println("");
					
					System.out.println("(As you're turning to run, you stumble a bit."
							+ "\n(Enter a number 1-100 that will determine how you recover.)");
			
				//do not forget to finish Run condition
			
		
			
			int randomRecovery = key.nextInt();
			
				if(randomRecovery < 50)
						
					{
						System.out.println("");	
					
						System.out.println("...");
						
						System.out.println("");
						
						System.out.println("(As your attempting to turn and run from the man, you slip and fall.)");
						
						System.out.println("");
						
						System.out.println("(As your on the ground, the man slowly walks up to you and grabs you)");
						
						System.out.println("");

						System.out.println("...");

						System.out.println("");
						
						System.out.println("Ending 7/9: Friends Forever)");	
						
				}
				
				
				else if(randomRecovery >= 50)
				{
					System.out.println("...");
					
					System.out.println("(As your attempting to turn and run from the man, you trip, but you make a successful recovery.) ");
					
					System.out.println("");
					
					System.out.println("(You run as far as you can)");
					
					System.out.println("");

					System.out.println("...");

					System.out.println("");
					
					System.out.println("Ending 8/9: Escaped...?)");	
				}
			
		
	}
			
		


		}
		
		else if(nameResponse.equals("B"))
		//all if statements that come from refusing to give the entity your name will nest inside this if-block
		//the user will be prompted with the same questions, but if they continue to give answers the man does
		//not appreciate, then this will result in a different response
		
		{
			System.out.println("");
			
			System.out.println("Oh...you refuse to tell me? That's okay! "
					+ "I guess we don't know much about eachother so!");
		
			System.out.println("");
			
			System.out.println("(The man does not appreciate your doubt in him)");
		
			System.out.println("");
			

			System.out.println("\"Our adventure will consist of many different journeys and paths to take upon!"
					+ "\nbut first, we need to head back to my place...\" ");			
			
			System.out.println("");
			
			System.out.println("(As you arrive at his house, "
					+ "the man signals a gesture inviting for you to come inside.) ");
			
			System.out.println("");
			
			System.out.println("What do you do?");
			
			System.out.println("");
			
			System.out.println("(Option A: Walk into the house) (Option B: Run away)");
			
			
			String walkRunB = key.next();
			
			if(walkRunB.equals("A"))
			
				//since user refused to give their name, if the user gets angry with the man, the man will do something 
				//more outrageous since the user never appreciated him
				
			{
				

					System.out.println();
					
					System.out.println("(You walk into his house)");
					
					System.out.println("");
					
					System.out.println("\"Welp! This is the spot...what do you think?\"");
					
					System.out.println("");
					
					System.out.println("(The man has really nice furniture)");
					
					System.out.println("");

					System.out.println("(Option A: Compliment his housing) (Option B: Remain quiet)");
					
					String complimentQuietBA = key.next();
					
					if(complimentQuietBA.equals("A"))
				
					{
						System.out.println("");
						
						System.out.println("(You compliment his furniture and overall house)");
						
						System.out.println("");
						
						System.out.println("\"Thank you! That really means a lot! I spent a lot of time with this house haha!\"");
						
						System.out.println("");

						System.out.println("\"Anyways, I don't really know how to tell you but...there really was no adventure I'm sorry. Who'd you think I was...a wizard?");
						
						System.out.println("The real reason why I lied about the adventure was because...well I just really wanted a friend."
								+ "\nI mean, my whole life I've really never had anyone I could call a friend... and I thought that maybe"
								+ "\nI could make that friend if I lied about something big... like this.\"");

						System.out.println("");
						
						System.out.println("\"I'm sorry. I truly am. I just wanted a friend man.\"");
						
						System.out.println("");
						
						System.out.println("(Option A: Forgive the man and become his friend) (Option B: Get angry at the man)");
						
						String forgiveAngry3 = key.next();
						
						if(forgiveAngry3.equals("A"))
						//good ending
						
						{
							System.out.println("");
							
							System.out.println("(You forgave the man and opted to become his friend)");
							
							System.out.println("");
							
							System.out.println("\"You..really wanna be my friend?? Wow! I've never had a friend before!!");
							
							System.out.println("");
							
							System.out.println("\"Let's go out and grab something to eat! On me tonight!\"");
							
							System.out.println("");
						
							System.out.println("(You and the man go out to eat, you try and remain in contact with the man)");
							
							System.out.println("");
							
							System.out.println("(Turns out the man was secretly wealthy and feels as if you only chose to become his friend"
									+ " \ndue to you seeing his furniture. The man no longer contacts you)");

							System.out.println("");
							
							System.out.println("(Ending 4/9: Gold Digger.)");
						
							
							if(forgiveAngry3.equals("B"))
							
							{
								System.out.println("");
								
								System.out.println("(You get really angry at the man and visually upset with him)");
							
								System.out.println("...");
								
								System.out.println("(The man doesn't say anything.)");
								
								System.out.println("");
								
								System.out.println("...");
								
								System.out.println("");

								System.out.println("");
								
								System.out.println("(Ending 3/9: Rude...");
								
					
							}
								
				
							
						}	
						
						
					}	
						
							
				
						

							
							
					if(complimentQuietBA.equals("B"))
									
								{
									System.out.println("");
									
									System.out.println("...");
									
									System.out.println("(An awkward silence passes)");
									
									System.out.println("");
									
									System.out.println("...");
									
									System.out.println("(The man didn't appreciate that...)");
									
									
									System.out.println();
									
									System.out.println("\"Anyways, I don't really know how to tell you but...there really was no adventure I'm sorry. Who'd you think I was...a wizard?");
									
									System.out.println("The real reason why I lied about the adventure was because...well I just really wanted a friend."
											+ "\nI mean, my whole life I've really never had anyone I could call a friend... and I thought that maybe"
											+ "\nI could make that friend if I lied about something big... like this.\"");
									
									System.out.println("");
									
									System.out.println("\"I'm sorry. I truly am. I just wanted a friend man.\"");
									
									System.out.println("");
									
									System.out.println("(Option A: Forgive the man and become his friend) (Option B: Get angry at the man)");
									
									
									String forgiveAngry23 = key.next();
									
									
									if(forgiveAngry23.equals("A"))
										
										
									{
										System.out.println("");
										
										System.out.println("(You forgave the man and opted to become his friend)");
										
										System.out.println("");
										
										System.out.println("\"Thank you so much... but... it's alright. I know you don't really wanna be my friend.\"");
										
										System.out.println("");
										
										System.out.println("\"You don't have to pretend. ");
										
										System.out.println("");
										
										System.out.println("...");
										
										System.out.println("");
										
										System.out.println("(The man navigates you out his house after a long silence and you carry on about your day.)");
										
										System.out.println("");
										
										System.out.println("(Ending 5/9: ...Awkward)");
										
									}
										if(forgiveAngry23.equals("B"))
										{
											
											
											System.out.println("");
											
											System.out.println("(You get really angry at the man and visually upset with him)");
										
											System.out.println("");
											
											System.out.println("\"Please... I just want a friend.\"");
											
											System.out.println("");
											
											System.out.println("...");
											
											System.out.println("");
											
											System.out.println("(You walk out of the house ignoring the man, continuing about your day.)");

											System.out.println("");
											
											System.out.println("(Ending 6/9: Jerk...)");
										}
					
								
										
										
										
						
								
								}
				
			
			
		
		}
		
		
		
		
		
		if(walkRunB.equals("B"))
			//will the user try and make an attempt to run from him?	
			
		{
			System.out.println("");
			
			System.out.println("(You don't trust the situation and make an attempt to run.)");
			
			System.out.println("");
			
			System.out.println("(As you're turning to run, you stumble a bit. The man begins to start chasing you."
					+ "\n(Enter a number 1-100 that will determine how you recover.)");
			
			//do not forget to finish Run condition
			
			
			
			int randomRecovery = key.nextInt();
			
			if(randomRecovery < 50)
				
			{
				System.out.println("");	
				
				System.out.println("...");
				
				System.out.println("");
				
				System.out.println("(As your attempting to turn and run from the man, you slip and fall.)");
				
				System.out.println("");
				
				System.out.println("(As your on the ground, the man slowly walks up to you and grabs you)");
				
				System.out.println("");
				
				System.out.println("...");
				
				System.out.println("");
				
				System.out.println("Ending 9/9: Caught)");	
				
			}
			
			
			else if(randomRecovery >= 50)
			{
				System.out.println("...");
				
				System.out.println("(As your attempting to turn and run from the man, you trip, but you make a successful recovery.) ");
				
				System.out.println("");
				
				System.out.println("(You run as far as you can)");
				
				System.out.println("");
				
				System.out.println("...");
				
				System.out.println("");
				
				System.out.println("Ending 8/9: Escaped...?)");	
			}
			//this ending will be the man becoming upset with you and doing something
						
					
		
		else {
		//if user enters a invalid name response, this will be what happens
		
			System.out.println("");
			
			System.out.println("\"Uhhh...what? You know what, nevermind...\"");
			
			System.out.println("");
			
			System.out.println("***Please enter a valid statement. Ending adventure.***");
			
			System.exit(0);
			
		}


	
		}

		
		
	
	
	

		}




}
		
		
	else 
			
		{
			
			System.out.println("");
		
			System.out.println("Understood. Goodbye for now.");
			
			System.exit(0);
			
		}

}


}






