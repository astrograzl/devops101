package com.gfa.devops.repos;

import com.gfa.devops.models.Entry;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CaptainsDairy extends JpaRepository<Entry,Long> {
}
