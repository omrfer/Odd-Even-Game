import java.util.Scanner;
import java.util.Random;

// Author @ Omar Fernandez

public class OddEvenGame {

	public static void main(String[] args) {
		Random rnumber = new Random();
		Scanner input = new Scanner(System.in);
		int cpunum = rnumber.nextInt(6) + 1;
		// System.out.println(cpunum);
		String guess, cpunumstring;
		int  games = 0, evens = 0, odds = 0, x, i;
		double win = 0, loss = 0;
		int [] diceArray;
		diceArray = new int[999];
		String[] userArray;
		userArray = new String[999];
		
		System.out.printf("A dice will roll a number between 1 and 6.%nDo you think the number is odd or even?%n");
		for (x=0; x < 999; x++ ) {
		if (cpunum % 2 == 0) {
			evens++;
			cpunumstring = "even";
		} else {
			odds++;
			cpunumstring = "odd";
		}
		// System.out.println(cpunumstring);
		guess = input.nextLine();
		if (guess.equalsIgnoreCase(cpunumstring)) {
			games++;
			win++;
			System.out.printf("That's right! The number was %d.", cpunum);
		} else {
			games++;
			loss++;
			System.out.printf("Wrong! The number was %d.%n",cpunum);
		}
		System.out.printf("The amount of games played is %d.%nThe amount of even numbers is %d.The amount of odd numbers is %d.%nYour win percentage is %f.%n",games,evens,odds, win/(win+loss));
		diceArray[games-1] = cpunum;
		userArray[games-1] = guess;
	//	System.out.println(diceArray[games-1]);
	//	System.out.println(userArray[games-1]);
		System.out.println("Game History");
		for (i = 0;i < games;i++ ) {
			System.out.printf("Game %d: Dice roll was %d. Guess was %s.%n",i+1,diceArray[i],userArray[i]);
		}
		
		System.out.printf("Let's reroll.%nIs it odd or even?");
		cpunum = rnumber.nextInt(6) + 1 ;
		}
		
	}

}