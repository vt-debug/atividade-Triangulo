package com.biblioteca.backend.repository;

import com.biblioteca.backend.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
