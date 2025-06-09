package br.com.fiap.ericklpps.crudescola.service.impl;

import br.com.fiap.ericklpps.crudescola.dto.EscolaDto;
import br.com.fiap.ericklpps.crudescola.entity.Escola;
import br.com.fiap.ericklpps.crudescola.mapper.EscolaMapper;
import br.com.fiap.ericklpps.crudescola.repository.EscolaRepository;
import br.com.fiap.ericklpps.crudescola.service.EscolaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscolaServiceImpl implements EscolaService {

    private final EscolaMapper mapper;
    private final EscolaRepository repository;

    public EscolaServiceImpl(EscolaMapper mapper, EscolaRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public Escola create(EscolaDto dto) {
        Escola entity = mapper.toEntity(dto);
        return repository.save(entity);
    }

    @Override
    public Escola update(String id, EscolaDto dto) {
        Escola entity = getById(id);
        entity = mapper.partialUpdate(dto, entity);
        return repository.save(entity);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public Escola getById(String id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<Escola> getAll() {
        return repository.findAll();
    }
}
