package com.dev.lojavirtualBackEnd.repository;

import com.dev.lojavirtualBackEnd.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}