package com.alexandrazbant.recipeapp.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String description;
}
