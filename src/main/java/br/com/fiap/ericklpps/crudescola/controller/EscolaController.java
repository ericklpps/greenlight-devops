package br.com.fiap.ericklpps.crudescola.controller;

import br.com.fiap.ericklpps.crudescola.dto.EscolaDto;
import br.com.fiap.ericklpps.crudescola.entity.Escola;
import br.com.fiap.ericklpps.crudescola.mapper.EscolaMapper;
import br.com.fiap.ericklpps.crudescola.service.EscolaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/escola")
public class EscolaController {

    private final EscolaService service;
    private final EscolaMapper mapper;

    public EscolaController(EscolaService service, EscolaMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<EscolaDto> create(@RequestBody EscolaDto dto) {
        Escola saved = service.create(dto);
        EscolaDto responseDto = mapper.toDto(saved);
        URI location = URI.create(String.format("/escola/%s", saved.getId()));
        return ResponseEntity.created(location).body(responseDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EscolaDto> getById(@PathVariable("id") String id) {
        Escola entity = service.getById(id);
        EscolaDto responseDto = mapper.toDto(entity);
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping
    public ResponseEntity<List<EscolaDto>> getAll() {
        List<Escola> entities = service.getAll();
        List<EscolaDto> escolas = entities.stream()
                .map(mapper::toDto)
                .toList();
        return ResponseEntity.ok(escolas);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EscolaDto> update(@PathVariable("id") String id, @RequestBody EscolaDto dto) {
        Escola updated = service.update(id, dto);
        EscolaDto responseDto = mapper.toDto(updated);
        return ResponseEntity.ok(responseDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
