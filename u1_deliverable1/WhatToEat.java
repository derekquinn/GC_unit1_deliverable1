package u1_deliverable1;

import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] Args) {

		String partyType;
		String prepSuggestion = "";
		String result;
		String mealSuggestion = "";

		int partySize;

		Scanner scnrSize = new Scanner(System.in);
		Scanner scnrType = new Scanner(System.in);

		System.out.println("How many people are eating?");
		partySize = scnrSize.nextInt();

		System.out.println("Are you having a casual, semi-formal or formal dinner party?");
		partyType = scnrType.nextLine();
		partyType = partyType.toLowerCase();

		if (partySize <= 1) {

			prepSuggestion = "in the microwave.";
		}

		else if (partySize < 13 && partySize >= 2) {

			prepSuggestion = "in your kitchen.";
		}

		else if (partySize >= 13) {

			prepSuggestion = "by a caterer.";
		}
		


		switch (partyType) {

		case "casual":
			mealSuggestion = "sandwiches";
			break;

		case "semi-formal":
			mealSuggestion = "fried chicken";
			break;
		
		case "semi formal":
			mealSuggestion = "fried chicken";
			break;
		
		case "semiformal":
			mealSuggestion = "fried chicken";
			break;

		case "formal":
			mealSuggestion = "chicken parmesan";
			break;
		}

		result = "Since you’re hosting a " + partyType + " event for " + partySize + " participants, you should serve "
				+ mealSuggestion + " prepared " + prepSuggestion;

		System.out.println(result);

	}
}
