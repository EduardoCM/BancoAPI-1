package com.praxis.banco.repository;

import java.util.List;

import com.praxis.banco.domain.Organico;

public interface OrganicoRepository {
	
	Organico crearOrganico(Organico organico);
	
	List<Organico> obtenerTodo();
	
	Long eliminarOrganico(Long idOrganico);
	

}
