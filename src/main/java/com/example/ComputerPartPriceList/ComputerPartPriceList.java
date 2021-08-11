package com.example.ComputerPartPriceList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ComputerPartPriceList {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		System.out.println("hello, Please provide the amount you would like to spend on your new PC and we can help with part selection.");
		int UserFunds = scanner.nextInt();

		//MotherBoard
		int LowEndMotherBoard = 70;
		int HighEndMotherBoard = 110;

		//CPU
		int LowEndCPU = 70;
		int HighEndCPU = 110;

		//RAM
		int LowEndRAM = 30;
		int HighEndRAM = 150;

		//Storage
		int LowEndStorage = 30;
		int HighEndStorage = 170;

		//Power Supply
		int LowEndPowerSupply = 60;
		int HighEndPowerSupply = 200;

		//Graphics Card
		int LowEndGraphicCard = 250;
		int HighEndGraphicCard = 1200;
		//case

		//Totals price of parts
		int LowEndTotal = LowEndCPU + LowEndRAM + LowEndStorage + LowEndMotherBoard + LowEndPowerSupply + LowEndGraphicCard;
		int HighEndTotal = HighEndCPU + HighEndRAM + HighEndStorage + HighEndMotherBoard + HighEndPowerSupply + HighEndGraphicCard;

		// a suggestion for the best parts for you build determined on the users price range
		if (UserFunds >= HighEndMotherBoard + HighEndCPU + HighEndRAM + HighEndStorage + HighEndPowerSupply + HighEndGraphicCard){
			System.out.println("HighEnd Computer available. " + "Total cost is " + HighEndTotal);
		}else if (UserFunds <= HighEndMotherBoard + HighEndCPU + HighEndRAM + HighEndStorage + HighEndPowerSupply + HighEndGraphicCard && UserFunds > LowEndTotal){
			System.out.println("LowEnd Computer available. "  + "Total cost is " + LowEndTotal);
		}else if(UserFunds < LowEndMotherBoard + LowEndCPU + LowEndRAM + LowEndStorage + LowEndPowerSupply + LowEndGraphicCard){
			System.out.println("Computers in Stock not available for you price range, please check back later.");
		}




	}

}
