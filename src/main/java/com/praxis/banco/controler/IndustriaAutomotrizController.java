package com.praxis.banco.controler;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.praxis.banco.domain.IndustriaAutomotriz;
import com.praxis.banco.service.AutoService;


public class IndustriaAutomotrizController {
	
	private AutoService autoService;
	
	public IndustriaAutomotriz addAuto (IndustriaAutomotriz auto) {
		return autoService.crearAuto(auto);
	}
	
	public List<IndustriaAutomotriz> getAll(){
		return autoService.obtenerTodo();
	}
	
	public Long remveAuto(@PathVariable(name = "idAuto") Long idAuto) {
		return autoService.eliminarAuto(idAuto);
	}

}
