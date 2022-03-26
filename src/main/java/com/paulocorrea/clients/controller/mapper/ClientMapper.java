package com.paulocorrea.clients.controller.mapper;

import com.paulocorrea.clients.controller.dto.ClientRequest;
import com.paulocorrea.clients.controller.dto.ClientResponse;
import com.paulocorrea.clients.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    Client fromInputToEntity(ClientRequest request);

    ClientResponse fromEntityToOutput(Client client);
}
