package com.praxis.banco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praxis.banco.domain.DisenoTarjetas;
import com.praxis.banco.repository.DisenoTarjetaRepository;


@Service
public class DisenoTarjetaServiceImpl implements DisenoTarjetaService{
	
	@Autowired
	private DisenoTarjetaRepository disenoTarjetaRepository;

	/**
	 * Obtener todos los regstros
	 * de diseno de tarjetas
	 */
	@Override
	public List<DisenoTarjetas> obtenerRegistrosTarjetas() {		
		return disenoTarjetaRepository.obtenerRegistrosTarjetas();
	}
	
	/**
	 * Se crea un nuevo pedido
	 * de tarjetas
	 */
	@Override
	public DisenoTarjetas crearDisenoTarjeta(DisenoTarjetas tarjeta) {		
		return disenoTarjetaRepository.crearDisenoTarjeta(tarjeta);
	}
	
	/**
	 * Eliminar tarjetas
	 */
	@Override
	public Long eliminarDisenoTarjeta(Long idTarjeta) {		
		return disenoTarjetaRepository.eliminarDisenoTarjeta(idTarjeta);
	}
}