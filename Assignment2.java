/*
* Author: Colin Bradshaw
*/
import java.util.Random;
import java.util.Scanner;
public class Assignment2{
	/*
	* Only method needed for number guessing game
	*/
	public static void main(String[] args){
		int uNum = -33;
		int randNum = -34;
		int attempts = 0;
		int difference = 11;
		
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();
		// number may be between 1 and 100, I am making an assumption that the intention in the asignment was inclusive
		randNum = rand.nextInt(100) + 1;
		
		// program logic
		do{
			System.out.print("Enter the number you would like to guess between 1-100: ");
			uNum = input.nextInt();
			
			difference = uNum - randNum;
			// if difference is in the range of -10 to 10, then the guessed nember was within 10 of the random number
			if(difference > -10 && difference < 10){
				// winning output
				System.out.println("You guessed :" + uNum + " and the number was :" + randNum);
			} else {
				// try again output
				attempts++;
				System.out.println("You have " + (5-attempts) + " more chances to guess the number.");
			}
			
		}while(attempts < 5 && !(difference > -10 && difference < 10));
		
		// output for if the player loses
		if (attempts == 5){
			System.out.println("Sorry, the number was: " + randNum);
		}
		
	}
}