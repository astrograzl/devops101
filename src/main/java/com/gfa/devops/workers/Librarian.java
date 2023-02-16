package com.gfa.devops.workers;

import com.gfa.devops.models.Author;
import com.gfa.devops.models.Article;
import com.gfa.devops.repos.Liberty;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public abstract class Librarian {
    private final Liberty liberty;
    @Autowired protected Librarian(Liberty liberty) {
        this.liberty = liberty;
    }
    public List<Article> getReadings(Author author) {
        return this.liberty.findAllByAuthor(author);
    }
}
