package com.nickrocky.net.packet;

import com.nickrocky.Transaction;

import java.net.InetAddress;

public class TransactionAnnouncementPacket extends CuilPacket{
    public TransactionAnnouncementPacket(Transaction transaction, InetAddress recipientAddress) {
        super(transaction.toJson(), recipientAddress);
    }
}
