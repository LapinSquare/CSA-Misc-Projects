import java.util.Scanner;
/**
 * Choose your own adventure game.
 * @author Kim Huynh
 * @version 10/16/2017
 */
/* RANDOM NOTES:
 * Loop 5 points - check! 
 * Name 5 points - check!
 * Please enjoy at your own pace!
 * Also, this program isn't completely dummy-proof. Don't be weird. Don't break it. 
 * Have fun!
 * */ 

public class HuynhKim_CYOA {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		// NAMING CONVENTIONS *  

		System.out.println("\nIn a dark room with a carrot-shaped projector board, two rabbits in suits stand before you.");
		System.out.println("\"Welcome to the Rabbit Aeronautics and Space Administration (RASA), new recruit...ah, what's your name again?\""); 
		String name = input.nextLine( ); 

		/*Name recognition*/

		if (name.equalsIgnoreCase("samuel") || name.equalsIgnoreCase("sam") || name.equalsIgnoreCase("stafford"))
		{ 
			System.out.println("\"You already have a job as a CS teacher! What are you doing here?\"");
			System.out.println("\"You should go back to Borah High School.\"");
		} 
		else if (name.equalsIgnoreCase("kim") || name.equalsIgnoreCase("kim huynh") )
		{ 
			System.out.println("\"Hey, you can't use the creator's name! Use your own name!\"");
		} 
		else if (name.equalsIgnoreCase("laika") || name.equalsIgnoreCase("kudryavka"))
		{
			System.out.println("\"I appreciate the fact that you actually know about space history and all...\""); 
			System.out.println("\"But she's considered an NPC here. Get another name.\"");
		}

