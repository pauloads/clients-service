package com.paulocorrea.clients.service;

import com.paulocorrea.clients.controller.dto.ClientRequest;
import com.paulocorrea.clients.controller.mapper.ClientMapper;
import com.paulocorrea.clients.entity.Client;
import com.paulocorrea.clients.exception.ClientNotFoundException;
import com.paulocorrea.clients.repository.ClientsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class ClientsServiceTest {

    @Mock
    private ClientsRepository repository;

    @Mock
    private ClientMapper mapper;

    @InjectMocks
    private ClientsService service;

    @Test
    public void shouldCallRepositoryToSaveNewClient() {
        var client = mock(Client.class);
        service.save(client);
        verify(repository, times(1)).save(client);
    }

    @Test
    public void shouldFindClientById() {
        var client = mock(Client.class);
        var id = 1l;
        when(repository.findById(id)).thenReturn(Optional.of(client));

        var actual = service.getById(id);

        assertEquals(client, actual);
    }

    @Test(expected = ClientNotFoundException.class)
    public void shouldThrowExceptionWhenClientNotFound() {
        var client = mock(Client.class);
        var id = 1l;
        when(repository.findById(id)).thenReturn(Optional.empty());

        service.getById(id);
    }

    @Test
    public void shouldUpdateClient() {
        var clientRequest = new ClientRequest();
        clientRequest.setName("client-name");
        clientRequest.setAddress("client-address");
        clientRequest.setDocument("client-document");
        clientRequest.setBirthDate(LocalDate.of(1989, 06, 19));

        var clientPersisted = new Client();
        var id = 1l;

        when(repository.findById(id)).thenReturn(Optional.of(clientPersisted));

        var updated = service.update(clientRequest, id);

        assertEquals(clientRequest.getAddress(), updated.getAddress());
        assertEquals(clientRequest.getDocument(), updated.getDocument());
        assertEquals(clientRequest.getBirthDate(), updated.getBirthDate());
        assertEquals(clientRequest.getName(), updated.getName());
    }

}