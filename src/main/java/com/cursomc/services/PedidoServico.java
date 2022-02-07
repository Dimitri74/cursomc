/**
 * 
 */
package com.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Pedido;
import com.cursomc.repositories.PedidoRepositorio;
import com.cursomc.services.exceptions.ObjectNotFoundException;

/**
 * @author Marcus Dimitri
 *
 */
@Service
public class PedidoServico   {

	@Autowired
	private PedidoRepositorio repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}

	
	
	
	
	

}
