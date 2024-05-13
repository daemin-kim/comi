package com.comi.comi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Feedback {

    @Id
    @GeneratedValue
    @Column(name = "feedback_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "call_id")
    private CallRecords callId;

    @Column(columnDefinition = "json")
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> content;

    @Column(name = "created_at")
    private OffsetDateTime createAt;
}
