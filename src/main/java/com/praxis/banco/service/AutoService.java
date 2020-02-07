package com.praxis.banco.service;

import java.util.List;

import com.praxis.banco.domain.IndustriaAutomotriz;

public interface AutoService {
	
	IndustriaAutomotriz crearAuto(IndustriaAutomotriz auto);
	
	List<IndustriaAutomotriz> obtenerTodo();
	
	Long eliminarAuto(Long idAuto);

}
