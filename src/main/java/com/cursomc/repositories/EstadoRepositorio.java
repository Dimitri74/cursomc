/**
 * 
 */
package com.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursomc.domain.Estado;

/**
 * @author Marcus Dimitri
 *
 */
@Repository
public interface EstadoRepositorio extends JpaRepository<Estado ,Integer>   {

}
