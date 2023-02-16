package com.gfa.devops.models;

import com.gfa.devops.models.art.Activity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @ManyToOne private List<Article> articles = new ArrayList<>();
    @ManyToOne private List<Activity> activities = new LinkedList<>();
}
