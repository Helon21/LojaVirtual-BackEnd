package com.dev.lojavirtualBackEnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="Estado")
@Data
public class Estado {
    private String nome;
    private String sigla;
    private Date dataCriacao;
    private Date dataAtualizacao;

}
