package com.dev.lojavirtualBackEnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="Cidade")
@Data
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank
	private String nome;

	@ManyToOne // relacionamento, neste caso, muitas cidades para um estado.
	@JoinColumn(name="idEstado") // JoinColumn define a coluna de relacionamento no banco de dados.
	private Estado estado;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAtualizacao;

}
