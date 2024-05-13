package com.comi.comi.repository;

import com.comi.comi.domain.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SettingRepository extends JpaRepository<Settings, Integer> {
    Optional<Settings> findByUserId(Settings userId);
}
