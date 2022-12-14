package com.example.practica.reto3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    // message to partyroom
    @ManyToOne
    @JoinColumn(name = "partyroom")
    @JsonIgnoreProperties({"messages","client","reservations"})
    private Partyroom partyroom;
      
    // message to client
    @ManyToOne
    @JoinColumn(name = "client")
    @JsonIgnoreProperties({"messages","reservations","client"})
    private Client client;

    public Partyroom getPartyroom() {
        return partyroom;
    }
    public void setPartyroom(Partyroom partyroom) {
        this.partyroom = partyroom;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Integer getIdMessage() {
        return idMessage;
    }
    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }
    public String getMessageText() {
        return messageText;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    
}
