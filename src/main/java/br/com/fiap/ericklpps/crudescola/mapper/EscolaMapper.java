package br.com.fiap.ericklpps.crudescola.mapper;

import br.com.fiap.ericklpps.crudescola.dto.EscolaDto;
import br.com.fiap.ericklpps.crudescola.entity.Escola;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EscolaMapper {
    Escola toEntity(EscolaDto escolaDto);

    EscolaDto toDto(Escola escola);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Escola partialUpdate(EscolaDto escolaDto, @MappingTarget Escola escola);
}