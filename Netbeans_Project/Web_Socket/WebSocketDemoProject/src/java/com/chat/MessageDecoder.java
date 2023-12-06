/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chat;

import java.io.StringReader;

import jakarta.websocket.Decoder;
import jakarta.websocket.EndpointConfig;
import jakarta.xml.bind.*;

 
public class MessageDecoder implements Decoder.Text<Person> {

    @Override
    public Person decode(String s) {
        System.out.println("Incoming XML " + s);
        Person person = null;
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Person.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            StringReader reader = new StringReader(s);
            person = (Person) unmarshaller.unmarshal(reader);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return person;
    }

    @Override
    public boolean willDecode(String s) {
         
        return (s != null);
    }

    @Override
    public void init(EndpointConfig endpointConfig) {
        // do nothing.
    }

    @Override
    public void destroy() {
        // do nothing.
    }
}