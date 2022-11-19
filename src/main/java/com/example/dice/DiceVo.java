package com.example.dice;

import java.util.Arrays;

public class DiceVo {
    private int[] diceArr = new int[DiceConfig.DICE_CNT];
    private int pedigree;

    private String diceStr;

    public int getPedigree() {
        return pedigree;
    }

    public int[] getDiceArr() {
        return this.diceArr;
    }

    public void setDiceArr(int[] diceArr) {
        this.diceArr = diceArr;
    }

    public void validPedigree(){
        int[] sort = this.diceArr.clone();
        Arrays.sort(sort);
        //후에 족보 분리부분 패턴화
        int preDice = chkFour(sort);

        if(preDice == DiceConfig.FOUR_DICE) this.pedigree = 10004;
        if(preDice == DiceConfig.TWO_DICE) this.pedigree = 10002;
    }

    private int chkFour(int[] sortDice){
        int count = 0;

        for(int i=0; i<sortDice.length; i++){
            int roofCnt = 0;
            for(int j=0; j<sortDice.length; j++){
                if(sortDice[i] == sortDice[j]) roofCnt++;
            }
            if(roofCnt > count) count = roofCnt;
        }
        return count;
    }

    public String getDiceStr() {
        validPedigree();
        String rtnStr = "주사위 : ";
        for(int d : this.diceArr){
            rtnStr+= " [ "+d+" ] ";
        }
        return rtnStr;
    }

}
