package com.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cursomc.domain.Categoria;
import com.cursomc.repositories.CategoriaRepositorio;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner  {
	
	
	@Autowired
	private CategoriaRepositorio repo;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

		public void run(String... args) throws Exception {
			Categoria cat1 = new Categoria(null , "Informática");
			Categoria cat2 = new Categoria(null , "Escriório");
			
			repo.saveAll(Arrays.asList(cat1, cat2));
			
		}
		
	}


