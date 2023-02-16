package com.gfa.devops.repos;

import com.gfa.devops.models.Activity;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Backlog extends JpaRepository<Activity,Long> {
}
