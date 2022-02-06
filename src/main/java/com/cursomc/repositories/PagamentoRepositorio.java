/**
 * 
 */
package com.cursomc.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cursomc.domain.Cliente;
import com.cursomc.domain.Pagamento;
import com.cursomc.domain.Pedido;



/**
 * @author Marcus Dimitri
 *
 */
@Repository
public interface PagamentoRepositorio extends JpaRepository<Pagamento, Integer>   {
	
	//@Transactional(readOnly=true)
	//Page<Pedido> findByCliente(Cliente cliente, Pageable pageRequest);

}
