package practice;

import java.util.Random;
import java.util.Scanner;

public class rebet {

	
		

		  public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();

		        boolean continuePlaying = true;

		        while (continuePlaying) {
		            System.out.println("Press 'r' to roll the dice, or 'q' to quit.");
		            String input = scanner.nextLine();

		            if (input.equalsIgnoreCase("q")) {
		                continuePlaying = false;
		                System.out.println("Thank you for playing!");
		            } else if (input.equalsIgnoreCase("r")) {
		                int die1 = random.nextInt(6) + 1;
		                int die2 = random.nextInt(6) + 1;
		                int total = die1 + die2;

		                System.out.println("You rolled a " + die1 + " and a " + die2 + ". The total is: " + total);
		            } else {
		                System.out.println("Invalid input. Please enter 'r' to roll or 'q' to quit.");
		            }
		        }

		        scanner.close();
		    
		  }

	}


