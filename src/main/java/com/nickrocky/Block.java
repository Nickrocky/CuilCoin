package com.nickrocky;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.SneakyThrows;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Getter
public class Block {
    private final String previousBlockHash;
    private final String[] transactionData;
    private final String additionalData;
    private String blockHash;
    private int nonce;

    public Block (String previousBlockHash, String additionalData, Transaction... transactionData){
        this.previousBlockHash = previousBlockHash;
        this.additionalData = additionalData;
        List<String> transactionDataString = new ArrayList<>();
        Arrays.stream(transactionData).forEach((t) -> {
            try {
                transactionDataString.add(t.toJson());
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        });
        this.transactionData = (String[]) transactionDataString.toArray();
        nonce = 0;
    }



    @SneakyThrows
    private String getHash(){
        ObjectMapper mapper = new ObjectMapper();
        var blockString = mapper.writeValueAsString(this);
        return DigestUtils.sha256Hex(blockString);
    }



}
