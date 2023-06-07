package com.dev.lojavirtualBackEnd.service;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.lojavirtualBackEnd.entity.Categoria;
import com.dev.lojavirtualBackEnd.repository.CategoriaRepository;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodos(){
        return categoriaRepository.findAll();
    }
    public Categoria buscarPorId(Long id){
        return categoriaRepository.findById(id).get();
    }
    public Categoria inserir(Categoria categoria){
        categoria.setDataCriacao(new Date());
        Categoria novaCategoria = categoriaRepository.saveAndFlush(categoria);
        return novaCategoria;
    }
    public Categoria alterar(Categoria categoria){
        categoria.setDataAtualizacao(new Date());
        return categoriaRepository.saveAndFlush(categoria);
    }
    public void excluir(Long id){
        Categoria categoria = categoriaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Categoria não encontrada"));
    }
}
