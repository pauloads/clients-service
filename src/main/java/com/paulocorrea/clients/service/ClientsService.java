package com.paulocorrea.clients.service;

import com.paulocorrea.clients.controller.dto.ClientRequest;
import com.paulocorrea.clients.controller.dto.ClientResponse;
import com.paulocorrea.clients.controller.mapper.ClientMapper;
import com.paulocorrea.clients.entity.Client;
import com.paulocorrea.clients.exception.ClientNotFoundException;
import com.paulocorrea.clients.repository.ClientsRepository;
import com.paulocorrea.clients.repository.specification.SearchCriteria;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public Page<ClientResponse> listPaginated(Pageable pageable, Map<String, Object> searchArgs) {

        List<SearchCriteria> criterias = searchArgs
                .entrySet()
                .stream()
                .map(entry -> new SearchCriteria(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        Specification<Client> specification =
        var clientEntityPage = repository.findAll(pageable);
        return clientEntityPage.map(mapper::fromEntityToOutput);
    }
}
