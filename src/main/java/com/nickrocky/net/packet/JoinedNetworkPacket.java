package com.nickrocky.net.packet;

import java.net.InetAddress;

public class JoinedNetworkPacket extends CuilPacket{
    public JoinedNetworkPacket(String content, InetAddress recipientAddress) {
        super(content, recipientAddress);
    }
}
