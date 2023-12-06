package com.annotation;

import com.data.MySimplePojo;
import com.data.MySimplePojoDecoder;
import com.data.MySimplePojoEncoder;

import jakarta.inject.Inject;
import jakarta.websocket.EncodeException;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@ServerEndpoint(value = "/pojo", encoders = MySimplePojoEncoder.class,
        decoders = MySimplePojoDecoder.class)
public class MySimplePojoEndPoint {

    @Inject
    private Logger logger;


    @OnOpen
    public void opened(final Session session) throws IOException, EncodeException {
        MySimplePojo mySimplePojo = new MySimplePojo("Java EE", "sandeep@gmail.com", "Great day! How is life?");
        session.getBasicRemote().sendObject(mySimplePojo);

    }

    @OnMessage
    public void processMessage(final Session session, MySimplePojo mySimplePojo) throws IOException, EncodeException {
        logger.log(Level.INFO, "My simple pojo received on the server *************");
        logger.log(Level.INFO, mySimplePojo.toString());
        session.getBasicRemote().sendObject(mySimplePojo);

    }


}