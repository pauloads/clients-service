package com.paulocorrea.clients.repository;

import com.paulocorrea.clients.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientsRepository extends JpaRepository<Client, Long>, JpaSpecificationExecutor<Client> {

}
