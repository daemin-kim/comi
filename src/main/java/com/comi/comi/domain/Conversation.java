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

public class Conversation {

    @Id
    @GeneratedValue
    @Column(name = "conversation_id")
    private int id;

    @OneToOne
    @JoinColumn(name = "call_id")
    private CallRecords callId;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    @Column(name = "ended_date")
    private OffsetDateTime endedDate;

    @Column(columnDefinition = "json")
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> conversation;
}
