package com.dev.lojavirtualBackEnd.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="permissao")
@Data
public class PermissaoPessoa {
    private Date dataCriacao;
    private Date dataAtualizacao;
}
