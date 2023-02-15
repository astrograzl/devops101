package com.gfa.devops.models.zoo;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "monkeys")
public abstract class Monkey implements Animal {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;
}
