package com.praxis.banco.repository;

import java.util.List;

import com.praxis.banco.domain.DisenoTarjetas;

public interface DisenoTarjetaRepository {
	
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
