package com.dev.lojavirtualBackEnd.service;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dev.lojavirtualBackEnd.entity.PermissaoPessoa;
import com.dev.lojavirtualBackEnd.repository.PermissaoPessoaRepository;

@Service
public class PermissaoPessoaService {
    @Autowired
    private PermissaoPessoaRepository permissaoPessoaRepository;
    
    public List<PermissaoPessoa> buscarTodos(){
        return permissaoPessoaRepository.findAll();
    }
    public PermissaoPessoa buscarPorId(Long id){
        return permissaoPessoaRepository.findById(id).get();
    }
    public PermissaoPessoa inserir(PermissaoPessoa permissaoPessoa){
        permissaoPessoa.setDataCriacao(new Date());
        PermissaoPessoa novaPermissaoPessoa = permissaoPessoaRepository.saveAndFlush(permissaoPessoa);
        return novaPermissaoPessoa;
    }
    public PermissaoPessoa alterar(PermissaoPessoa permissaoPessoa){
        permissaoPessoa.setDataAtualizacao(new Date());
        return permissaoPessoaRepository.saveAndFlush(permissaoPessoa);
    }
    public void excluir(Long id){
        PermissaoPessoa permissaoPessoa = permissaoPessoaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Permissão de pessoa não encontrada"));
        permissaoPessoaRepository.delete(permissaoPessoa);
    }

}
