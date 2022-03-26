package com.paulocorrea.clients.repository;

import com.paulocorrea.clients.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Client, Long> {

}
