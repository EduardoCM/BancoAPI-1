package com.praxis.banco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praxis.banco.domain.Organico;
import com.praxis.banco.repository.OrganicoRepository;

@Service
public class OrganicoServiceImpl implements OrganicoService{
	
	@Autowired
	private OrganicoRepository OrganicoRepository;

	@Override
	public Organico crearOrganico(Organico organico) {
		return OrganicoRepository.crearOrganico(organico);
	}

	@Override
	public List<Organico> obtenerTodo() {
		return OrganicoRepository.obtenerTodo();
	}

	@Override
	public Long eliminarOrganico(Long idOrganico) {
		return OrganicoRepository.eliminarOrganico(idOrganico);
	}

}
