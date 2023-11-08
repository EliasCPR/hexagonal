package com.oliveira.hexagonal.application.core.usecase;

import com.oliveira.hexagonal.application.core.domain.Address;
import com.oliveira.hexagonal.application.core.domain.Costumer;
import com.oliveira.hexagonal.application.ports.in.InsertCostumerInputPort;
import com.oliveira.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.oliveira.hexagonal.application.ports.out.InsertCostumerOutputPort;

public class InsertCostumerUseCase implements InsertCostumerInputPort {
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCostumerOutputPort insertCostumerOutputPort;

    private InsertCostumerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCostumerOutputPort insertCostumerOutputPort
    ){
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCostumerOutputPort = insertCostumerOutputPort;
    }
    @Override
    public void insert(Costumer costumer, String zipCode){
        Address address = findAddressByZipCodeOutputPort.find(zipCode);
        costumer.setAddress(address);
        insertCostumerOutputPort.insert(costumer);
    }
}
