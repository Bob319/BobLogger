package com.team319;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.team319.web.LoggerServer;

public class ServerMain {

	private static Logger logger = LoggerFactory.getLogger(ServerMain.class);

	public static void main(String[] args) {

		logger.info("Starting Logger Server");

		LoggerServer.startServer();
	}

}
