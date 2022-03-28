package com.paulocorrea.clients.controller;

import com.paulocorrea.clients.controller.dto.ClientRequest;
import com.paulocorrea.clients.controller.dto.ClientResponse;
import com.paulocorrea.clients.controller.mapper.ClientMapper;
import com.paulocorrea.clients.repository.specification.SearchCriteria;
import com.paulocorrea.clients.service.ClientsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDate;
import java.util.Map;

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
        var searchArgs = Map.of(
                "name", name,
                "document", document,
                "birthDate", birthDate) ;
        return ok(service.listPaginated(pageable, searchArgs));
    }
}
