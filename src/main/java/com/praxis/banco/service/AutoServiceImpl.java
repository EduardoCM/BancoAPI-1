package com.praxis.banco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praxis.banco.domain.IndustriaAutomotriz;
import com.praxis.banco.repository.AutoRepository;

@Service
public class AutoServiceImpl implements AutoService{
	
	@Autowired
	private AutoRepository autoRepository;

	@Override
	public IndustriaAutomotriz crearAuto(IndustriaAutomotriz auto) {
		return autoRepository.crearAutomotriz(auto);
	}

	@Override
	public List<IndustriaAutomotriz> obtenerTodo() {
		return autoRepository.obtenerTodo();
	}

	@Override
	public Long eliminarAuto(Long idAuto) {
		return autoRepository.eliminarAuto(idAuto);
	}

}
