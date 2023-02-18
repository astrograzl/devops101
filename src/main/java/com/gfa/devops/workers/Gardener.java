package com.gfa.devops.workers;

import com.gfa.devops.repos.Garden;
import com.gfa.devops.models.zoo.Forest;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class Gardener {
    /**Z Horticulturist */
    private final Garden garden;
    @Autowired public Gardener(Garden garden) {
        this.garden = garden;
        this.garden.saveAll(new Forest(42).get());
    }
}
