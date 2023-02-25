package com.gfa.devops.workers;

import com.gfa.devops.models.Author;
import com.gfa.devops.repos.Bookmark;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class Reception {
    private final Bookmark bookmark;
    @Autowired protected Reception(Bookmark bookmark) {
        this.bookmark = bookmark;
    }

    public Author addAuthor(Author author) {
        return this.bookmark.save(author);
    }
}
