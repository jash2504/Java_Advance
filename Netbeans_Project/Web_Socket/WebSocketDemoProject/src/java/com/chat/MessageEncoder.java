/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chat;

import jakarta.websocket.Encoder;

import java.io.StringWriter;
 
import jakarta.websocket.EncodeException;
import jakarta.websocket.Encoder;
import jakarta.websocket.EndpointConfig;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
 
public class MessageEncoder implements Encoder.Text<Person> {

    @Override
    public String encode(Person object) throws EncodeException {

        JAXBContext jaxbContext = null;
        StringWriter st = null;
        try {
            jaxbContext = JAXBContext.newInstance(Person.class);

            Marshaller marshaller = jaxbContext.createMarshaller();
            st = new StringWriter();
            marshaller.marshal(object, st);
            System.out.println("OutGoing XML " + st.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return st.toString();
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