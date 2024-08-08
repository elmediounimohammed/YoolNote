package com.example.yoolnote.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Etudiant {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;

    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adresse;
    private String image;

//    @ManyToMany
//    @JoinTable(
//            name = "etudiant_cours",
//            joinColumns = @JoinColumn(name = "etudiant_id"),
//            inverseJoinColumns = @JoinColumn(name = "cours_id")
//    )
//    private List<Cours> coursSuivis;
//
    @ManyToOne
    @JoinColumn(name = "ville_id")
    private Ville ville;

    @OneToMany(mappedBy = "etudiant")
    private List<ParcoursScolaire> parcoursScolaires;

    @OneToMany(mappedBy = "etudiant")
    private List<Inscription> inscriptions;

}
