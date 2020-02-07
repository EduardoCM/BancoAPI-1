package com.praxis.banco.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praxis.banco.service.StoreSportService;
import com.praxis.banco.domain.StoreSport;

@RestController
@RequestMapping("/api/v1/StoreSport")
public class StoreSportController {

	@Autowired
	private StoreSportService productos;

	@GetMapping
	public List<StoreSport> getAll() {
		return productos.obtenerProductos();
	}
	
	@PostMapping
	public StoreSport addProducto (@RequestBody StoreSport producto) {
		return productos.crearProducto(producto);
	}

}
