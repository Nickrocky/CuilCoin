package com.nickrocky.util;

import com.nickrocky.Block;
import com.nickrocky.CuilChain;

public class BlockUtil {

    public static boolean isBlockHashWorthIt(Block block){
        int difficultyOfBlock = CuilChain.getHashDifficulty();
        if(block.getBlockHash().startsWith(getZeros(difficultyOfBlock))) return true;
        return false;
    }

    public static int calculateDifficultyFromPreviousBlock(String previousBlockHash){
        var count = 0;
        for(char a : previousBlockHash.toCharArray()){
            if(a == 'f') count++;
        }
        if(count < 10){
            return count;
        }else{
            return 9;
        }
    }

    private static String getZeros(int numOfZero){
        var base = "";
        for(int i = 0; i < numOfZero; i++){
            base = base +"0";
        }
        return base;
    }

}
