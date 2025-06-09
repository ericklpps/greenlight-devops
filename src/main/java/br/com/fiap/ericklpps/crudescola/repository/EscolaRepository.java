package br.com.fiap.ericklpps.crudescola.repository;

import br.com.fiap.ericklpps.crudescola.entity.Escola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscolaRepository extends JpaRepository<Escola, String> {
}