package com.nickrocky;

import com.nickrocky.net.Peer;
import lombok.Getter;
import lombok.SneakyThrows;

public class CuilCoin {

    @Getter private static Peer peerInstance;

@SneakyThrows
    public static void main(String... args){
        peerInstance = new Peer();
        Peer peer = new Peer();
        peer.sendBlockMintedPacket(new GenesisBlock());
        /*JFrame jFrame = new JFrame("Cuil Coin Node");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        URL resource = CuilCoin.class.getClassLoader().getResource("CuilCoinLogo.png");
        BufferedImage icon = ImageIO.read(Paths.get(resource.toURI()).toFile());
        jFrame.setIconImage(icon);
        Button button = new Button("New User");
        Button existingUserButton = new Button("Existing User");
        jFrame.getContentPane().add(button);
        jFrame.getContentPane().add(existingUserButton);
        jFrame.pack();
        jFrame.setVisible(true);*/
    }
}
