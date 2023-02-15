package com.gfa.devops.models.zoo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "monkeys")
public class Cibet extends Monkey {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;
    private String name;
    @OneToOne private Monkey mom;
    @OneToOne private Monkey dad;
}
