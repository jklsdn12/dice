package com.example.dice;

public class Test {
    public static void main(String[] args) {
        DiceConfig.loadData();
        DiceGenerator diceGenerator = new RandomDiceNumberGenerator();
        diceGenerator.addObserver(new DigitObserver());
        diceGenerator.addObserver(new StarObserver());
        diceGenerator.execute();
    }
}
