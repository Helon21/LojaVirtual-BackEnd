package com.dev.lojavirtualBackEnd.Dto;


import com.dev.lojavirtualBackEnd.entity.Estado;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CidadeDto {
    Long id;
    String nome;
    Estado estado;
    Long estadoId;

}
