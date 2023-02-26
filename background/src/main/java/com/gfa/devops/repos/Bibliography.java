package com.gfa.devops.repos;

import com.gfa.devops.models.Author;
import com.gfa.devops.models.Article;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface Bibliography extends JpaRepository<Article,Long> {
    List<Article> findAllByAuthor(Author author);
}
