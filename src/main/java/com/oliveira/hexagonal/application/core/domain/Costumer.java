package com.oliveira.hexagonal.application.core.domain;

import lombok.Data;

@Data
public class Costumer {

    public Costumer(){
        this.isValidCpf = false;
    }
    public Costumer(String id, String name, Address address, String cpf, Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
    }

    private String id;
    private String name;
    private Address address;
    private String cpf;
    private Boolean isValidCpf;
}
