package com.comi.comi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Models {

    @Id
    @GeneratedValue
    @Column(name = "model_id")
    private int id;

    private String name;

    private String group;

    private int state;

    private String image;
}
