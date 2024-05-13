package com.comi.comi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Settings {

    @Id
    @GeneratedValue
    @Column(name = "setting_id")
    private int id;

    @OneToOne
    @JoinColumn(name = "id")
    private Users userId;

    @Column(name = "proficiency_level")
    private String proficiencyLevel;

    @Column(name = "learning_language")
    private String learningLanguage;
}
