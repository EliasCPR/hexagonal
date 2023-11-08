package com.oliveira.hexagonal.adapters.in.controller.mapper;

import com.oliveira.hexagonal.adapters.in.controller.request.CostumerRequest;
import com.oliveira.hexagonal.application.core.domain.Costumer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CostumerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Costumer toCostumer(CostumerRequest costumerRequest);
}
