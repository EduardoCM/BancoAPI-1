package com.praxis.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.praxis.banco.domain.IndustriaAutomotriz;

@Repository
public class AutoRepositoryImpl implements AutoRepository{

	//Lista estatica de autos a simular la BD
	private static List<IndustriaAutomotriz> autos = new ArrayList<>();
	
	//Bloque Estatico
	static {
		IndustriaAutomotriz carlos = new IndustriaAutomotriz();
		carlos.setId(1L);
		carlos.setMarca("Chebrolet");
		carlos.setModelo("2010");
		carlos.setNombre("Aveo");
		carlos.setColor("Azul");
		
		autos.add(carlos);
	}
	
	@Override
	public IndustriaAutomotriz crearAutomotriz(IndustriaAutomotriz auto) {
		auto.setId(autos.size() + 1L);
		autos.add(auto);
		return auto;
	}

	@Override
	public List<IndustriaAutomotriz> obtenerTodo() {
		return autos;
	}

	@Override
	public Long eliminarAuto(Long idAuto) {
		autos.remove(autos.stream().filter(it -> it.getId().equals(idAuto)).findFirst().get());
		return idAuto;
	}
}