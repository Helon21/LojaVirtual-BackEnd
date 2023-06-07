package com.dev.lojavirtualBackEnd.repository;

import com.dev.lojavirtualBackEnd.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
    public List<Permissao> findByNomeIsContainingIgnoreCase(String nome);
}
