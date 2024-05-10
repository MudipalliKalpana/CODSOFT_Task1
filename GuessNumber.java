package codsoft_internship;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
	public static void main(String args[]) {
		Random r = new Random();
		Scanner scr = new Scanner(System.in);
		int randomNumber = r.nextInt(100)+1;
		int attempts=0;
		int point=5;
		System.out.println("Let's start the  guessing number game..!!");
		do {
			System.out.println("Enter the number:");
			int guess = scr.nextInt();
			if(guess<randomNumber) {
				System.out.println("Too Low!! Try again.");
			}
			else if(guess>randomNumber) {
				System.out.println("Too High!! Try again");
			}
			else {
				System.out.println("Congrats!! your guess is correct,"
						+" At an attempt of "+(attempts+1));
				System.out.println("your points="+point);
				break;
			}
			attempts++;
			point--;
		}while(attempts<5);
		System.out.println();
		System.out.println();
		if(attempts>=5) {
			System.out.println("Oops!!Out of attempts.");
		}
	}
}
