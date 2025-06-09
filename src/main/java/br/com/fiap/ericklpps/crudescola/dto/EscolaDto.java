package br.com.fiap.ericklpps.crudescola.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * DTO for {@link br.com.fiap.ericklpps.crudescola.entity.Escola}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record EscolaDto(String id, String nome, String cidade, String estado, Character ativo) implements Serializable {
}