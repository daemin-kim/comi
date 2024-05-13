package com.comi.comi.repository;

import com.comi.comi.domain.CallRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallRecordRepository extends JpaRepository<CallRecords, Integer> {
}
