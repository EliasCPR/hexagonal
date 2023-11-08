package com.oliveira.hexagonal.application.ports.out;

import com.oliveira.hexagonal.application.core.domain.Costumer;

public interface InsertCostumerOutputPort {
    void insert(Costumer costumer);
}
