package com.comi.comi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Topics {

    @Id
    @GeneratedValue
    @Column(name = "topic_id")
    private int id;

    private String title;

    private String desc;
}
