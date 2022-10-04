package com.example.practica.reto3.respository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.practica.reto3.model.Client;
import com.example.practica.reto3.respository.crud.ClientCrudRepositoryInterface;

@Repository
public class ClientRespository {
    @Autowired
    private ClientCrudRepositoryInterface  clientCrudRepositoryInterface;

    public List<Client> obtenerClientCompleto() {
        return (List<Client>) clientCrudRepositoryInterface.findAll();
    }

    public Client salvarclient(Client client) {
        return clientCrudRepositoryInterface.save(client);
    } 
}
