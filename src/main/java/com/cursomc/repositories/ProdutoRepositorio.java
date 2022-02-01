/**
 * 
 */
package com.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursomc.domain.Produto;



/**
 * @author Marcus Dimitri
 *
 */
@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Integer>   {

}
