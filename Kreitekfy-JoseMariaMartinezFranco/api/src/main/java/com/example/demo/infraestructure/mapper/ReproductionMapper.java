package com.example.demo.infraestructure.mapper;

import com.example.demo.application.dto.ReproductionDto;
import com.example.demo.domain.entity.Reproduction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReproductionMapper extends EntityMapper<ReproductionDto, Reproduction> {
    default Reproduction fromId(Long id) {

        if (id == null) return null;

        Reproduction reproduction = new Reproduction();
        reproduction.setId(id);
        return reproduction;
    }
}
