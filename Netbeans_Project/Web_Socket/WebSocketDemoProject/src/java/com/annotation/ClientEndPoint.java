package com.annotation;

import com.data.MySimplePojo;
import com.data.MySimplePojoDecoder;
import com.data.MySimplePojoEncoder;

import jakarta.websocket.ClientEndpoint;
import jakarta.websocket.EncodeException;
import jakarta.websocket.OnMessage;
import jakarta.websocket.Session;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@ClientEndpoint(decoders = MySimplePojoDecoder.class,encoders = MySimplePojoEncoder.class)
public class ClientEndPoint {

    @OnMessage
    public void processMessage(final Session session, MySimplePojo mySimplePojo) throws IOException, EncodeException {
        Logger logger = Logger.getLogger(ClientEndPoint.class.getName());

        logger.log(Level.INFO, "%%%%%%%%%%% My simple pojo received on the programmatic %%%%%%%%%%%%");
        logger.log(Level.INFO, mySimplePojo.toString());
        session.getBasicRemote().sendObject(mySimplePojo);
    }
}