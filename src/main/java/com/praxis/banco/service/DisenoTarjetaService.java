package com.praxis.banco.service;

import java.util.List;

import com.praxis.banco.domain.DisenoTarjetas;

public interface DisenoTarjetaService {
	
	/**
	 * Obtener la lista de todos los
	 * disenos de tarjeta
	 * @return
	 */
	List<DisenoTarjetas> obtenerRegistrosTarjetas();
	
	/**
	 * Se crea pedido de tarjeta
	 * @param tarjeta
	 * @return
	 */
	DisenoTarjetas crearDisenoTarjeta(DisenoTarjetas tarjeta);
	
	
	/**
	 * Eliminar diseno de tarjeta
	 * @param idTarjeta
	 * @return
	 */
	Long eliminarDisenoTarjeta(Long idTarjeta);

}
