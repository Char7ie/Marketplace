package com.eoi.marketplace.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.eoi.marketplace.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	List<Pedido> findByNombreContainingIgnoreCase(String nombreparcial);
}
