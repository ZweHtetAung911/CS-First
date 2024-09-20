// Written by Zwe Htet Aung
// Wednesday, September 18, 2024
// Lab 6
// This program calculates and displays student test scores.
// It shows the highest, the lowest, and average scores.

import java.util.Scanner;

public class Test_scores
{
	public static void main(String[] args)
	{
		int testScore, counter, total,
		highest, lowest, average;
		Scanner keyboard = new Scanner(System.in);

		System.out.println ("Enter a test score. \n" 
				   + "Enter -1 to exit.");		
		testScore = keyboard.nextInt ();
		counter = 0;
		total = 0;
		highest = testScore;
		lowest = testScore;

		while (testScore >= 0) 
		{
			counter++;
			total += testScore;

			if (testScore > highest)
			{
				highest = testScore;
			}

			if (testScore < lowest)
			{
				lowest = testScore;
			}

		System.out.println ("Enter a test score. \n" 
				   + "Enter -1 to exit.");
		testScore = keyboard.nextInt ();
		}
		
		average = total / counter;

		System.out.println (" The number of scores entered: " + 
				   counter + "\n The highest score: " +
				   highest + "\n The lowest score: " +
				   lowest + "\n The arithmetic average: "
				   + average);
	}
}


