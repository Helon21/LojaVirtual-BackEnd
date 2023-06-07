package com.dev.lojavirtualBackEnd.service;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.lojavirtualBackEnd.entity.Pessoa;
import com.dev.lojavirtualBackEnd.repository.PessoaRepository;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;
    
    public List<Pessoa> buscarTodos(){
        return pessoaRepository.findAll();
    }
    public Pessoa buscarPorId(Long id){
        return pessoaRepository.findById(id).get();
    }
    public Pessoa inserir(Pessoa pessoa){
        pessoa.setDataCriacao(new Date());
        Pessoa novaPessoa = pessoaRepository.saveAndFlush(pessoa);
        return novaPessoa;
    }
    public Pessoa alterar(Pessoa pessoa){
        pessoa.setDataAtualizacao(new Date());
        return pessoaRepository.saveAndFlush(pessoa);
    }
    public void excluir(Long id){
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Pessoa não encontrada"));
        pessoaRepository.delete(pessoa);
    }
}
