/**
 * 
 */
package com.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursomc.domain.Cidade;

/**
 * @author Marcus Dimitri
 *
 */
@Repository
public interface CidadeRepositorio extends JpaRepository<Cidade, Integer>   {

}
