package com.cursomc;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cursomc.domain.Categoria;
import com.cursomc.domain.Cidade;
import com.cursomc.domain.Cliente;
import com.cursomc.domain.Endereco;
import com.cursomc.domain.Estado;
import com.cursomc.domain.Produto;
import com.cursomc.domain.enums.TipoCliente;
import com.cursomc.repositories.CategoriaRepositorio;
import com.cursomc.repositories.CidadeRepositorio;
import com.cursomc.repositories.ClienteRepositorio;
import com.cursomc.repositories.EnderecoRepositorio;
import com.cursomc.repositories.EstadoRepositorio;
import com.cursomc.repositories.ProdutoRepositorio;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner  {
	
	
	@Autowired
	private CategoriaRepositorio repo;
	
	@Autowired
	private ProdutoRepositorio repoProd;
	
	@Autowired
	private EstadoRepositorio estadoRepo;
	
	@Autowired
	private CidadeRepositorio cidadeRepo;
	
	@Autowired
	private EnderecoRepositorio enderecoRepositorio;
	
	@Autowired
	private ClienteRepositorio clienteRepositorio;

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
			
			Estado est1 = new Estado(null , "Distrito Federal");
			Estado est2 = new Estado(null , "São Paulo");
			
			Cidade c1 = new Cidade(null , "Brasília" , est1);
			Cidade c2 = new Cidade(null , "São Paulo" , est2);
			Cidade c3 = new Cidade(null , "Campinas" , est2);
			
			est1.getCidades().addAll(Arrays.asList(c1));
			est2.getCidades().addAll(Arrays.asList(c2, c3));
			
			estadoRepo.saveAll(Arrays.asList(est1 , est2));
			cidadeRepo.saveAll(Arrays.asList(c1, c2,c3));
			
			Cliente cli1 = new Cliente(null , "Maria Silva" , "maria@gmail" , "36378912377" , TipoCliente.PESSOAFISICA);
			cli1.getTelefones().addAll(Arrays.asList("27363323" , "93838393"));
			
			Endereco e1 = new Endereco(null, "Rua Manacá", "4", "Apto 1401", "Aguas Claras", "71907270", cli1, c1); 
			Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38220834", cli1, c2);
			
			cli1.getEnderecos().addAll(Arrays.asList(e1 , e2));
			
			clienteRepositorio.saveAll(Arrays.asList(cli1));
			enderecoRepositorio.saveAll(Arrays.asList(e1 ,e2));
			
		}
		
	}


