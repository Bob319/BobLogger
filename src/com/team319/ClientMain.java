package com.team319;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.team319.web.LoggerServer;
import com.team319.web.log.client.LoggerClient;

public class ClientMain {

	private static Logger logger = LoggerFactory.getLogger(ClientMain.class);

	public static void main(String[] args) {

		logger.info("Starting Logger Client");

		try {
			LoggerClient.start();
		} catch (Exception e) {
			logger.error("Error Starting Logger Client");
		}
	}

}
