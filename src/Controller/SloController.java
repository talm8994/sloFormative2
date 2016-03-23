package Controller;

import java.util.Scanner;
import java.util.Random;

public class SloController
{
	String personsPlay;
	String computerPlay = "";
	int computerInt;
	
	String response;
	
	Scanner scan = new Scanner(System.in);
	Random generator = new Random();
	
	public void Ask()
	{
		System.out.println("lets play RPS");
		 if (computerInt == 1);
		 computerPlay = "R";
		 if (computerInt == 2);
		 computerPlay = "P";
		 if (computerInt == 3)
			 computerPlay = "S";
		 
		 System.out.println("what do you pick: ");
		 personsPlay = scan.next();
		 
		 System.out.println("computer played" + computerPlay);
		 
		 if(personsPlay.equals(computerPlay))
			 System.out.println("its a tie");
		 else if(personsPlay.equals ("R"))
			 if (computerPlay.equals("S"))
				 System.out.println("You Win!!1");
		 else if(personsPlay.equals("S"))
				 if(computerPlay.equals("P"))
					 System.out.println("you win");
		else if(personsPlay.equals(""))
	}
	
	

}
