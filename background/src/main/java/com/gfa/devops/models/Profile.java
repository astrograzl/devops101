package com.gfa.devops.models;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "profiles")
public class Profile {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;
    @OneToOne private  Author author;
    @ManyToMany private List<Article> articles = new ArrayList<>();
//    @ManyToMany private List<Activity> activities = new LinkedList<>();
}
