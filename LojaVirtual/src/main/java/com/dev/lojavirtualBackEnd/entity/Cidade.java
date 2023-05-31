package com.dev.lojavirtualBackEnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="Cidade")
@Data
public class Cidade {
    private String name;
    private Date dataCriacao;
    private Date dataAtualizacao;

}
