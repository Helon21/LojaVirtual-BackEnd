package com.dev.lojavirtualBackEnd.service;


import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.lojavirtualBackEnd.entity.Cidade;
import com.dev.lojavirtualBackEnd.repository.CidadeRepository;

@Service
public class CidadeService {
    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> buscarTodos(){
        return cidadeRepository.findAll();
    }

    public Cidade buscarPorId(Long id){
        return cidadeRepository.findById(id).get();
    }
    public Cidade inserir(Cidade cidade){
        cidade.setDataCriacao(new Date());
        Cidade novaCidade = cidadeRepository.saveAndFlush(cidade);
        return novaCidade;
    }
    public Cidade alterar(Cidade cidade){
        cidade.setDataAtualizacao(new Date());
        return cidadeRepository.saveAndFlush(cidade);
    }
    public void excluir(Long id){
        Cidade cidade = cidadeRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Cidade não encontrada"));
        cidadeRepository.delete(cidade);
    }
}
