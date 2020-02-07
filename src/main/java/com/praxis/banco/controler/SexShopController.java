package com.praxis.banco.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praxis.banco.domain.SexShop;
import com.praxis.banco.service.SexShopService;

@RestController
@RequestMapping("/api/v1/sexshop")
public class SexShopController {

	@Autowired
	private SexShopService service;

	@PostMapping
	public SexShop crearProducto(@RequestBody SexShop product) {
		return service.crearCliente(product);
	}

	@GetMapping
	public List<SexShop> getAll() {
		return service.obtenerTodo();
	}

	@DeleteMapping("/{idProducto}")
	public Long eliminarProducto(@PathVariable(name = "idProducto") Long idProducto) {
		System.out.println("Id:::: " + idProducto);
		service.eliminarProducto(idProducto);
		return idProducto;
	}
}
