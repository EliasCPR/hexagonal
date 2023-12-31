package com.oliveira.hexagonal.adapters.in.controller;

import com.oliveira.hexagonal.adapters.in.controller.mapper.CostumerMapper;
import com.oliveira.hexagonal.adapters.in.controller.request.CostumerRequest;
import com.oliveira.hexagonal.application.ports.in.InsertCostumerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/costumers")
public class CostumerController {
    @Autowired
    private InsertCostumerInputPort insertCostumerInputPort;

    @Autowired
    private CostumerMapper costumerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody @Valid CostumerRequest costumerRequest){
        var costumer = costumerMapper.toCostumer(costumerRequest);
        insertCostumerInputPort.insert(costumer, costumerRequest.getZipCode());

        return ResponseEntity.ok().build();
    }
}
