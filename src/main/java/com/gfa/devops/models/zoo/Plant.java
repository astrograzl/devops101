package com.gfa.devops.models.zoo;

public abstract class Plant implements Vegetable {
    private int seed;
    private String name;
    public Plant(int seed) {
        this.seed = seed;
    }
    public void setName(String name) {
        this.name = name;
    }
}
