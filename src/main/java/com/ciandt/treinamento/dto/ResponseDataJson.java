package com.ciandt.treinamento.dto;

import java.util.List;

import com.ciandt.treinamento.controller.entity.Personagem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDataJson {

	private Integer offset;
	private Integer limit;
	private Integer total;
	private Integer count;
	private List<Personagem> results;
}
