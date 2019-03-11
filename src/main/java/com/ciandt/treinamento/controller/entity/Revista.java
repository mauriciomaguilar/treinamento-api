package com.ciandt.treinamento.controller.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Revista {

	@JsonProperty("id")
	private Long identificador;

	@JsonProperty("title")
	private String titulo;

	@JsonProperty("description")
	private String descricao;

	@JsonProperty("pageCount")
	private Integer numeroPaginas;

	@JsonProperty("thumbnail")
	private String imagemCapa;

	@JsonProperty("characters")
	private List<Personagem> personagens;

}
