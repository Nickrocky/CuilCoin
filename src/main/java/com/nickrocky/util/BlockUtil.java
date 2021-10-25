package com.nickrocky.util;

import com.nickrocky.Block;
import com.nickrocky.CuilChain;

public class BlockUtil {

    public static boolean isBlockHashWorthIt(Block block){
        int difficultyOfBlock = CuilChain.getHashDifficulty();
        if(block.getBlockHash().startsWith(getZeros(difficultyOfBlock))) return true;
        return false;
    }

    private static String getZeros(int numOfZero){
        var base = "";
        for(int i = 0; i < numOfZero; i++){
            base = base +"0";
        }
        return base;
    }

}
