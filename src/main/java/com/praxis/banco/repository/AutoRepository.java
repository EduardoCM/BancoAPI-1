package com.praxis.banco.repository;

import java.util.List;

import com.praxis.banco.domain.IndustriaAutomotriz;

public interface AutoRepository {
	
	IndustriaAutomotriz crearAutomotriz(IndustriaAutomotriz auto);
	
	List<IndustriaAutomotriz> obtenerTodo();
	
	Long eliminarAuto(Long idAuto);

}
