package com.gfa.devops;

import com.gfa.devops.models.Author;
import com.gfa.devops.models.art.Practixing;
import com.gfa.devops.models.art.Activity;
import com.gfa.devops.models.art.Watching;
import com.gfa.devops.models.art.Reading;
import com.gfa.devops.repos.Recepies;
import com.gfa.devops.repos.Backlog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class DevOps101Application implements CommandLineRunner {

    private final Backlog backlog;
    private final Recepies recepies;
    @Autowired public DevOps101Application(Backlog backlog,
                                           Recepies recepies) {
        this.recepies = recepies;
        this.backlog = backlog;
    }

    public static void main(String[] args) {
        SpringApplication.run(DevOps101Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.err.println("Application starting...");
        Author author = new Author();
        author.setName("Zdeněk Janák");
        author.setEmail("<zdenek@astronomie.cz>");
        author.setProfile("https://astrograzl.github.io/");
        this.recepies.save(author);
        Activity reading = new Reading();
        Activity watching = new Watching();
        Activity practixing = new Practixing();
        this.backlog.save(reading);
        this.backlog.save(watching);
        this.backlog.save(practixing);
        System.out.println("Activity executed...");
    }
}
