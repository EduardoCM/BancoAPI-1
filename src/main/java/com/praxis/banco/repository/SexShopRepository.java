package com.praxis.banco.repository;

import java.util.List;

import com.praxis.banco.domain.SexShop;

public interface SexShopRepository {

	SexShop crearProducto(SexShop cliente);

	List<SexShop> obtenerTodo();
	
	Long eliminarProducto(Long idProducto);
}
