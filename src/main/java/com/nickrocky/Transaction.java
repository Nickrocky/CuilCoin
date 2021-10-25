package com.nickrocky;

import com.nickrocky.util.IJsonable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Transaction implements IJsonable {

    private final String recipientAddress;
    private final String senderAddress;
    private final double transactionValue;

    @Override
    public String toString() {
        return "Transaction{" +
                "recipientAddress='" + recipientAddress + '\'' +
                ", senderAddress='" + senderAddress + '\'' +
                ", transactionValue=" + transactionValue +
                '}';
    }

}
