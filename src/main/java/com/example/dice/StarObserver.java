package com.example.dice;

public class StarObserver  implements Observer {
    public void update(DiceGenerator generator)  {
        System.out.print("족보:");
        DiceVo vo = generator.getDiceVo();

        System.out.print(DiceConfig.getPredMap(vo.getPedigree()));

        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}