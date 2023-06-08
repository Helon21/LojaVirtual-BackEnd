package com.dev.lojavirtualBackEnd.repository;

import com.dev.lojavirtualBackEnd.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstadoRepository extends JpaRepository<Estado, Long> { //repository's são responsáveis pela interação com o banco de dados;
    public List<Estado> findByNomeContainingIgnoreCase(String nome);
}
