package com.example.yoolnote.dao.repositories;

import com.example.yoolnote.dao.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
