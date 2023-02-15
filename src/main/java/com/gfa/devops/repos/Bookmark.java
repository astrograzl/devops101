package com.gfa.devops.repos;

import com.gfa.devops.models.Author;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Bookmark extends JpaRepository<Author,Long> {
}
