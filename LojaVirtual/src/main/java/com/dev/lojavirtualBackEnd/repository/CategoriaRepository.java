package com.dev.lojavirtualBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.lojavirtualBackEnd.entity.Categoria;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findByNomeContainingIgnoreCase(String nome);
}
