package com.comi.comi.repository;

import com.comi.comi.domain.Models;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Models, Integer> {
}
