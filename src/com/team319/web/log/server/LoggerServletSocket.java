package com.team319.web.log.server;

import com.team319.robot.logging.LogSender;
import com.team319.robot.logging.RobotLogger;

import java.io.IOException;

import org.eclipse.jetty.websocket.api.RemoteEndpoint;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WebSocketAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerServletSocket extends WebSocketAdapter implements LogSender {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void onWebSocketClose(int statusCode, String reason) {
		super.onWebSocketClose(statusCode, reason);
		RobotLogger.getInstance().unregisterSender(this);
	}

    public void onWebSocketText(String message) {
    	if(message.equalsIgnoreCase("start")){
    		RobotLogger.getInstance().registerSender(this);
    		RobotLogger.getInstance().start();
    	}
    }

    @Override
    public void onWebSocketBinary(byte[] imageData, int offset, int len) {
       //not supported
    }
	@Override
	public void sendRobotJson(String json) {
		try {
			RemoteEndpoint endpoint = getRemote();
			if(endpoint == null){
				logger.debug("No one is listening.");
			}else{
				getRemote().sendString(json);
			}
		} catch (IOException e) {
			logger.error("Unable to send log");
		}
	}

}
