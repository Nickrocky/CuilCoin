package com.nickrocky.util;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BlockChainInfo {

    private final boolean isValid;
    private final int heightOfBlock;
    private final BlockchainError error;

}
