package com.dev.lojavirtualBackEnd.service;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.dev.lojavirtualBackEnd.entity.Estado;
//import com.dev.backend.exception.GenericException;
import com.dev.lojavirtualBackEnd.repository.EstadoRepository;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> buscarTodos() {
        return estadoRepository.findAll();
    }

    public Estado buscarPorId(Long id) {
        return estadoRepository.findById(id).get();
    }

    public Estado inserir(Estado estado) {
        estado.setDataCriacao(new Date());
        Estado estadoNovo = estadoRepository.saveAndFlush(estado);
        return estadoNovo;
    }

    public Estado alterar(Estado estado) {
        estado.setDataAtualizacao(new Date());
        return estadoRepository.saveAndFlush(estado);
    }

    public void excluir(Long id) {
        Estado estado = estadoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Estado não encontrado."));
        estadoRepository.delete(estado);
    }

}
