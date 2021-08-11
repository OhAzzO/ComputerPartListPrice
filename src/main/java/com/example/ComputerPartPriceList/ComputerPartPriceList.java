package com.example.ComputerPartPriceList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ComputerPartPriceList {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		System.out.println("hello, Please provide the amount you would like to spend on your new PC " +
				"and we can help with part selection.");
		int UserFunds = scanner.nextInt();

		//MotherBoard
		int lowEndMotherBoard = 70;
		int highEndMotherBoard = 110;

		//CPU
		int lowEndCPU = 70;
		int highEndCPU = 110;

		//RAM
		int lowEndRAM = 30;
		int highEndRAM = 150;

		//Storage
		int lowEndStorage = 30;
		int highEndStorage = 170;

		//Power Supply
		int lowEndPowerSupply = 60;
		int highEndPowerSupply = 200;

		//Graphics Card
		int lowEndGraphicCard = 250;
		int highEndGraphicCard = 1200;
		//case

		//Totals price of parts
		int lowEndTotal = lowEndCPU + lowEndRAM + lowEndStorage + lowEndMotherBoard + lowEndPowerSupply + lowEndGraphicCard;
		int HighEndTotal = highEndCPU + highEndRAM + highEndStorage + highEndMotherBoard + highEndPowerSupply + highEndGraphicCard;

		// a suggestion for the best parts for you build determined on the users price range
		if (UserFunds >= highEndMotherBoard + highEndCPU + highEndRAM + highEndStorage + highEndPowerSupply + highEndGraphicCard){
			System.out.println("HighEnd Computer available. " + "Total cost is " + HighEndTotal);
		}else if (UserFunds <= highEndMotherBoard + highEndCPU + highEndRAM + highEndStorage + highEndPowerSupply + highEndGraphicCard && UserFunds > lowEndTotal){
			System.out.println("LowEnd Computer available. "  + "Total cost is " + lowEndTotal);
		}else if(UserFunds < lowEndMotherBoard + lowEndCPU + lowEndRAM + lowEndStorage + lowEndPowerSupply + lowEndGraphicCard){
			System.out.println("Computers in Stock not available for you price range, please check back later.");
		}




	}

}
