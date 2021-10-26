package com.nickrocky.net.packet;

import com.nickrocky.Block;

public class BlockMintedPacket extends CuilPacket{
    public BlockMintedPacket(Block newlyMintedBlock, String recipientAddress){
        super(newlyMintedBlock.toJson(), recipientAddress);
    }
}
