package com.praxis.banco.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.praxis.banco.domain.Organico;
import com.praxis.banco.service.OrganicoService;

@RestController
public class OrganicoController {
	
	@Autowired
	private OrganicoService organicoService;
	
	@GetMapping
	public List<Organico> getAll(){
		return organicoService.obtenerTodo();
	}
	@PostMapping
	public Organico addOrganico (@RequestBody Organico organico) {
		return 	organicoService.crearOrganico(organico);
	}
	
	@DeleteMapping("/{idOrganico}")
	public Long removeOrganico(@PathVariable (name="idOrganico") Long idOrganico) {
		return organicoService.eliminarOrganico(idOrganico);
	}

}
