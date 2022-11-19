package com.example.dice;

import java.util.Random;

public class RandomDiceNumberGenerator extends DiceGenerator {
    private final Random random = new Random();   // 난수발생기
    private DiceVo vo;                     // Dice객체

    @Override
    public DiceVo getDiceVo() {
        return vo;
    }

    public void execute() {
        vo = new DiceVo();
        for (int i = 0; i < 20; i++) {
            setDice();
            notifyObservers();
        }
    }

    private void setDice(){
        for (int i = 0; i < DiceConfig.DICE_CNT; i++) {
            vo.getDiceArr()[i] = random.nextInt(6) + 1;
        }
    }
}
