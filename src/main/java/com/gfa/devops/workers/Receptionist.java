package com.gfa.devops.workers;

import com.gfa.devops.repos.Bookmark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class Receptionist {
    private final Bookmark bookmark;
    @Autowired protected Receptionist(Bookmark bookmark) {
        this.bookmark = bookmark;
    }
}
