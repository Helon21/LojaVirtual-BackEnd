package com.dev.lojavirtualBackEnd.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoDto {
    String id;
    String name;
    String abreviacao;
}
