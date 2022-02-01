package com.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cursomc.domain.Categoria;
import com.cursomc.domain.Produto;
import com.cursomc.repositories.CategoriaRepositorio;
import com.cursomc.repositories.ProdutoRepositorio;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner  {
	
	
	@Autowired
	private CategoriaRepositorio repo;
	
	@Autowired
	private ProdutoRepositorio repoProd;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

		public void run(String... args) throws Exception {
			Categoria cat1 = new Categoria(null , "Informática");
			Categoria cat2 = new Categoria(null , "Escriório");
			
			
			Produto p1 = new Produto(null , "Computador" , 2000.00);
			Produto p2 = new Produto(null , "Impressora" , 800.00);
			Produto p3 = new Produto(null , "Mouse" , 80.00);
			
			cat1.getProdutos().addAll(Arrays.asList(p1 , p2, p3 ));
			cat2.getProdutos().addAll(Arrays.asList(p2));
				
			p1.getCategorias().addAll(Arrays.asList(cat1));
			p2.getCategorias().addAll(Arrays.asList(cat1 , cat2));
			p3.getCategorias().addAll(Arrays.asList(cat1));
			
			repo.saveAll(Arrays.asList(cat1, cat2));
			repoProd.saveAll(Arrays.asList(p1 , p2, p3 ));
			
		}
		
	}


