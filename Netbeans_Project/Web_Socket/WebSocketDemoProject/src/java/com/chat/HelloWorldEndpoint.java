/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chat;

import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/hello",
        decoders = {
            MessageDecoder.class,},
        encoders = {
            MessageEncoder.class
        })
public class HelloWorldEndpoint {

    @OnMessage
    public Person hello(Person person, Session session) {
        if (person.getName().equals("bhavya")) {
            person.setName("Mr. Bhavya");
        }
        try {
            session.getBasicRemote().sendObject(person);
            System.out.println("sent ");
        } catch (Exception ex) {
            Logger.getLogger(HelloWorldEndpoint.class.getName()).log(Level.SEVERE, null, ex);
        }
        return person;

    }

    @OnOpen
    public void myOnOpen(Session session) {
    }

}
