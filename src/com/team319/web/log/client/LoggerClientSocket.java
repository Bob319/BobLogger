package com.team319.web.log.client;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggerClientSocket extends WebSocketAdapter {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void onWebSocketText(String message) {
    	logger.info(message);
    }

    @Override
    public void onWebSocketBinary(byte[] imageData, int offset, int len) {
       //not supported
    }

}
