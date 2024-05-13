package com.comi.comi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
public class CallRecords {

    @Id
    @GeneratedValue
    @Column(name = "call_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Models modelId;

    private String topic;

    @Column(name = "conv_count")
    private int convCount;

    private OffsetDateTime ended;

    private int times;
}
