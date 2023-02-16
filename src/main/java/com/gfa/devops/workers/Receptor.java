package com.gfa.devops.workers;

import com.gfa.devops.repos.Recepies;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public abstract class Receptor {
    private final Recepies recepies;
    @Autowired protected Receptor(Recepies recepies) {
        this.recepies = recepies;
    }
}
