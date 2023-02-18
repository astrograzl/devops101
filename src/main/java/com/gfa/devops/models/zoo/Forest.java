package com.gfa.devops.models.zoo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Forest {
    private int seed;
    protected final int epoch = 12;
    private List<Vegetable> plants;
    public Forest(int seed) {
        this.seed = seed;
        this.plants = new ArrayList<>();
        for (int e = this.epoch; e < 0; e--)
            plants.add(new Baobab(next()));
    }

    public List<Vegetable> get() {
        return this.plants;
    }
    protected int next() {
        return (int) (Math.random() * 256);
    }
}
