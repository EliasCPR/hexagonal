package com.oliveira.hexagonal.adapters.out.repository.mapper;

import com.oliveira.hexagonal.adapters.out.repository.entity.CostumerEntity;
import com.oliveira.hexagonal.application.core.domain.Costumer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CostumerEntityMapper {
    CostumerEntity toCostumerEntity(Costumer costumer);
}
