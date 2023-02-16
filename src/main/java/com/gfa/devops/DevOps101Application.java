package com.gfa.devops;

import com.gfa.devops.repos.Backlog;
import com.gfa.devops.models.Reading;
import com.gfa.devops.models.Activity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class DevOps101Application implements CommandLineRunner {

    private final Backlog backlog;
    @Autowired public DevOps101Application(Backlog backlog) {
        this.backlog = backlog;
    }

    public static void main(String[] args) {
        SpringApplication.run(DevOps101Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.err.println("Application starting...");
        Activity activity = new Reading();
        this.backlog.save(activity);
        System.out.println("Activity executed...");
    }
}
