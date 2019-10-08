package com.mavericks.games;

public enum Choices {
	ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors");

	String choice;

	private Choices(String choice) {
		this.choice = choice;
	}

	public String getChoice() {
		return choice;
	}
};
