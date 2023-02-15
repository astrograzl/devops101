package com.gfa.devops.repos;

import com.gfa.devops.models.zoo.Animal;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Zoo extends JpaRepository<Animal,Long> {
}
