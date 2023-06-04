package com.dev.lojavirtualBackEnd.Dto;


import com.dev.lojavirtualBackEnd.entity.Estado;
import lombok.Data;


@Data
public class CidadeDto {
    Long id;
    String nome;
    Estado estado;
    Long estadoId;

}
