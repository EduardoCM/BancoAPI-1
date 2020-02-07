package com.praxis.banco.service;

import java.util.List;

import com.praxis.banco.domain.StoreSport;

public interface StoreSportService {
	List<StoreSport> obtenerProductos();

	StoreSport obtenerProducto (Long idProducto);

	StoreSport actualizarProducto (StoreSport producto, Long idProducto);
	
	StoreSport borrarProducto (Long idProducto);
	
	StoreSport crearProducto (StoreSport producto);
}
