package com.eoi.marketplace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eoi.marketplace.entity.Articulo;

public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {
	List<Articulo> findByNombreContainingIgnoreCase(String nombreparcial);
}