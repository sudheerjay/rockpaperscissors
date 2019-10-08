package com.mavericks.games;

import java.util.Scanner;

public class Play {
	public static void main(String[] args) {
		Human human = new Human();
		Computer computers = new Computer();
		
		System.out.println("Choose your Option:\n" + "1. Player vs Computer\n2. Computer vs Computer");
		
		Scanner in = new Scanner(System.in);
		int option = in.nextInt();
		
		while (true) {
			switch (option) {
			case 1:
				human.play();
				System.exit(0);
			case 2:
				computers.play();
				System.exit(0);
			default:
				//prompt player to chose the right option
				System.out.println("Please select a valid Option:\n");
				option = in.nextInt();
			}
		}
	}
}
