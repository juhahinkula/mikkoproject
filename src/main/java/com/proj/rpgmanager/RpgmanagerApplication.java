package com.proj.rpgmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.proj.rpgmanager.domain.Character;
import com.proj.rpgmanager.domain.CharacterRepository;
import com.proj.rpgmanager.domain.Group;
import com.proj.rpgmanager.domain.GroupRepository;
import com.proj.rpgmanager.domain.Player;
import com.proj.rpgmanager.domain.PlayerRepository;



@SpringBootApplication
public class RpgmanagerApplication {
	private static final Logger log = LoggerFactory.getLogger(RpgmanagerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RpgmanagerApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CharacterRepository characterRepository, PlayerRepository playerRepository, GroupRepository groupRepository) {
	return (args) -> {
	
		
	};	
		
	}
		
		
}
