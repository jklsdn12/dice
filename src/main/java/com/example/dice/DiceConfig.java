package com.example.dice;

import java.util.HashMap;
import java.util.Map;

public class DiceConfig {
    public final static int DICE_CNT = 5;
    public final static int TWO_DICE = 2;
    public final static int FOUR_DICE = 4;

    private final static Map<Integer,String> PRED_MAP = new HashMap<Integer,String>();

    public static void loadData(){
        PRED_MAP.put(10004, "FOUR DICE");
        PRED_MAP.put(10002, "TWO DICE");
    }

    public static String getPredMap(int pedigree) {
        return PRED_MAP.get(pedigree) == null ? "없음" : PRED_MAP.get(pedigree);
    }


}
