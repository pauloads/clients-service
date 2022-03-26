package com.paulocorrea.clients.controller;

import com.paulocorrea.clients.controller.dto.ClientRequest;
import com.paulocorrea.clients.controller.dto.ClientResponse;
import com.paulocorrea.clients.controller.mapper.ClientMapper;
import com.paulocorrea.clients.service.ClientsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import static org.springframework.http.ResponseEntity.created;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClientsController {

    private final ClientsService service;

    private final ClientMapper mapper;

    @PostMapping
    public ResponseEntity<ClientResponse> saveClient(@RequestBody ClientRequest clientRequest) {
        var client = service.save(mapper.fromInputToEntity(clientRequest));
        var location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(client.getId())
                .toUri();
        return created(location).body(mapper.fromEntityToOutput(client));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientResponse> getById(@PathVariable Long id) {
        var client = mapper.fromEntityToOutput(service.getById(id));
        return ok(client);
    }
}
