package com.praxis.banco.service;

import java.util.List;

import com.praxis.banco.domain.SexShop;

public interface SexShopService {
	
	SexShop crearCliente(SexShop producto);

	List<SexShop> obtenerTodo();

	Long eliminarProducto(Long idProducto);


}
