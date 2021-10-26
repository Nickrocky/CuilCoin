package com.nickrocky.net.packet;

import lombok.Getter;
import lombok.SneakyThrows;

import java.net.DatagramPacket;
import java.net.InetAddress;

@Getter
public abstract class CuilPacket {

    private final String content;
    private final int port;
    private final int dataLength;
    private final InetAddress recipientAddress;

    @SneakyThrows
    public CuilPacket(String content, String recipientAddress){
        this.content = content;
        this.port = 22112;
        this.dataLength = content.length();
        this.recipientAddress = InetAddress.getByName(recipientAddress);
    }

    public DatagramPacket toPacket(){
        byte data[] = content.getBytes();
        return new DatagramPacket(data, dataLength, recipientAddress, port);
    }
}
