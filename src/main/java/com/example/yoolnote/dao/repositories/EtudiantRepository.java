package com.example.yoolnote.dao.repositories;

import com.example.yoolnote.dao.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
