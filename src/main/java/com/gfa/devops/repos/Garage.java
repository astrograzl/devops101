package com.gfa.devops.repos;

import com.gfa.devops.models.zoo.Tool;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Garage extends JpaRepository<Tool,Long> {
}
