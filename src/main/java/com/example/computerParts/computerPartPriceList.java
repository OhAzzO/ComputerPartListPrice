package com.example.computerParts;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class computerPartPriceList {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String restart;

		do {
			//greeting output
			System.out.println("Hello, please provide the amount you would like to spend on your new PC " +
					"and we can help with part recommendations.");
			int userFunds = scanner.nextInt();

			//setup variable
			// MotherBoard price.
			int lowEndMotherBoard = 70;
			int highEndMotherBoard = 110;

			// CPU price.
			int lowEndCPU = 70;
			int highEndCPU = 110;

			// RAM price.
			int lowEndRAM = 30;
			int highEndRAM = 150;

			// Storage price.
			int lowEndStorage = 30;
			int highEndStorage = 170;

			// Power Supply price.
			int lowEndPowerSupply = 60;
			int highEndPowerSupply = 200;

			// Graphics Card price.
			int lowEndGraphicCard = 200;
			int highEndGraphicCard = 1200;

			//case price.
			int lowEndCase = 70;
			int highEndCase = 200;


			//Totals price of parts.
			int lowEndTotal = lowEndCPU + lowEndRAM + lowEndStorage + lowEndMotherBoard + lowEndPowerSupply + lowEndGraphicCard + lowEndCase;
			int highEndTotal = highEndCPU + highEndRAM + highEndStorage + highEndMotherBoard + highEndPowerSupply + highEndGraphicCard + highEndCase;

			// How much more needed for high-end computer.
			int howMuchNeededForLowEnd = lowEndTotal - userFunds;

			// How much more needed for high-end computer.
			int howMuchNeededForHighEnd = highEndTotal - userFunds;

			// A suggestion for the best parts for you build determined on the users price range and how much needed for low end computer.
			if (userFunds >= highEndMotherBoard + highEndCPU + highEndRAM + highEndStorage + highEndPowerSupply + highEndGraphicCard) {
				System.out.println("HighEnd Computer available. " + "Total cost is $" + highEndTotal);
			} else if (userFunds <= highEndTotal && userFunds > lowEndTotal) {
				System.out.println("LowEnd Computer available. " + "Total cost is $" + lowEndTotal + ", and $"
						+ howMuchNeededForHighEnd + " is needed for the purchase of a high end computer");
			} else if (userFunds < lowEndTotal) {
				System.out.println("Computers in Stock are not available for your price range, $" + howMuchNeededForLowEnd
						+ " is needed for the purchase of a low end computer " + "please try again or check back later.");
			}
			// Try catch for input.
			try {
				//While loop to restart the process again.
				System.out.println("Do you want to find another computer? Yes or No.");
				restart = scanner.next();
				boolean errorYOrNInput = true;

			} catch (Exception e) {
				System.out.println("Please select Yes or No.");
				restart = scanner.next();
			}
		}while (restart.equalsIgnoreCase("Yes")) ;

	}

}

