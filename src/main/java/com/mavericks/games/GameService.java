package com.mavericks.games;

import java.util.Random;
import java.util.Scanner;

public class GameService {

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	String[] CHOICES = new String[] { "Rock", "Paper", "Scissors" };

	public void playerFightsCPU() {

		System.out.println("Begin battle:\nPlayer, Choose your option: 1.Rock   2.Paper   3.Scissors");

		int playerPick = scanner.nextInt();
		
		//prompt player to chose the right option
		while(true) {
			if(playerPick>3) {
				System.out.println("Please select a valid Option:\n");
				playerPick = scanner.nextInt();
			}else {
				break;
			}
		}

		String playerChoice = CHOICES[playerPick - 1];

		String computerChoice = CHOICES[random.nextInt(3)];
		
		System.out.println("Player chose: "+playerChoice+"\n");
		
		System.out.println("Computer chose: "+computerChoice+"\n");
		
		if(playerChoice.equalsIgnoreCase(computerChoice)) {
			System.out.println("It's a Draw");
		}else if(playerChoice.equalsIgnoreCase("Rock")) {
			if(computerChoice.equalsIgnoreCase("Paper")) {
				System.out.println("Computer wins");
			}
			if(computerChoice.equalsIgnoreCase("Scissors")) {
				System.out.println("Player wins");
			}
		}else if(playerChoice.equalsIgnoreCase("Paper")) {
			if(computerChoice.equalsIgnoreCase("Scissors")) {
				System.out.println("Computer wins");
			}
			if(computerChoice.equalsIgnoreCase("Rock")) {
				System.out.println("Player wins");
			}
		}else{
			if(computerChoice.equalsIgnoreCase("Rock")) {
				System.out.println("Computer wins");
			}
			if(computerChoice.equalsIgnoreCase("Paper")) {
				System.out.println("Player wins");
			}
		}

	}

	public void computersFight() {

		System.out.println("Begin battle:\n");

		String cpu1 = CHOICES[random.nextInt(3)];

		String cpu2 = CHOICES[random.nextInt(3)];
		
		System.out.println("CPU-1 chose: "+cpu1+"\n");
		
		System.out.println("CPU-2 chose: "+cpu2+"\n");
		
		if(cpu1.equalsIgnoreCase(cpu2)) {
			System.out.println("It's a Draw");
		}else if(cpu1.equalsIgnoreCase("Rock")) {
			if(cpu2.equalsIgnoreCase("Paper")) {
				System.out.println("Computer-2 wins");
			}
			if(cpu2.equalsIgnoreCase("Scissors")) {
				System.out.println("Computer-1 wins");
			}
		}else if(cpu1.equalsIgnoreCase("Paper")) {
			if(cpu2.equalsIgnoreCase("Scissors")) {
				System.out.println("Computer-2 wins");
			}
			if(cpu2.equalsIgnoreCase("Rock")) {
				System.out.println("Computer-1 wins");
			}
		}else{
			if(cpu2.equalsIgnoreCase("Rock")) {
				System.out.println("Computer-2 wins");
			}
			if(cpu2.equalsIgnoreCase("Paper")) {
				System.out.println("Computer-1 wins");
			}
		}
	}

}
