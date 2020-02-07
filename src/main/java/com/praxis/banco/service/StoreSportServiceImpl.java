package com.praxis.banco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praxis.banco.domain.StoreSport;
import com.praxis.banco.repository.StoreSportRepository;

@Service
public class StoreSportServiceImpl implements StoreSportService{
	
	@Autowired
	private StoreSportRepository productos;
	
	@Override
	public List<StoreSport> obtenerProductos() {
		// TODO Auto-generated method stub
		return productos.obtenerProductos();
	}

	@Override
	public StoreSport obtenerProducto(Long idProducto) {
		// TODO Auto-generated method stub
		return productos.obtenerProducto(idProducto);
	}

	@Override
	public StoreSport actualizarProducto(StoreSport producto, Long idProducto) {
		// TODO Auto-generated method stub
		return productos.actualizarProducto(producto, idProducto);
	}

	@Override
	public StoreSport borrarProducto(Long idProducto) {
		// TODO Auto-generated method stub
		return productos.borrarProducto(idProducto);
	}

	@Override
	public StoreSport crearProducto(StoreSport producto) {
		// TODO Auto-generated method stub
		return productos.crearProducto(producto);
	}

}
