package com.paulocorrea.clients.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String document;

    private String address;

    private LocalDate birthDate;

    @NotNull
    private boolean deleted;

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }

}
