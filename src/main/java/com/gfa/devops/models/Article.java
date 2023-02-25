package com.gfa.devops.models;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "articles")
public class Article {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;
    @OneToOne private Author author;
//    @ManyToOne private List<Author> authors = new ArrayList<>();
    private String title;
    private String perex;
    private String content;
    /*Z permanent_link (reference) */
    private String link;

}
