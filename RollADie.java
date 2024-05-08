package rolladie;



import java.util.Random;



public class RollADie {
	
    public static void main (String[] args)
    {
	Random generator = new Random();
	int die1 = generator.nextInt(6);
	die1++;
	int die2 = generator.nextInt(6);
	die2++;
	int totalRoll;
	totalRoll = die1 + die2;

	if(totalRoll == 2) {
		System.out.println("You rolled Snake Eyes!");
	}
	System.out.println();
	System.out.println ("You rolled " + die1 + " and " + die2 +
 " for a total of " + totalRoll + ".");
	System.out.println();
    }
  
    
}
