package com.paulocorrea.clients.controller;

import com.paulocorrea.clients.controller.dto.ClientRequest;
import com.paulocorrea.clients.controller.dto.ClientResponse;
import com.paulocorrea.clients.controller.mapper.ClientMapper;
import com.paulocorrea.clients.exception.ClientNotFoundException;
import com.paulocorrea.clients.service.ClientsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDate;

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
        try {
            var client = mapper.fromEntityToOutput(service.getById(id));
            return ok(client);
        } catch (ClientNotFoundException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Client not found", ex);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClientResponse> update(@PathVariable Long id, @RequestBody ClientRequest clientRequest) {
        var updatedClient = service.update(clientRequest, id);
        return ok(mapper.fromEntityToOutput(updatedClient));
    }

    @GetMapping
    public ResponseEntity<Page<ClientResponse>> list(Pageable pageable,
                                                     @RequestParam(required = false) String name,
                                                     @RequestParam(required = false) String document,
                                                     @RequestParam(required = false) LocalDate birthDate) {
        return ok(service.listPaginated(pageable, name, document, birthDate));
    }
}
