package com.gfa.devops;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.HashMap;

@Service
public class Dictionary {
    private final Map<String,String> dict;

    public Dictionary() {
        this.dict = new HashMap<>();
    }

    public Map.Entry<String,String> ordered() {
        return null;
    }

}
