package com.mavericks.games;

public class Human {

	GameService gameService = new GameService();

	public void play() {
		gameService.playerFightsCPU();
	}

}
