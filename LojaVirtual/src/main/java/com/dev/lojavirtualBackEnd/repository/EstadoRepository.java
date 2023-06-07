package com.dev.lojavirtualBackEnd.repository;

import com.dev.lojavirtualBackEnd.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
    public List<Estado> findByNomeContainingIgnoreCase(String nome);
}
