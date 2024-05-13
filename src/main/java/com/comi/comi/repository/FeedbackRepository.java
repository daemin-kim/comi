package com.comi.comi.repository;

import com.comi.comi.domain.CallRecords;
import com.comi.comi.domain.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
    Optional<Feedback> findByCallId(CallRecords callId);
}
