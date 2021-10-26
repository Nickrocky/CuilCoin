package com.nickrocky.net;

import com.nickrocky.Block;
import com.nickrocky.Transaction;
import com.nickrocky.net.packet.BlockMintedPacket;
import com.nickrocky.net.packet.TransactionAnnouncementPacket;
import lombok.SneakyThrows;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import java.util.ArrayList;
import java.util.List;

public class Peer {

    List<String> knownAddresses = new ArrayList<>();
    private static String BOOTSTRAP_NODE = "127.0.0.1";

    public Peer(){
        knownAddresses.add(BOOTSTRAP_NODE);
        startListeningToNetwork();
    }

    public static void startListeningToNetwork(){
        (new Thread(() -> {
            DatagramSocket socket = null;
            try {
                socket = new DatagramSocket(22112);
            } catch (SocketException e) {
                e.printStackTrace();
            }
            DatagramPacket packet;
            String recievedPacketString;
            while (true) {
                packet = new DatagramPacket(new byte[8192], 8192);
                try {
                    socket.receive(packet);
                    recievedPacketString =new String(packet.getData());
                    recievedPacketString = recievedPacketString.replace("\0", "");
                    System.out.println("Recieved Data: "+recievedPacketString);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        })).start();
    }

    @SneakyThrows
    public void sendTransactionAnnouncementPacket(Transaction transaction){
        (new Thread(() -> {
            DatagramSocket socket = null;
            try {
                socket = new DatagramSocket();
                socket.setBroadcast(true);
            } catch (SocketException e) {
                e.printStackTrace();
            }
            try {
                for(String address : knownAddresses){
                    var transactionAnnouncementPacket = new TransactionAnnouncementPacket(transaction, address);
                    socket.send(transactionAnnouncementPacket.toPacket());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        })).start();
    }

    @SneakyThrows
    public void sendBlockMintedPacket(Block newlyMintedBlock){
        (new Thread(() -> {
            DatagramSocket socket = null;
            try {
                socket = new DatagramSocket();
                socket.setBroadcast(true);
            } catch (SocketException e) {
                e.printStackTrace();
            }
            try {
                for(String address : knownAddresses){
                    var mintedBlockPacket = new BlockMintedPacket(newlyMintedBlock, address);
                    socket.send(mintedBlockPacket.toPacket());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        })).start();
    }
}
