package com.gfa.devops.models;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Watching implements Activity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;

}
