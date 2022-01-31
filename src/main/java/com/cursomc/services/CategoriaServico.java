/**
 * 
 */
package com.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Categoria;
import com.cursomc.repositories.CategoriaRepositorio;

/**
 * @author Marcus Dimitri
 *
 */
@Service
public class CategoriaServico {
	
	
	@Autowired
	private CategoriaRepositorio repo;
	
	
	public Categoria buscar(Integer id) {
		 Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		} 


}
