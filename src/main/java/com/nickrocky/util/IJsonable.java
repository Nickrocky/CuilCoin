package com.nickrocky.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public interface IJsonable {

    @SneakyThrows
    default String toJson() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }
}
