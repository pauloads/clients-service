package com.paulocorrea.clients.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("clients")
@Data
public class Client {

    @Id
    private String id;

    private String name;

    private String address;

    private String birthDate;

    private String deleted;

}
