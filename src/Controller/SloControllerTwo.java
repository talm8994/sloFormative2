package Controller;

import java.util.Scanner;
import java.util.Random;

public class SloControllerTwo
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
		 computerPlay = " Rock";
		 if (computerInt == 2);
		 computerPlay = " Paper";
		 if (computerInt == 3)
			 computerPlay = " Sissors";
		 
		 System.out.println("what do you pick: ");
		 personsPlay = scan.next();
		 
		 System.out.println("computer played" + computerPlay);
		 
		 if(personsPlay.equals(computerPlay))
			 System.out.println("its a tie");
		 else if(personsPlay.equals (" Rock"))
			 if (computerPlay.equals(" Sissors"))
				 System.out.println("You Win!!1");
		 else if(personsPlay.equals(" Sissors"))
				 if(computerPlay.equals(" Paper"))
					 System.out.println("you win");
		else if(personsPlay.equals(" Paper"))
			if(computerPlay.equals(" Rock"))
				System.out.println("Win WIn WIn");
		else if(personsPlay.equals(" Rock"))
			if(computerPlay.equals(" Paper"))
				System.out.println("You loserrrr");
		else if(personsPlay.equals(" Paper"))
			if(computerPlay.equals(" Sissors"))
				System.out.println("lose 4 you");
		else if(personsPlay.equals(" Sissors"))
			if(computerPlay.equals(" Rock"))
				System.out.println("lose lose lose");
			
	}
	
	public void start()
	{
		Ask();
	}
	
	

}
