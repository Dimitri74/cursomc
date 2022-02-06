/**
 * 
 */
package com.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Cliente;
import com.cursomc.repositories.ClienteRepositorio;
import com.cursomc.services.exceptions.ObjectNotFoundException;

/**
 * @author Marcus Dimitri
 *
 */
@Service
public class ClienteServico   {

	@Autowired
	private ClienteRepositorio repo;

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}


	
	
	
	
	

}
