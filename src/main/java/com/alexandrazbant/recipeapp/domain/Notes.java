package com.alexandrazbant.recipeapp.domain;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipeNotes;
}
