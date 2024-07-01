package com.helloworld.helloWorld.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

	ArrayList<String> bsmList = new ArrayList<String>(
			Arrays.asList("Orientação ao Futuro", "Responsabilidade Pessoal", "Mentalidade de Crescimento",
					"Persistência", "Trabalho em Equipe", "Atenção aos Detalhes", "Proatividade", "Comunicação"));

	ArrayList<String> objectiveList = new ArrayList<String>(
			Arrays.asList("Compreender mais aprofundadamente o conceito RestFul", "Criar um crud com o Spring",
					"Adiantar alguns detalhes do design do projeto integrador",
					"Ajustar meu currículo para as aulas de empregabilidade"));

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/bsm")
	public ArrayList<String> bsm() {
		return bsmList;
	}

	@GetMapping("/objectives")
	public ArrayList<String> objetivos() {
		return objectiveList;
	}

}
