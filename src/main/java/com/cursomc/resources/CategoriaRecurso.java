/**
 * 
 */
package com.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marcus Dimitri
 *
 */

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaRecurso {

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "REST OK!";

	}

}