		else 
		{ 
			int death=0; 
			int count = 1;
			while (count < 2) {

				// INTRODUCTION **

				System.out.println("\n\"Ah! That's right! Pardon my forgetfulness.\"");
				System.out.println("\"Our ultimate goal is to try to send rabbits to the worlds beyond our planet.\"");
				System.out.println("\"Would you like to embark on this important mission, "+name+" ?\"");
				System.out.println("\nChoose the following...[type in the letter without the \")\".]"
						+"\nA) Do it. For the honor of RASA."
						+"\nB) Refuse politely and demand the humans and kerbals back."
						+"\nC) Ask to do an alternate task."
						+"\nD) Run away.");
				String choice = input.nextLine( ); 
				if (choice.length()>1)
				{ 
					System.out.println("\n[Please don't try to break the system.]");
					System.out.println("[I assume you meant "+choice.charAt(0)+" ? Then just type it!]"); 
					System.out.println("");
				}
				char ch = choice.charAt(0);

				switch (ch)
				{
				case 'a':
				case 'A':

					// ROUTE 1.0 : SPACE ARC **

					System.out.println("\"Thanks for your cooperation!\"");
					System.out.println("The projector whirrs to life and displays a rabbit in a space ship and various statistics.");
					System.out.println("\"We're kinda out of money due to the Apoc--\" the speaker is rudely elbowed in the gut." );
					System.out.println("\"We don't have much, but I hope you can assemble something. For science!\"");
					System.out.println("The rabbits seem genuinely excited, and proceed to bring you to their rocket lab. "
							+ "Rabbits in white coats scurry around the plated floors.");
					System.out.println("\n\"Is the 'Development of the aortic baroreflex system under conditions of microgravity' ready for publication yet?\"");

					/* NOTE : Was an actual Japanese study intended to be on rabbits in microgravity. There was only an abstract though...*/

					System.out.println("\"N-not yet! I am still in the process of writing the abstract!\"");
					System.out.println("\"Where's the coffee?!?\"");
					System.out.println("Tidbits of converstations scatter around just as messily as the rabbits are.");
					System.out.println("\n\"We have several prototypes ready to launch to space. What do you think we should choose?\"" 
							+"\nA) The Challenger. "
							+ "\"A new invention!\""
							+"\nB) The Columbia. "
							+ "\"It is very sturdy and worked many times with minimal failures. This will be its 28th trip!\""
							+"\nC) The Skylab Plan. "
							+ "\"You can launch into one of our labs in space!\""
							+"\nD) Suggest a rover to explore instead."
							+"\nE) The Endeavour. "
							+ "\"A recent shuttle!\""); 
					String R1 = input.nextLine( ); 
			
					if ( R1.equalsIgnoreCase("a") )
					{
						// ROUTE 1.1.0 : CHALLENGER **

						System.out.println("\"You too? I think it's a great plan!\"");
						System.out.println("\"I can't wait to try it out n' all, but should we launch today?\""); 
						System.out.println("\"Don't be such a bunny, the Challenger is ready to go!\""); 
						System.out.println("\"But the manufacturers don't suggest it...\""); 
						System.out.println("\"We have been delaying this darn plan for months, Fred--!\""); 
						System.out.println("\"It's too cold! There's freakin' frost covering my cubicle!\"");
						System.out.println("The rabbits babble and argue for a few minutes before turning to you.");
						System.out.println("\"What do you think, "+name+" ? Humans outta know these sort or things!\"");
						System.out.println("\nYou can..."
								+"\nA) Proceed with the plan."
								+"\nB) Delay the plan.");
						String delayC = input.nextLine( );
						char dC= delayC.charAt(0);

						switch (dC)
						{
						case 'a': 
						case 'A': 

							// ROUTE 1.1.1 : BITTER WINTER **

							System.out.println("\"See? That human's right! there's no use in delaying now!\""); 
							System.out.println("The rest of the rabbits are forced to agree as the Challenger is pulled out of the base.");  
							System.out.println("\nYou stand behind the command panel as the rabbits count down."); 
							System.out.println("\"3, 2, 1...blast off!\"");
							System.out.println("It shoots up in its usual grey blast.");
							System.out.println("\"See? Nothing bad happened!\""); 
							System.out.println("The rabbits get out a bag of plastic cups and a bottle of carrot coke.");
							System.out.println("\"Cheers!---\" and then an explosion.");
							System.out.println("The shock was evident in everyone's faces. \"What happened?!\""); 
							System.out.println("\nThe Challenger comes down in flames."); 
							System.out.println("\nYou later find out that an O-ring has bursted due to the "
									+ "cold weather and questionable durability. "
									+ "The rest of the story was an unfortunate game of dominoes."); 
							System.out.println("You were fired from RASA, without doubt."); 
							System.out.println("\n-BAD END-"); 
							System.out.println("\nRestart timeline? "
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart111 = input.nextLine( );
							char rE111 = restart111.charAt(0);

							switch (rE111)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								System.out.println("");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}
							break;
						case 'b': 
						case 'B': 

							// ROUTE 1.1.2.0 : SOUR DELAY **

							System.out.println("You feel like launching the Challenger now is a bad idea.");
							System.out.println("\n\"...Eh? "+name+" !?\""); 
							System.out.println("\"I thought you were kinda smart, but you aren't! You're like the other cowardly bunnies!\""); 
							System.out.println("Some of the rabbit scientists start rioting."); 
							System.out.println("\"Do you know how far behind we are in the space industry?\""); 
							System.out.println("\"We gotta beat that other space station! "
									+ "Laika--that Kudryavka--has already orbited the Earth!\""); 
							System.out.println("\"But I agree with "+name+" !\"");
							System.out.println("\"Please reconsider!\""); 
							System.out.println("\nWill you..."
									+ "\nA) Negate your previous statement. Launch immediately. "
									+ "\nB) Still insist on a delay in plans. "
									+ "\nC) Inform them that Laika is actually dead from rushed experimentation.");
							String delayB = input.nextLine( );
							char dB= delayB.charAt(0);

							switch (dB)
							{
							case 'a': 
							case 'A':  
								//ROUTE 1.1.2.1 : REPEAT IN HISTORY, THE SHEEP SPEAKS **

								System.out.println("\"See? That human's right! there's no use in delaying now!\""); 
								System.out.println("The rest of the rabbits are forced to agree as the Challenger is pulled out of the base.");  
								System.out.println("\nYou stand behind the command panel as the rabbits count down."); 
								System.out.println("\"3, 2, 1...blast off!\"");
								System.out.println("It shoots up in its usual grey blast.");
								System.out.println("\"See? Nothing bad happened!\""); 
								System.out.println("The rabbits get out a bag of plastic cups and a bottle of carrot coke.");
								System.out.println("\"Cheers!---\" and then an explosion.");
								System.out.println("The shock was evident in everyone's faces."); 
								System.out.println("\nThe Challenger comes down in flames."); 
								System.out.println("\nYou later find out that an O-ring has bursted due to the "
										+ "cold weather and questionable durability. "
										+ "The rest of the story was an unfortunate game of dominoes and bursted engines."); 
								System.out.println("You were fired from RASA, without doubt."); 
								System.out.println("\n-BAD END-"); 
								System.out.println("\nRestart timeline? "
										+ "\nA) YES"
										+ "\nB) NO ");
								String restart1121 = input.nextLine( );
								char rE1121 = restart1121.charAt(0);

								switch (rE1121)
								{
								case 'a':
								case 'A': 
									System.out.println("\nTimeline restarted.");
									System.out.println("");
									break; 
								case 'b':
								case 'B': 
									count++;
									System.out.println("\nThank you for playing this game!");
									System.out.println("You have died "+death+" times in all timelines!");
									break;
								}
								break; 
							case 'b':
							case 'B': 
								// ROUTE 1.1.2.2 : BY YOUR HAND, IT LIVES **

								System.out.println("\"I refuse to agree with "+name+" ! I'm not going to do nothin'!\"");
								System.out.println("\"B-but the prophecy! We should listen to it--!\"");
								System.out.println("An all-out fist fight broke out."); 
								System.out.println("It was slightly comical, seeing that they were rabbits and all. What could fuzzy paws do?");
								System.out.println("\nIt ended up like Watership Down and half of the rabbits were sent to the hospital.");
								System.out.println("\nEither way, they delayed the trip to the summer months and fixed up some things.");
								System.out.println("The trip was a success. No one died and everything went well."); 
								System.out.println("You were reluctantly promoted to being the manager of the rowdy rabbits."); 
								System.out.println("\n-GOOD END-");
								System.out.println("\nRestart timeline? "
										+ "\nA) YES"
										+ "\nB) NO ");
								String restart1122 = input.nextLine( );
								char rE1122 = restart1122.charAt(0);

								switch (rE1122)
								{
								case 'a':
								case 'A': 
									System.out.println("\nTimeline restarted.");
									System.out.println("");
									break; 
								case 'b':
								case 'B': 
									count++;
									System.out.println("\nThank you for playing this game!");
									System.out.println("You have died "+death+" times in all timelines!");
									break;
								}

								break; 
							case 'c':
							case 'C': 
								// ROUTE 1.1.2.3 : LAIKA, THE ONLY REAL THING HERE ** 

								System.out.println("The rabbits stare at you with confusion."); 
								System.out.println("\"What are you talking about? Laika is alive and well!\"");
								System.out.println("\"I just saw her lounging around on the beach in her latest picture on Insta.\"");
								System.out.println("\n\"Perhaps it has happened in your plane of existance, but it didn't happen here.\""); 
								System.out.println("\nWith that said, they kick you out of the lab for being a heretic.");
								System.out.println("You don't know what happened to the launch..."); 
								System.out.println("But the next day, you see a row of gravestones out near the launch pad.");
								System.out.println("\nNot wanting to associate with stubborn characters, you leave RASA."); 
								System.out.println("\n-BAD END-");
								System.out.println("\nRestart timeline? "
										+ "\nA) YES"
										+ "\nB) NO ");
								String restart1123 = input.nextLine( );
								char rE1123 = restart1123.charAt(0);

								switch (rE1123)
								{
								case 'a':
								case 'A': 
									System.out.println("\nTimeline restarted.");
									System.out.println("");
									break; 
								case 'b':
								case 'B': 
									count++;
									System.out.println("\nThank you for playing this game!");
									System.out.println("You have died "+death+" times in all timelines!");
									break;
								}
								break;
							}

							break;
						}

					}
					else if (R1.equalsIgnoreCase("b"))
					{ 
						// ROUTE 1.2.0 : COLUMBIA **

						System.out.println("\"The Columbia, eh? That's a smart choice, "+name+" !\""); 
						System.out.println("\"It can't fail for sure! How else would it work for the past 27 trips?\"");
						System.out.println("\nAfter some slight polishing and repair, the rabbits pull out the space shuttle."); 
						System.out.println("\"Do you think we need to do anything else, "+name+" ?\"");
						System.out.println("\"It looks pretty good though. Nothing different from the past trips our crew can't handle!\""); 
						System.out.println("\nSuggest..."
								+ "\nA) To launch immediately."
								+ "\nB) To check the Columbia.");
						String R12 = input.nextLine( );
						if ( R12.equalsIgnoreCase("a") )
						{ 
							// ROUTE 1.2.1 : STS-107 **

							System.out.println("\"Launch! Launch!\""); 
							System.out.println("Grey smoke pour out of the engines as the Columbia is lifted to the sky.");
							System.out.println("\"Hooray!\" The scientists cheer, and bring out a bottle of vodka to celebrate."); 
							System.out.println("Before the vodka is tipped, an explosion occurs.");
							System.out.println("\nIt was found out that a piece of hidden foam was dislodged, which damaged the thermal protection system.");
							System.out.println("Everything went downhill from there."); 
							System.out.println("\nUnfortunately, the director's daughter was onboard the Columbia.");
							System.out.println("Filled with grief, he orders your head on a platter."); 
							System.out.println("\nIt ended up in the garbage can instead.");
							death++;
							System.out.println("\n-BAD END-"); 
							System.out.println("\nRestart timeline? "
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart121 = input.nextLine( );
							char rE121 = restart121.charAt(0);

							switch (rE121)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								System.out.println("");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}
						} 
						else if ( R12.equalsIgnoreCase("b") )
						{ 
							// ROUTE 1.2.2 : COLUMBIAN CHANGE ** 

							System.out.println("\"Better than doin' nothin', I guess.\""); 
							System.out.println("The rabbits do several rounds around the Columbia.");
							System.out.println("\"Guys, there's something wrong with the foam around the thermal protection system!\""); 
							System.out.println("The scientists gather around the loose foam."); 
							System.out.println("\"How problamatic! Thanks for the suggestion, "+name+" . Without you, this foam could've collided with the wings...\"");
							System.out.println("\"And KABOOM!\" a rabbit emphasizes."); 
							System.out.println("The rabbits nod wisely."); 
							System.out.println("\"Let's fix this!\"");
							System.out.println("\nLater, after a few fixes into the following months, the Columbia was launched.");
							System.out.println("The crew came back without a scratch, and you are promoted to head scientist in the RASA organization.");
							System.out.println("\nLife is great."); 
							System.out.println("\n-GOOD END-");
							System.out.println("\nRestart timeline? "
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart122 = input.nextLine( );
							char rE122 = restart122.charAt(0);

							switch (rE122)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								System.out.println("");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}
						}
						else 
						{ 
							// ROUTE 1.2.3 : DEFAULTING EXPERIMENTATION **

							System.out.println("\"It seems like "+name+" blanked out.\"");
							System.out.println("\"Why is it in charge of decision-making again?\"");
							System.out.println("\"It is the protagonist! What else are we supposed to do?!\"");
							System.out.println("\"...I know!\"");
							System.out.println("The rabbits strap you on to a rocket and add some devices on you."); 
							System.out.println("\"We can record how much time a person can last in space without oxygen!\""); 
							System.out.println("\"Yayyyyy!\"");
							System.out.println("\nInevitably, you died.");
							System.out.println("\n-BAD END-");
							death++;
							System.out.println("\nRestart timeline? "
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart123 = input.nextLine( );
							char rE123 = restart123.charAt(0);

							switch (rE123)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								System.out.println("");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}
						}

					}
					else if (R1.equalsIgnoreCase("c"))
					{
						// ROUTE 1.3.0 : SKYLAB **

						System.out.println("\"Ah, you're interested in visiting our Skylab in space?\""); 
						System.out.println("\"It would be more beneficial for Bob to receive some help up there with his weird experiments.\""); 
						System.out.println("Weird experiments...?"); 
						System.out.println("\n\"We have a small shuttle prepared for your launch. "
								+ "It has a chance of failing, but...wanna go at it? \"");
						System.out.println("A) YES.");
						System.out.println("B) NO."); 
						String Rsky = input.nextLine( );
						if ( Rsky.equalsIgnoreCase("a") )
						{ 
							// ROUTE 1.3.1.0 : ONWARDS! **

							/* Failure generator. */

							double chanceOfFail = Math.random();  

							if (chanceOfFail>0 && chanceOfFail<0.5)
							{ 
								// ROUTE 1.3.1.1 : UNLUCKILY DENIED **  

								System.out.println("After being given a small amount of instructions, you board the shuttle anticipating your journey."); 
								System.out.println("Due to unfortunate circumstances, however, your shuttle malfunctioned and exploded mid-way into the ascent from Earth.");
								System.out.println("\nWhat are the chances of that?!?"); 
								death++;
								System.out.println("\n-BAD END-");
								System.out.println("\nRestart timeline? "
										+ "\nA) YES"
										+ "\nB) NO ");
								String restart1311 = input.nextLine( );
								char rE1311 = restart1311.charAt(0);

								switch (rE1311)
								{
								case 'a':
								case 'A': 
									System.out.println("\nTimeline restarted. Maybe you'll have better luck this time!");
									System.out.println("");
									break; 
								case 'b':
								case 'B': 
									count++;
									System.out.println("\nThank you for playing this game!");
									System.out.println("You have died "+death+" times in all timelines!");
									break;
								}

							} 
							else
							{ 
								// ROUTE 1.3.1.2 : LUCK IS WITH YOU **

								System.out.println("After being given a small amount of instructions, you board the shuttle anticipating your journey.");  
								System.out.println("Your shuttle ascends the Earth successfully, "
										+ "and you are about to head into the rumored Skylab."); 
								System.out.println("Before that, however, you see a glowing space ship.");  
								System.out.println("A UFO?");
								System.out.println("You hear it murmuring about various things through the static on the intercom."); 
								System.out.println("\"D..i..sabled..r..o..bo..t...on...Ar..es...pla.n...can'..t..fa..il..\""); 
								System.out.println("How trifling."); 
								System.out.println("\nYou land in the Skylab and conduct cool Meth experiments with Bob."); 
								System.out.println("\n-??? END-"); 
								System.out.println("\nRestart timeline? "
										+ "\nA) YES"
										+ "\nB) NO ");
								String restart1312 = input.nextLine( );
								char rE1312 = restart1312.charAt(0);

								switch (rE1312)
								{
								case 'a':
								case 'A': 
									System.out.println("\nTimeline restarted.");
									System.out.println("");
									break; 
								case 'b':
								case 'B': 
									count++;
									System.out.println("\nThank you for playing this game!");
									System.out.println("You have died "+death+" times in all timelines!");
									break;
								}

							}
						} 
						else if ( Rsky.equalsIgnoreCase("b") )
						{ 
							// ROUTE 1.3.3 : SURE **

							System.out.println("The rabbits stare blankly at you.");
							System.out.println("\"Didn't you just suggest this idea?\""); 
							System.out.println("Eh..."); 
							System.out.println("\"If you are so picky, maybe you're better off being an experiment instead.\"");
							System.out.println("\nSo here you are, in front of a dubious 'time machine,' as the rabbits have dubbed it."); 
							System.out.println("You don't really get transported in time. Your limbs fly off into an alternate dimension though."); 
							System.out.println("Mission success?");
							System.out.println("\n-BAD END-"); 
							death++;
							System.out.println("\nRestart timeline? "
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart133 = input.nextLine( );
							char rE133 = restart133.charAt(0);

							switch (rE133)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								System.out.println("");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}
						} 
						else 
						{ 
							// ROUTE 1.3.4 : ALT - F4 ** 

							System.out.println("\"Invalid option selected. Please proceed to--\""); 
							System.out.println("The rabbit speaking was knocked on the head lightly."); 
							System.out.println("\"Stop acting like a robot.\" \"Okay...\"");
							System.out.println("\nIf you press Alt-F4, you can receive a free lootbox for your Overwatch account."); 
							System.out.println("\n JK."); 
							System.out.println("\n I just don't know what to say here. You died from shock (?)");
							System.out.println("\n-??? END-"); 
							death++;
							System.out.println("\nRestart timeline? (But you clearly don't care about the game enough to play it properly...)"
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart134 = input.nextLine( );
							char rE134 = restart134.charAt(0);

							switch (rE134)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								System.out.println("");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}

						}


					}
					else if (R1.equalsIgnoreCase("d"))
					{
						// ROUTE 1.4 : CURIOSITY ** 

						System.out.println("\"Ah that? We already have a rover prepared on 'Ares.' We call it the Curiosity!\""); 
						System.out.println("The rabbits proceed to go to the hub of computers where other rabbits are monitoring the Curiosity."); 
						System.out.println("\"See? You can spectate with us if you wish.\""); 
						System.out.println("Through the limited data provided, you see a dense outline of something from the thick lenses."); 
						System.out.println("Bunny ears perhaps?"); 

						/* Btw, for those wandering through code, NASA did spot something akin to 'Bunny Ears' on Mars (Ares). 
						 * Probably from a fallen part of the Curiosity.*/

						System.out.println("\"Can you go ahead and take the night shift? Some of the mods need a rest from the control panel.\"");
						System.out.println("You reluctantly accept as the rabbits hand you a cup of coffee (politely labeled with red marker ' "+name+" ').");
						System.out.println("The rabbits file out soon afterwards.");
						System.out.println("\nLeft alone, you look at the blurry pixels on your screen."); 
						System.out.println("Suddenly, the screen turns black. You hear a strange cipher-like language beyond the screen."); 
						System.out.println("\nWhat happened?!"); 
						System.out.println("\nWith no way to explain the situation when the rabbits came back, you were promptly fired."); 
						System.out.println("\n-BAD END-"); 
						System.out.println("\nRestart timeline? (But you clearly don't care about the game enough to play it properly...)"
								+ "\nA) YES"
								+ "\nB) NO ");
						String restart14 = input.nextLine( );
						char rE14 = restart14.charAt(0);

						switch (rE14)
						{
						case 'a':
						case 'A': 
							System.out.println("\nTimeline restarted.");
							System.out.println("");
							break; 
						case 'b':
						case 'B': 
							count++;
							System.out.println("\nThank you for playing this game!");
							System.out.println("You have died "+death+" times in all timelines!");
							break;
						}

					}
					else if (R1.equalsIgnoreCase("e"))
					{
						// ROUTE 1.5 : ENDEAVOUR **

						System.out.println("One of the newest shuttles out of RASA, it flew quite well."); 
						System.out.println("There's really nothing wrong with the Endeavour, matching up with the history in NASA's textbooks."); 
						System.out.println("What am I supposed to do, make up a disaster?");
						System.out.println("Wait...nevermind...");
						System.out.println("\nDue to multiple successful missions concerning the shuttle, you are given a stable life (and income) as an astronaut."); 
						System.out.println("The Endeavour is now on display at LA for all to see.");
						System.out.println("\n-GOOD END-"); 
						System.out.println("\nRestart timeline? "
								+ "\nA) YES"
								+ "\nB) NO ");
						String restart15 = input.nextLine( );
						char rE15 = restart15.charAt(0);

						switch (rE15)
						{
						case 'a':
						case 'A': 
							System.out.println("\nTimeline restarted.");
							System.out.println("");
							break; 
						case 'b':
						case 'B': 
							count++;
							System.out.println("\nThank you for playing this game!");
							System.out.println("You have died "+death+" times in all timelines!");
							break;
						}

					}
					else
					{
						//ROUTE 1.6 : GRAVITATIONAL FORCE **

						System.out.println("It ain't respondin', head rabbit scientist? Seems like it gabbin' somethin' weird. No valid key...");
						System.out.println("I guess not...terminate it, won't you? Ah. Are there any disposal methods available in the lab?");
						System.out.println("There is silence except for the occasional dissecting of your corpse.");
						System.out.println("A voice rings from another station, \"I need a test subject for the centrifu--\" \"Great! Let's use that invention!\"");
						System.out.println("After attaching several sensors to you, they let you float in the local centrifuge and record data on artificial gravity.");
						System.out.println("You are a huge contribution to science!");
						System.out.println("\n-??? END-"); 
						death++;
						System.out.println("\nRestart timeline? "
								+ "\nA) YES"
								+ "\nB) NO ");
						String restart16 = input.nextLine( );
						char rE16 = restart16.charAt(0);

						switch (rE16)
						{
						case 'a':
						case 'A': 
							System.out.println("\nTimeline restarted.");
							System.out.println("");
							break; 
						case 'b':
						case 'B': 
							count++;
							System.out.println("\nThank you for playing this game!");
							System.out.println("You have died "+death+" times in all timelines!");
							break;
						}
					}
					break;
				case 'b':
				case 'B':

					// ROUTE 2.0 : REVELATION ARC **

					System.out.println("You hear hushed whispering among the suited rabbits. \" It knows--!! \"");
					System.out.println("After some awkward silence and shuffling, one rabbit speaks up.");
					System.out.println("\"This isn't the plane of existance you know of. There are no 'KSP' or 'NASA' here. No kerbals. No humans. But you.\"");
					System.out.println("\"Nearly everything has collapsed because of the Apocalypse...\"");
					System.out.println("Silence ensues in the room. The rabbits speak no more but instead stare at the walls.");
					System.out.println("Would you like to...");
					System.out.println("A) Ask further questions.");
					System.out.println("B) Wait in silence.");
					System.out.println("C) Assasinate them.");
					System.out.println("D) Ask about this CYOA's plot. Because you have no idea where this is going.");
					String R2 = input.nextLine( );
					if ( R2.equalsIgnoreCase("a") )
					{
						// ROUTE 2.1.0 : WORLD-BUILDING **

						System.out.println("\"A-ah, you see, the Apocalypse wiped out a lot of living things here on Earth.\"");
						System.out.println("\"This includes vegetation and many species that you formerly know\"."); 
						System.out.println("\"How did we survive? Haha, probably some Deus Ex Machina stuff going on in the background.\"");
						System.out.println("\nYou stare questioningly still."); 
						System.out.println("\n\"Because the Earth is lacking of nutrients, we're going to a new planet for better living conditions.\"");
						System.out.println("\"Some have already gotten past these boundaries.\"");
						System.out.println("Silence."); 
						System.out.println("\n\"Just kidding! We don't know what's going on either.\""); 
						System.out.println("\"Haha, where's the script again?\""); 
						System.out.println("A rabbit looks for the script, but realizes you are still here. "
								+ "\"You can leave now. There is no plot for you to discover here.\""); 
						System.out.println("Leave?"
								+ "\nA) Yes."
								+ "\nB) No.");
						String R21 = input.nextLine( );
						if ( R21.equalsIgnoreCase("a") )
						{
							// ROUTE 2.1.1 : LEAVE **  

							System.out.println("You walk away from the RASA building without a clue of what's happening."); 
							System.out.println("It was much too obvious that the author didn't know how to make a story."); 
							System.out.println("As you leave, you notice the barren red landscape and scattered skulls."); 
							System.out.println("Perhaps there was some plot after all..."); 
							System.out.println("\n-TRUE END-"); 
							System.out.println("\nRestart timeline? "
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart211 = input.nextLine( );
							char rE211 = restart211.charAt(0);

							switch (rE211)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}
						} 
						else if (R21.equalsIgnoreCase("b"))
						{ 
							// ROUTE 2.1.2 : STAY FOR NOTHING BUT FILLER STATEMENTS ** 

							System.out.println("\"You don't want to leave?\" \"How strange...\"");
							System.out.println("\"Here, have some coffee.\""); 
							System.out.println("The coffee pot is emptied quickly. The rabbits sit around.");
							System.out.println("\"Truly, there is nothing for us to do here. It's just filler for the CYOA assignment.\""); 
							System.out.println("\"Why don't you restart this game for a better route, perhaps?\""); 
							System.out.println("\n-NO END-"); 
							System.out.println("\nRestart timeline? (You really should!)"
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart212 = input.nextLine( );
							char rE212 = restart212.charAt(0);

							switch (rE212)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}

						} 
						else 
						{ 
							// ROUTE 2.1.3 : TERMINAL VELOCITY EXPERIMENT **  

							System.out.println("\""+name+" is not replying again.\""); 
							System.out.println("\"That's okay. I, too, tend to mispress buttons.\""); 
							System.out.println("\"What should we do with it now?\""); 
							System.out.println("The rabbits look at one another."); 
							System.out.println("\nIn the end, they decide to throw you out the nearest window to test out "
									+ "the terminal velocity of a human.");
							System.out.println("\n-BAD END-"); 
							death++;
							System.out.println("\nRestart timeline? "
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart213 = input.nextLine( );
							char rE213 = restart213.charAt(0);

							switch (rE213)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}
						}


					}
					else if (R2.equalsIgnoreCase("b"))
					{ 
						// ROUTE 2.2 : SILENCE MAKES MERRY **

						System.out.println("Silence...");
						System.out.println("How awkward...");
						System.out.println("\"You just wanna go out to the RASA Ames cafeteria in Cali? The pizza's pretty good.\"");
						System.out.println("\"Mmn! No-one needs to hear some excuse of a plotline...if that even existed!\"");
						System.out.println("Seeing nothing better to do, you dine out with the RASA scientists.");
						System.out.println("\n-GOOD(?) END-"); 
						System.out.println("\nRestart timeline? "
								+ "\nA) YES"
								+ "\nB) NO ");
						String restart22 = input.nextLine( );
						char rE22 = restart22.charAt(0);

						switch (rE22)
						{
						case 'a':
						case 'A': 
							System.out.println("\nTimeline restarted.");
							break; 
						case 'b':
						case 'B': 
							count++;
							System.out.println("\nThank you for playing this game!");
							System.out.println("You have died "+death+" times in all timelines!");
							break;
						}

					}
					else if (R2.equalsIgnoreCase("c"))
					{
						// ROUTE 2.3 : ASSASINATION **

						System.out.println("What the in the world are you going to fight them off with? Your fists?");
						System.out.println("You try to, anyways. For the fun of it, perhaps?");
						System.out.println("You leap to land a good punch on them, but it seems like they got you first.");
						System.out.println("The floor was quickly retracted to reveal a second floor scattered with sharpest legos known to bunny/humankind.");
						System.out.println("\"Hahaha, you thought you could get us?\"");
						System.out.println("By the way, one of the suited rabbits fainted from your punch. Jokes on them.");
						System.out.println("Some bunny bodyguard that was sitting somewhere in the shadows drags you to bunny prison.");
						System.out.println("\n...there could've been a cooler plot than this, but it didn't. Sorry.");
						System.out.println("\n-BAD END-");
						System.out.println("\nRestart timeline? "
								+ "\nA) YES"
								+ "\nB) NO ");
						String restart23 = input.nextLine( );
						char rE23 = restart23.charAt(0);

						switch (rE23)
						{
						case 'a':
						case 'A': 
							System.out.println("\nTimeline restarted.");
							System.out.println("");
							break; 
						case 'b':
						case 'B': 
							count++;
							System.out.println("\nThank you for playing this game!");
							System.out.println("You have died "+death+" times in all timelines!");
							break;
						}

					}
					else if (R2.equalsIgnoreCase("d"))
					{
						// ROUTE 2.4 : THE REAL 4TH-WALL BREAKING STUFF **

						System.out.println("\"I am sure the creator doesn't even know what the hell she's doing. Haha.\"");
						System.out.println("\"She wanted this to be funny AND scary AND have a deep plot, but she's not a writer. She's a freaking programmer in a CSA class.\"");
						System.out.println("\"Oh! The stuff she codes first are the joke/ filler arcs instead of focusing on the main space route.\"");
						System.out.println("\"And she really wanted to do something on space...\"");
						System.out.println("A moment of silence ensues.");
						System.out.println("\"She also breaks the 4th wall too much, thinking that it's 'funny.'\"");
						System.out.println("More silence.");
						System.out.println("\n\"Carrots! Y-you know too much now, don't you?! We have to silence you!\"");
						System.out.println("\nYou find yourself quickly gagged and strapped in an...inflatable bouncy house.");
						System.out.println("\"You can't escape now, "+name+" ! Fire at will!\"");
						System.out.println("You would think that you would be shot to death with medieval weapons. Instead, cannons shoot adorable stuffed rabbits at you.");
						System.out.println("You suffocate to death because the rabbits were a bit too fluffy and fat.");
						System.out.println("\n-??? END-"); 
						death++;
						System.out.println("\nRestart timeline? "
								+ "\nA) YES"
								+ "\nB) NO ");
						String restart24 = input.nextLine( );
						char rE24 = restart24.charAt(0);

						switch (rE24)
						{
						case 'a':
						case 'A': 
							System.out.println("\nTimeline restarted.");
							System.out.println("");
							break; 
						case 'b':
						case 'B': 
							count++;
							System.out.println("\nThank you for playing this game!");
							System.out.println("You have died "+death+" times in all timelines!");
							break;
						}

					}
					else
					{
						// ROUTE 2.5 : MCD'S **

						System.out.println("\"It's not responding? Again? This happened in waaay too many timelines.\"");
						System.out.println("A rabbit perks up. \"Do you think humans can be made into hamburger meat? Let's do that this time!\"");
						System.out.println("\nThus you were sold as a Human Mac at the local Apocolyptic McDonald's.");
						System.out.println("\n-BAD END-"); 
						death++;
						System.out.println("\nRestart timeline? "
								+ "\nA) YES"
								+ "\nB) NO ");
						String restart25 = input.nextLine( );
						char rE25 = restart25.charAt(0);

						switch (rE25)
						{
						case 'a':
						case 'A': 
							System.out.println("\nTimeline restarted.");
							System.out.println("");
							break; 
						case 'b':
						case 'B': 
							count++;
							System.out.println("\nThank you for playing this game!");
							System.out.println("You have died "+death+" times in all timelines!");
							break;
						}

					}

					break;
				case 'c':
				case 'C':

					// ROUTE 3.0 : ALT ARC **

					System.out.println("\"Ah, you don't like space? I thought everyone liked space and aliens!\"");
					System.out.println("\"No worries. I assume you like technology instead? Tech has always been something of fascination. You might be very good at it!\"");
					System.out.println("What should you do now?");
					System.out.println("A) Take the challenge. Do it.");
					System.out.println("B) Ask to do something that's not...that.");
					System.out.println("C) Ask for a math problem. Impress them."); 
					String R3 = input.nextLine( );
					if ( R3.equalsIgnoreCase("a") )
					{
						// ROUTE 3.1.0 : COMPUTER ESSENTIALS **

						System.out.println("\"Great! We found a couple of computer parts from the 2000's or older.\"");
						System.out.println("The other rabbit comments, \"It seemed like they had touch screens, but they don't have the advanced robots we have or the iPhone-666.\"");
						System.out.println("\"Either way, the majority of hardware they had then are very outdated in today's terms.\"");
						System.out.println("A rabbit holds up a basic optical disk drive and an empty chassis. \"Do you know where this goes?\"");
						System.out.println("\nA) 5.25 inch drive bay.");
						System.out.println("B) 3.5 inch drive bay.");
						System.out.println("C) PCIe slot."); 
						System.out.println("D) RAM slot.");
						String RDante = input.nextLine( );
						char RD = RDante.charAt(0);
						switch (RD)
						{
						case 'a':
						case 'A':  
							// ROUTE 3.1.1 : RIGHT ANSWER **

							System.out.println("The ODD fits in.");
							System.out.println("\"Uwah! So you aren't stupid, aren't yah?\"");
							System.out.println("\"But it's just the basics...\" a rabbit cynically jabs.");
							System.out.println("\"Nonetheless, we have "+name+" here who knows what it's doing with these old pieces of junk!\"");
							System.out.println("\nYou are then sentenced to a lifetime of IT support at the local RASA-affiliated tech support place.");
							System.out.println("\n-??? END-");
							System.out.println("\nRestart timeline? "
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart311 = input.nextLine( );
							char rE311 = restart311.charAt(0);

							switch (rE311)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								System.out.println("");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}
							break;
						case 'b':
						case 'B':
							// ROUTE 3.1.2 : WRONG ANSWER **

							System.out.println("One of the suited rabbits politely corrects you. \"It's for the hard disk drive.\"");
							System.out.println("\"Idiot.\" The other one not-so-politely adds.");
							System.out.println("\"But it's kinda close? Close enough?\""); 
							System.out.println("\"It's not enough to be considered useful in RASA.\"");
							System.out.println("\"Maybe you're better off doing nothing...\""); 
							System.out.println("Thus you were promptly sent back to your mother's basement.");
							System.out.println("\n-??? END-");
							System.out.println("\nRestart timeline? "
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart312 = input.nextLine( );
							char rE312 = restart312.charAt(0);

							switch (rE312)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								System.out.println("");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}
							break;
						case 'c':
						case 'C':
						case 'd':
						case 'D': 
							// ROUTE 3.1.3 : ABSOLUTELY WRONG ANSWER ** 

							System.out.println("It doesn't fit. The rabbits look at you disappointingly.");
							System.out.println("\"Maybe you doesn't belong at RASA. What were we thinking?\"");
							System.out.println("Why are you even here?");
							System.out.println("You try to remember but your memories are foggy. You just remember staring at a dying sky with fading stars--");
							System.out.println("\nAw, who am I kidding? The only reason why you're in this situation is because you're grading someone's CYOA.");
							System.out.println("\nThe rabbits escort you to a small basement after a small pity session.");
							System.out.println("\"There's someone in here that likes human flesh. I think you'll do fine in that regard.\"");
							System.out.println("They close the metal door behind them and leave you alone in the dark basement.");
							System.out.println("\n-BAD END-");
							death++;
							System.out.println("\nRestart timeline? "
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart313 = input.nextLine( );
							char rE313 = restart313.charAt(0);

							switch (rE313)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								System.out.println("");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}
							break;
						}
					}
					else if ( R3.equalsIgnoreCase("b") )
					{
						// ROUTE 3.2 : PORTALS AND DISPOSALS **

						System.out.println("\"You're a picky piece of shi--oh, I meant a displeasing piece of merde. Oui, oui.\"");
						System.out.println("The suited rabbit that spoke seems rather irratated, but before speaking,  "
								+ "is interrupted by the other rabbit.");
						System.out.println("\"Now, now, that's no way to speak to it. There must be a job opportunity somewhere...\"");
						System.out.println("The rabbit thinks for a moment. \"You know what? You are kinda useless. "
								+ "Sorry. But, hey, you are surely fit to be a test subject!\"\n");
						System.out.println("A strange contraption is handed to you. "
								+ "It's sleek white interior and the wires underneath hint a sci-fi feeling. It glows a soft blue.");
						System.out.println("\"It's the Portal Gun 6000! "
								+ "Too bad the company that made it perished from bad management and rebellious subjects.\"");
						System.out.println("The rabbit shoots it for you."
								+ " A blue portal forms to go to a different part of the building with, from what you see, carrot wallpaper.");
						System.out.println("You feel a kick from behind, and you find yourself going through the portal.");
						System.out.println("\"Wait, where is the orange portal again?\" You hear one of the rabbits question.");
						System.out.println("\nAt a disposal area, apparently. "
								+ "You go head first into a grinder grinding at 500 RPM (surrounded by the seemingly-cute carrot wallpaper).");
						System.out.println("The red stains from the accident took a few hours to clean.");
						System.out.println("\n-BAD END-");
						System.out.println("\nRestart timeline? "
								+ "\nA) YES"
								+ "\nB) NO ");
						String restart32 = input.nextLine( );
						char rE32 = restart32.charAt(0);

						switch (rE32)
						{
						case 'a':
						case 'A': 
							System.out.println("\nTimeline restarted.");
							System.out.println("");
							break; 
						case 'b':
						case 'B': 
							count++;
							System.out.println("\nThank you for playing this game!"); 
							System.out.println("You have died "+death+" times in all timelines!");
							break;
						}

					}
					else if ( R3.equalsIgnoreCase("c") )
					{
						// ROUTE 3.3.0 : POTENTIAL PLEIADES RECRUITMENT **

						System.out.println("\"Eh?\" The rabbits stare in confusion. \"O-okay, why not?\"");
						System.out.println("One of the rabbits pull out a big blue book.  "
								+ "The title states 'PHYSICS FOR SCIENTISTS AND ENGINEERS.'");
						System.out.println("\"This was someone's homework from 2017, I would think...\""); 
						double funTimes = Math.random(); 
						double answer;  

						/*Random math problem generator : 
						 *Cheating is not encouraged. Please do your best to do the problems without going here. 
						 *If you're looking here for the answers, just don't. 
						 *I had to do this without Google. 
						 *JK, I didn't. :-) 
						 *Feel free to look at the answers if you're desperate. */ 

						if (funTimes>0 && funTimes<0.5)
						{ 
							System.out.println("\n\"In a nuclear power plant the fuel rods last 3 yr before they are replaced. "
									+ "\nIf a plant with rated thermal power 1.00 GW operates at 80.0% capacity for 3.00 yr, "
									+ "what is the loss of mass of the fuel?\""); 
							answer = 0.842;
						} 
						else
						{ 
							System.out.println("\n\"An Earth satellite used in the global positioning system moves in "
									+ "a circular orbit with period 11 h 58 min. Determine the radius of its orbit.\""); 
							answer = 26.6;
						}

						System.out.println("\nType in your answer. \n[Solve to three significant places. Decimals if necessary. Don't type in the units.]");
						double theirAns= input.nextDouble( ); 

						if (theirAns==answer)
						{ 
							//ROUTE 3.3.1 : RECRUITMENT **  

							System.out.println("\"Good job,"+name+" ! You're not as useless as I thought you were..."
									+ "I can see your potential already!\"");
							System.out.println("\"If you don't like space, do you want to work on our Pleiades super computer?\"");
							System.out.println("\"Or even our wind tunnels! They'd like a physist like you there.\""); 
							System.out.println("Without waiting for your answer, they hastily drag you to the "
									+ "computer room to get you acquainted"
									+ " with your new colleagues.");
							System.out.println("\nGetting $130,000 as a salary isn't so bad."); 
							System.out.println("\n-GOOD END-"); 
							System.out.println("\nRestart timeline? "
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart331 = input.nextLine( );
							char rE331 = restart331.charAt(0);

							switch (rE331)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								System.out.println("");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}
						}
						else 
						{  
							//ROUTE 3.3.2 : SCHOOLING REQUIRED **

							System.out.println("\"You can't even solve a problem like that...? This is elementary stuff!\""); 
							System.out.println("Elementary stuff?");
							System.out.println("I'd still like to utilize you without, you know, unpleasant things..."); 
							System.out.println("Why don't we send him to school?");
							System.out.println("Amazing idea, Korabl-Sputnik!"); 
							System.out.println("Thus you were sent to repeat school, grades K-12."); 
							System.out.println("\n-WORST END-"); 
							System.out.println("\nRestart timeline? "
									+ "\nA) YES"
									+ "\nB) NO ");
							String restart332 = input.nextLine( );
							char rE332 = restart332.charAt(0);

							switch (rE332)
							{
							case 'a':
							case 'A': 
								System.out.println("\nTimeline restarted.");
								System.out.println("");
								break; 
							case 'b':
							case 'B': 
								count++;
								System.out.println("\nThank you for playing this game!");
								System.out.println("You have died "+death+" times in all timelines!");
								break;
							}

						}

					}
					else
					{
						// ROUTE 3.4 : FISHY END-ERTAINMENT **

						System.out.println("\"It isn't responding properly? I swear it could communicate just a minute ago!\"");
						System.out.println("\"It's a darn pity, but we must dispose of gears that can't function in society.\"");
						System.out.println("Underneath, a hidden platform opens up.");
						System.out.println("You are dropped into a lake full of koi.");
						System.out.println("It doesn't seem like much, but they haven't been fed for several days. "
								+ "They also seem to be mutated...having legs and sharp teeth, for example.");
						System.out.println("Your skin is picked at for eternity, providing a constant nourishment for this species.");
						System.out.println("\n-BAD END-");
						death++;
						System.out.println("\nRestart timeline? "
								+ "\nA) YES"
								+ "\nB) NO ");
						String restart34 = input.nextLine( );
						char rE34 = restart34.charAt(0);

						switch (rE34)
						{
						case 'a':
						case 'A': 
							System.out.println("\nTimeline restarted.");
							break; 
						case 'b':
						case 'B': 
							count++;
							System.out.println("\nThank you for playing this game!");
							System.out.println("You have died "+death+" times in all timelines!");
							break;
						}
					}


					break;
				case 'd':
				case 'D':

					// ROUTE 4.0 : ESCAPE ARC **

					System.out.println("You quickly dash out of your leather seat, leaping for the nearest exit.");
					System.out.println("But where was the exit? What are these suited rabbit? What is this mushroom-created dream?");
					System.out.println("Looking around in the dark, the projector's light reflects on a purple door opposite of the seat. There it is!");
					System.out.println("But to the side of it was a green door that looks just as good of an exit.");
					System.out.println("\"Stop it!\" a rabbit screeches.");
					System.out.println("And then...");
					
					System.out.println("\nDue to unfortunate time constraints the creator found herself in, she is unable to create any more choices.");
					System.out.println("Let's pretend that you tripped on a lego block and got captured and killed. The end.");
					
					System.out.println("\n-BAD END-"); 
					death++;
					System.out.println("\nRestart timeline? "
							+ "\nA) YES"
							+ "\nB) NO ");
					String restart4 = input.nextLine( );
					char rE4 = restart4.charAt(0);

					switch (rE4)
					{
					case 'a':
					case 'A': 
						System.out.println("Timeline restarted.");
						break; 
					case 'b':
					case 'B': 
						count++;
						System.out.println("\nThank you for playing this game!");
						System.out.println("You have died "+death+" times in all timelines!");
						break;
					}

					break;
				default: 

					// ROUTE 5.0 : DENIAL **

					System.out.println("A voice murmurs in the background, \"It doesn't seem to be speaking properly. Perhaps it's broken?\"");
					System.out.println("\"Ah, you are very right! Feed him to the rabbits.\"\n");
					System.out.println("Confusingly, the speakers themselves are rabbits.  "
							+ "Nonetheless, you are stabbed from behind immediately.");
					System.out.println("Your corpse is then thrown through the disposal tube.");
					System.out.println("You don't really know what happened next...");
					System.out.println("But the 'Daily Rabbit' reports human cranium pieces scattered throughout the RASA premises. "
							+ "The other body parts were not found.");
					System.out.println("On the other hand, the sweets store 'Chocological' has begun selling metallic red jam with "
							+ "mysterious pieces of "+name+" inside for the rabbit population.");
					
					System.out.println("\n-BAD END-"); 
					death++;
					System.out.println("\nRestart timeline? "
							+ "\nA) YES"
							+ "\nB) NO ");
					String restart5 = input.nextLine( );
					char rE5 = restart5.charAt(0);

					switch (rE5)
					{
					case 'a':
					case 'A': 
						System.out.println("\nTimeline restarted.");
						break; 
					case 'b':
					case 'B': 
						count++;
						System.out.println("\nThank you for playing this game!");
						System.out.println("You have died "+death+" times in all timelines!");
						break;  
				
					}
					break;

				}
			} 
		}
	} 
}


