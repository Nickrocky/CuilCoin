package com.nickrocky;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nickrocky.util.IJsonable;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import org.apache.commons.codec.digest.DigestUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Getter
public class Block implements IJsonable {
    private final String previousBlockHash;
    private final String[] transactionData;
    private final String additionalData;
    @Setter private String blockHash;
    private int height;
    private long timeInMillis;
    private int nonce;

    public Block (String previousBlockHash, String additionalData, Transaction... transactionData){
        this.previousBlockHash = previousBlockHash;
        this.additionalData = additionalData;
        List<String> transactionDataString = new ArrayList<>();
        Arrays.stream(transactionData).forEach((t) -> transactionDataString.add(t.toJson()));
        this.transactionData = (String[]) transactionDataString.toArray();
        nonce = 0;
    }

    @SneakyThrows
    private String getHash(){
        ObjectMapper mapper = new ObjectMapper();
        timeInMillis = System.currentTimeMillis();
        height = (CuilChain.getBlockchain().size()-1);
        nonce++;
        var blockString = mapper.writeValueAsString(this);
        return DigestUtils.sha256Hex(blockString);
    }
}
