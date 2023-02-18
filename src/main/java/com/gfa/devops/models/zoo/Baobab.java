package com.gfa.devops.models.zoo;

public class Baobab extends Plant {
    public Baobab(int seed) {
        super(seed);
        this.setName(String.format("Baobab(%d)", seed));
    }
}
