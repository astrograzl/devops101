package com.gfa.devops.models;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "authors")
public class Author {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;
    private String name;
    private String email;
    /**Z public presentation */
    // private Profile profile;
    private String profile;
}

