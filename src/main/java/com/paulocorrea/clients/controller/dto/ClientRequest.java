package com.paulocorrea.clients.controller.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Getter
@Setter
public class ClientRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String document;

    private String address;

    private LocalDate birthDate;

}
