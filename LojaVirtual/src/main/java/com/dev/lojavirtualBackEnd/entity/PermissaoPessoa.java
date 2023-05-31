package com.dev.lojavirtualBackEnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="PermissaoPessoa")
@Data
public class PermissaoPessoa {
    private Date dataCriacao;
    private Date dataAtualizacao;
}
