package com.nickrocky.util;

import lombok.SneakyThrows;

import java.security.*;
import java.util.Base64;

public class WalletUtil {

    @SneakyThrows
    public static EncodedKeyPair generateWallet(){
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");

        // Initialize KeyPairGenerator.
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
        keyGen.initialize(1024, random);

        // Generate Key Pairs, a private key and a public key.
        KeyPair keyPair = keyGen.generateKeyPair();
        Base64.Encoder encoder = Base64.getEncoder();
        return new EncodedKeyPair(encoder.encodeToString(keyPair.getPrivate().getEncoded()), encoder.encodeToString(keyPair.getPublic().getEncoded()));
    }

}
