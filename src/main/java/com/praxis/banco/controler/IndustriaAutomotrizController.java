package com.praxis.banco.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praxis.banco.domain.IndustriaAutomotriz;
import com.praxis.banco.service.AutoService;

@RestController
@RequestMapping("/api/vi/auto")
public class IndustriaAutomotrizController {
	
	@Autowired
	private AutoService autoService;
	
	@PostMapping
	public IndustriaAutomotriz addAuto (IndustriaAutomotriz auto) {
		return autoService.crearAuto(auto);
	}
	
	@GetMapping
	public List<IndustriaAutomotriz> getAll(){
		return autoService.obtenerTodo();
	}
	
	@DeleteMapping
	public Long remveAuto(@PathVariable(name = "idAuto") Long idAuto) {
		return autoService.eliminarAuto(idAuto);
	}

}
