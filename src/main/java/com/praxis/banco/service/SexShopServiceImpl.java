package com.praxis.banco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praxis.banco.domain.SexShop;
import com.praxis.banco.repository.SexShopRepository;

@Service
public class SexShopServiceImpl implements SexShopService {

	@Autowired
	private SexShopRepository repository;

	@Override
	public SexShop crearCliente(SexShop producto) {
		repository.crearProducto(producto);
		return producto;
	}

	@Override
	public List<SexShop> obtenerTodo() {
		return repository.obtenerTodo();
	}

	@Override
	public Long eliminarProducto(Long idProducto) {
		return repository.eliminarProducto(idProducto);
	}

}
