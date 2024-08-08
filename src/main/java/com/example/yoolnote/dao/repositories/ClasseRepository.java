package com.example.yoolnote.dao.repositories;

import com.example.yoolnote.dao.entities.Classe;
import org.hibernate.Cache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClasseRepository extends JpaRepository<Classe,Long> {
}
