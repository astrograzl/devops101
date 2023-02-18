package com.gfa.devops.repos;

import com.gfa.devops.models.zoo.Animal;
import com.gfa.devops.models.zoo.Vegetable;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Garden extends JpaRepository<Vegetable,Long> {
}
