package com.paulocorrea.clients.service;

import com.paulocorrea.clients.entity.Client;
import com.paulocorrea.clients.exception.ClientNotFoundException;
import com.paulocorrea.clients.repository.ClientsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientsService {

    private final ClientsRepository repository;

    public Client save(Client client) {
        return repository.save(client);
    }

    public Client getById(final Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ClientNotFoundException(String.format("Client with id [%s] not found", id)));
    }

}
