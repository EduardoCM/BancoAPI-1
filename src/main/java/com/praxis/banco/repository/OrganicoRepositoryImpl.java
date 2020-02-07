package com.praxis.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.praxis.banco.domain.Organico;

@Repository
public class OrganicoRepositoryImpl implements OrganicoRepository {

	//Lista estatica del producto
	private static List<Organico> prodOrganicos = new ArrayList<>();
	
	static {
		Organico producto = new Organico();
		producto.setId(1L);
		producto.setNombre("Quinoa");
		producto.setMarca("okko");
		producto.setPrecio(40L);
		prodOrganicos.add(producto);
	}
	@Override
	public Organico crearOrganico(Organico organico) {
		organico.setId(prodOrganicos.size() + 1L);
		prodOrganicos.add(organico);
		return organico;
	}

	@Override
	public List<Organico> obtenerTodo() {
		return prodOrganicos;
	}

	@Override
	public Long eliminarOrganico(Long idOrganico) {
		prodOrganicos.remove(prodOrganicos.stream().
				filter(it->it.getId().equals(idOrganico)).findFirst().get());
		return idOrganico;
	}

}
