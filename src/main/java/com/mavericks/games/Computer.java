package com.mavericks.games;

public class Computer {

	GameService gameService = new GameService();

	public void play() {
		gameService.computersFight();
	}

}
