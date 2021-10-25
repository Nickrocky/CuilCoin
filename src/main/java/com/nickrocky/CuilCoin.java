package com.nickrocky;

import lombok.SneakyThrows;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.nio.file.Paths;

public class CuilCoin {


@SneakyThrows
    public static void main(String... args){
        JFrame jFrame = new JFrame("Cuil Coin Node");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        URL resource = CuilCoin.class.getClassLoader().getResource("CuilCoinLogo.png");
        BufferedImage icon = ImageIO.read(Paths.get(resource.toURI()).toFile());
        jFrame.setIconImage(icon);
        Button button = new Button("New User");
        Button existingUserButton = new Button("Existing User");
        jFrame.getContentPane().add(button);
        jFrame.getContentPane().add(existingUserButton);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
