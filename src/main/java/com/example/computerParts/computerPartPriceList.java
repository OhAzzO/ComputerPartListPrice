package com.example.computerParts;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class computerPartPriceList {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String restart;
		do {
		System.out.println("Hello, please provide the amount you would like to spend on your new PC " +
				"and we can help with part recommendations.");
		int userFunds = scanner.nextInt();

		// MotherBoard
		int lowEndMotherBoard = 70;
		int highEndMotherBoard = 110;

		// CPU
		int lowEndCPU = 70;
		int highEndCPU = 110;

		// RAM
		int lowEndRAM = 30;
		int highEndRAM = 150;

		// Storage
		int lowEndStorage = 30;
		int highEndStorage = 170;

		// Power Supply
		int lowEndPowerSupply = 60;
		int highEndPowerSupply = 200;

		// Graphics Card
		int lowEndGraphicCard = 200;
		int highEndGraphicCard = 1200;

		//case
		int lowEndCase = 70;
		int highEndCase = 200;


		//Totals price of parts
		int lowEndTotal = lowEndCPU + lowEndRAM + lowEndStorage + lowEndMotherBoard + lowEndPowerSupply + lowEndGraphicCard + lowEndCase;
		int highEndTotal = highEndCPU + highEndRAM + highEndStorage + highEndMotherBoard + highEndPowerSupply + highEndGraphicCard + highEndCase;

		// How much more for low end

		// A suggestion for the best parts for you build determined on the users price range
		if (userFunds >= highEndMotherBoard + highEndCPU + highEndRAM + highEndStorage + highEndPowerSupply + highEndGraphicCard) {
			System.out.println("HighEnd Computer available. " + "Total cost is $" + highEndTotal);
		} else if (userFunds <= highEndTotal && userFunds > lowEndTotal) {
			System.out.println("LowEnd Computer available. " + "Total cost is $" + lowEndTotal);
		} else if (userFunds < lowEndTotal) {
			System.out.println("Computers in Stock not available for you price range, please check back later.");
			System.out.println();
		}

		System.out.println("Do you want to find another computer? Yes or No");
		restart = scanner.next();
		} while (restart.equalsIgnoreCase("Yes"));



	}

}
