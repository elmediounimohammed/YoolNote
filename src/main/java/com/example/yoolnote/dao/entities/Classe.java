package com.example.yoolnote.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matiere;
    private String niveau;
    private String titre;
    private String prof;
//    @OneToMany(mappedBy = "classe")
//    private List<Cours> cours;
//
//    @OneToMany(mappedBy = "classe")
//    private List<Evaluation> evaluations;


}
