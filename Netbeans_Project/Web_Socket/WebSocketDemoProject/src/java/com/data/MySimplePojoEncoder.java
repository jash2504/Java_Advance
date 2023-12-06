package com.data;

import jakarta.json.bind.JsonbBuilder;
import jakarta.websocket.EncodeException;
import jakarta.websocket.Encoder;
import jakarta.websocket.EndpointConfig;

public class MySimplePojoEncoder implements Encoder.Text<MySimplePojo> {

    @Override
    public String encode(MySimplePojo mySimplePojo) throws EncodeException {
        //Using JSON-B (JSR 367) API for mapping to JSON from T
        return JsonbBuilder.create().toJson(mySimplePojo);

    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
