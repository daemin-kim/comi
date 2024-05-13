package com.comi.comi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.OffsetDateTime;
import java.util.Map;

@Entity
@Getter
@Setter
public class PronunciationAnalysis {

    @Id
    @GeneratedValue
    @Column(name = "analysis_id")
    private int analysisId;

    @ManyToOne
    @JoinColumn(name = "call_id")
    private CallRecords callId;

    @Column(columnDefinition = "json")
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> analysis;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;
}
