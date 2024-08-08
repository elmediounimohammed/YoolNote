package com.example.yoolnote.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCours;

    private String intitulé;
    private int nbreHeure;

    //Relation TO DO
//    @OneToMany(mappedBy = "cours")
//    private List<Evaluation> evaluations;
//
//    @OneToMany(mappedBy = "cours")
//    private List<Note> notes;
//
//    @ManyToMany(mappedBy = "coursSuivis")
//    private List<Etudiant> etudiants;

}
