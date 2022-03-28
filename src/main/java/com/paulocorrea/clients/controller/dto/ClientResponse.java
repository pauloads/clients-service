package com.paulocorrea.clients.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ClientResponse {

    private String name;

    private String document;

    private String address;

    private LocalDate birthDate;

    private int age;

}
