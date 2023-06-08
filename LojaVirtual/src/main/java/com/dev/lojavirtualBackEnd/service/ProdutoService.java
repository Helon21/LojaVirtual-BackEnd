package com.dev.lojavirtualBackEnd.service;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.lojavirtualBackEnd.entity.Produto;
import com.dev.lojavirtualBackEnd.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> buscarTodos(){
        return produtoRepository.findAll();
    }
    public Produto buscarPorId(Long id){
        return produtoRepository.findById(id).get();
    }
    public Produto inserir(Produto produto){
        produto.setDataCriacao(new Date());
        Produto novoProduto = produtoRepository.saveAndFlush(produto);
        return novoProduto;
    }
    public Produto alterar(Produto produto){
        produto.setDataAtualizacao(new Date());
        return produtoRepository.saveAndFlush(produto);
    }
    public void excluir(Long id){
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Produto não encontrado"));
        produtoRepository.delete(produto);
    }
}
