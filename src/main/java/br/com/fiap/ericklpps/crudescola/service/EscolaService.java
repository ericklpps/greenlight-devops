package br.com.fiap.ericklpps.crudescola.service;

import br.com.fiap.ericklpps.crudescola.dto.EscolaDto;
import br.com.fiap.ericklpps.crudescola.entity.Escola;

import java.util.List;
import java.util.Optional;

public interface EscolaService {
    Escola create(EscolaDto dto);
    Escola update(String id, EscolaDto dto);
    void delete(String id);
    Escola getById(String id);
    List<Escola> getAll();
}
