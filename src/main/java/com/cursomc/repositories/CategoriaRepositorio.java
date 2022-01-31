/**
 * 
 */
package com.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursomc.domain.Categoria;

/**
 * @author Marcus Dimitri
 *
 */
@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer>   {

}
