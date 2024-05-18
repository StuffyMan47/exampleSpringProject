package com.example.example;

import Sevices.CommandServices;
import Sevices.PlayerServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	private final PlayerServices playerService;
	private final CommandServices commandService;

	public ExampleApplication(PlayerServices playerService, CommandServices commandService) {
		this.playerService = playerService;
		this.commandService = commandService;
	}


	public static void main(String[] args) {

		SpringApplication.run(ExampleApplication.class, args);

	}

}