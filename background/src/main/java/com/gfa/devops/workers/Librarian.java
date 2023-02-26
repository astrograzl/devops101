package com.gfa.devops.workers;

import com.gfa.devops.models.Author;
import com.gfa.devops.models.Article;
import com.gfa.devops.repos.Bibliography;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public abstract class Librarian {
    private final Bibliography bibliography;
    @Autowired protected Librarian(Bibliography bibliography) {
        this.bibliography = bibliography;
    }
    public List<Article> getReadings(Author author) {
        return this.bibliography.findAllByAuthor(author);
    }
}
