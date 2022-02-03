/**
 * 
 */
package com.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursomc.domain.Endereco;

/**
 * @author Marcus Dimitri
 *
 */
public interface EnderecoRepositorio  extends JpaRepository<Endereco, Integer> {

}
