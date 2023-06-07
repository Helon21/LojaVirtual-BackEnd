package com.dev.lojavirtualBackEnd.repository;

import com.dev.lojavirtualBackEnd.entity.Permissao;
import com.dev.lojavirtualBackEnd.entity.PermissaoPessoa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissaoPessoaRepository extends JpaRepository<PermissaoPessoa, Long> {

}
