package com.nickrocky;

import com.nickrocky.util.BlockChainInfo;
import com.nickrocky.util.BlockUtil;
import com.nickrocky.util.BlockchainError;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class CuilChain {

    @Getter private static int hashDifficulty;
    @Getter private static List<Block> blockchain;
    private static String BOOTSTRAP_NODE_IP = "";

    public CuilChain(){
        blockchain = new ArrayList<>();
        blockchain.add(new GenesisBlock());
    }

    public static void appendBlockToChain(Block block){
        while(!BlockUtil.isBlockHashWorthIt(block)) {

        }
    }

    public static BlockChainInfo validateBlockChain(){
        for(Block b : blockchain){
            if(b.getHeight() == 1) continue;
            if(!b.getPreviousBlockHash().equals(getPreviousHash(b.getHeight()))) return new BlockChainInfo(false, b.getHeight(), BlockchainError.MISMATCHED_PREVIOUS_HASH);
        }
        return new BlockChainInfo(true, blockchain.get(blockchain.size()-1).getHeight(), null);
    }

    public static String getPreviousHash(int currentBlock){
        return getPreviousBlock(currentBlock-1).getBlockHash();
    }

    public static Block getPreviousBlock(int currentBlock){
        return blockchain.get(currentBlock-1);
    }

}
