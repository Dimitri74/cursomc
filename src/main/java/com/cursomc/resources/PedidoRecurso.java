/**
 * 
 */
package com.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursomc.domain.Pedido;
import com.cursomc.services.PedidoServico;

/**
 * @author Marcus Dimitri
 *
 */

@RestController
@RequestMapping(value="/pedidos")
public class PedidoRecurso {

	@Autowired
	private PedidoServico service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Pedido> find(@PathVariable Integer id) {
		Pedido obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
