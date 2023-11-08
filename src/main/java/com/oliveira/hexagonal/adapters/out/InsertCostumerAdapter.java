package com.oliveira.hexagonal.adapters.out;

import com.oliveira.hexagonal.adapters.out.repository.CostumerRepository;
import com.oliveira.hexagonal.adapters.out.repository.mapper.CostumerEntityMapper;
import com.oliveira.hexagonal.application.core.domain.Costumer;
import com.oliveira.hexagonal.application.ports.out.InsertCostumerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class InsertCostumerAdapter implements InsertCostumerOutputPort {

    @Autowired
    private CostumerRepository costumerRepository;
    @Autowired
    private CostumerEntityMapper costumerEntityMapper;
    @Override
    public void insert(Costumer costumer) {
        var costumerEntity = costumerEntityMapper.toCostumerEntity(costumer);
        costumerRepository.save(costumerEntity);
    }
}
