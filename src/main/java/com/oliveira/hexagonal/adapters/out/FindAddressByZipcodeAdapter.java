package com.oliveira.hexagonal.adapters.out;

import com.oliveira.hexagonal.adapters.out.client.FindAddressByZipcodeClient;
import com.oliveira.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.oliveira.hexagonal.application.core.domain.Address;
import com.oliveira.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipcodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipcodeClient findAddressByZipcodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipcodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
