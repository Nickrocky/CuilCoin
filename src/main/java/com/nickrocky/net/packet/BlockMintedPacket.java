package com.nickrocky.net.packet;

import com.nickrocky.Block;

import java.net.InetAddress;

public class BlockMintedPacket extends CuilPacket{
    public BlockMintedPacket(Block newlyMintedBlock, InetAddress recipientAddress) {
        super(newlyMintedBlock.toJson(), recipientAddress);
    }
}
