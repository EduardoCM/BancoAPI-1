package com.praxis.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.praxis.banco.domain.StoreSport;

@Repository
public class StoreSportRepositoryImpl implements StoreSportRepository {

	private static List<StoreSport> productos = new ArrayList<>();
	
	static {
		StoreSport producto = new StoreSport();
		
		producto.setIdProducto(1L);
		producto.setNombreProducto("Zapatos");
		producto.setDescripcion("Zapatos para futbol rapido");
		
		productos.add(producto);
		
	}

	@Override
	public List<StoreSport> obtenerProductos() {
		// TODO Auto-generated method stub
		return productos;
	}

	@Override
	public StoreSport obtenerProducto(Long idProducto) {

		return productos.stream().filter(it -> it.getIdProducto().equals(idProducto)).findFirst()
				.get();
	}

	@Override
	public StoreSport actualizarProducto(StoreSport producto, Long idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoreSport borrarProducto(Long idProducto) {
		StoreSport productoBorrar = productos.stream().filter(it -> it.getIdProducto().equals(idProducto)).findFirst()
				.get();
		productos.remove(productos.stream().filter(it -> it.getIdProducto().equals(idProducto)).findFirst().get());
		return productoBorrar;
	}

	@Override
	public StoreSport crearProducto(StoreSport producto) {
		producto.setIdProducto(productos.size() +1L);
		productos.add(producto);
		return producto;
	}

}
