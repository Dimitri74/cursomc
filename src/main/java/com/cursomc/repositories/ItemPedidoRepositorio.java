/**
 * 
 */
package com.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursomc.domain.ItemPedido;

/**
 * @author Marcus Dimitri
 *
 */
@Repository
public interface ItemPedidoRepositorio extends JpaRepository<ItemPedido, Integer>   {

}
