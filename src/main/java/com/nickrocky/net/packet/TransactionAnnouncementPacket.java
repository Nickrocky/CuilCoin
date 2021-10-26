package com.nickrocky.net.packet;

import com.nickrocky.Transaction;

import java.net.InetAddress;

public class TransactionAnnouncementPacket extends CuilPacket{
    public TransactionAnnouncementPacket(Transaction transaction, String recipientAddress) {
        super(transaction.toJson(), recipientAddress);
    }
}
