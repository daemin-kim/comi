package com.comi.comi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private int id;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    private String email;

    private String social;

    @Column(name = "remain_time")
    private int remainTime;
}
