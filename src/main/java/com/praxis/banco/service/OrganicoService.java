package com.praxis.banco.service;

import java.util.List;
import com.praxis.banco.domain.Organico;

public interface OrganicoService {
	
	Organico crearOrganico(Organico organico);

	List<Organico> obtenerTodo();

	Long eliminarOrganico(Long idOrganico);

}
