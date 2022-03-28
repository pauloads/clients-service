package com.paulocorrea.clients.service;

import com.paulocorrea.clients.controller.dto.ClientRequest;
import com.paulocorrea.clients.controller.dto.ClientResponse;
import com.paulocorrea.clients.controller.mapper.ClientMapper;
import com.paulocorrea.clients.entity.Client;
import com.paulocorrea.clients.exception.ClientNotFoundException;
import com.paulocorrea.clients.repository.ClientsRepository;
import com.paulocorrea.clients.repository.specification.ClientSpecificationBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.springframework.beans.BeanUtils.copyProperties;

@Service
@RequiredArgsConstructor
public class ClientsService {

    private final ClientsRepository repository;

    private final ClientMapper mapper;

    public Client save(Client client) {
        return repository.save(client);
    }

    public Client getById(final Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ClientNotFoundException(String.format("Client with id [%s] not found", id)));
    }

    public Client update(ClientRequest clientRequest, Long id) {
        var clientToUpdate = getById(id);
        copyProperties(clientRequest, clientToUpdate);
        repository.save(clientToUpdate);
        return clientToUpdate;
    }

    public Page<ClientResponse> listPaginated(Pageable pageable, final String name, final String document,
                                              final LocalDate birthDate) {

        var builder = new ClientSpecificationBuilder();

        if (!isEmpty(name)) {
            builder.with("name", name);
        }
        if (!isEmpty(document)) {
            builder.with("document", document);
        }
        if (birthDate != null) {
            builder.with("birthDate", birthDate);
        }

        Page<Client> clientPage = Page.empty();
        if (builder.hasValue()) {
            Specification<Client> specification = builder.build();
            clientPage = repository.findAll(specification, pageable);
        } else {
            clientPage = repository.findAll(pageable);
        }

        return clientPage.map(mapper::fromEntityToOutput);
    }
}
