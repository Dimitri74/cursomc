/**
 * 
 */
package com.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Categoria;
import com.cursomc.repositories.CategoriaRepositorio;
import com.cursomc.services.exceptions.ObjectNotFoundException;

/**
 * @author Marcus Dimitri
 *
 */
@Service
public class CategoriaServico   {

	@Autowired
	private CategoriaRepositorio repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}


	
	
	
	
	

}
