package com.example.yoolnote.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenu;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "classe_id")

//    @JoinColumn(name = "cours_id")
//    private Cours cours;
    private Classe classe;
}
