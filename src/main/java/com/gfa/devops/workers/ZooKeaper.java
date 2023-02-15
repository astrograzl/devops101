package com.gfa.devops.workers;

import com.gfa.devops.repos.Zoo;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ZooKeaper {
    private final Zoo zoo;
    @Autowired public ZooKeaper(Zoo zoo) {
        this.zoo = zoo;
    }
}
