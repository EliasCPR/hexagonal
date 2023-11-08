package com.oliveira.hexagonal.application.ports.in;

import com.oliveira.hexagonal.application.core.domain.Costumer;

public interface InsertCostumerInputPort {
    void insert(Costumer costumer, String zipCode) ;
}
