package com.nickrocky.net.packet;

import com.nickrocky.CuilChain;
import lombok.Getter;

import java.net.DatagramPacket;
import java.net.InetAddress;

@Getter
public abstract class CuilPacket {

    private final String content;
    private final int port;
    private final int dataLength;
    private final InetAddress recipientAddress;

    public CuilPacket(String content, InetAddress recipientAddress){
        this.content = content;
        this.port = 22112;
        this.dataLength = content.length();
        this.recipientAddress = recipientAddress;
    }

    public DatagramPacket toPacket(){
        byte data[] = content.getBytes();
        return new DatagramPacket(data, dataLength, recipientAddress, port);
    }
}
