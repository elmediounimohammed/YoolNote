package com.example.yoolnote.dao.repositories;

import com.example.yoolnote.dao.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours,Long> {
}
