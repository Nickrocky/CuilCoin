package com.nickrocky.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class EncodedKeyPair {
    private final String privateKeyEncoded;
    private final String publicKeyEncoded;
}
