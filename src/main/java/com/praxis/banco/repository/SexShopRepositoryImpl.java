package com.praxis.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.praxis.banco.domain.SexShop;


@Repository
public class SexShopRepositoryImpl implements SexShopRepository {
	
	private static List<SexShop> productos = new ArrayList<>();

	//Estudiar bloque statico.
	static {
		SexShop producto1 = new SexShop();

		producto1.setNombre("Producto 1");
		producto1.setPrecio(1000);
		
		productos.add(producto1);
	}

	@Override
	public SexShop crearProducto(SexShop cliente) {
		productos.add(cliente);
		return cliente;
	}

	@Override
	public List<SexShop> obtenerTodo() {
		return productos;
	}

	@Override
	public Long eliminarProducto(Long idProducto) {
		System.out.println("Id producto: " + idProducto);
		productos.remove(productos.stream().
				filter(it -> it.getIdProducto().equals(idProducto)).findFirst().get());
		return idProducto;
	}
	
	

}
