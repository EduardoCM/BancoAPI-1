package com.praxis.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.praxis.banco.domain.DisenoTarjetas;

@Repository
public class DisenoTarjetaRepositoryImpl implements DisenoTarjetaRepository{
	
	
	   //Lista statica clientes simular base de dato.
		private static List<DisenoTarjetas> tarjetas = new ArrayList<>();
		
		//Bloque statico.
		static {
			DisenoTarjetas disenoTarj = new DisenoTarjetas();
			
			disenoTarj.setId(1L);
			disenoTarj.setCantidad(200);
			disenoTarj.setColores("Azul,blanco y gris");
			disenoTarj.setEvento("Baby Shawer");
			disenoTarj.setCaracteristicas("tamanos de 15 x 10");
			disenoTarj.setNombre("Laura Perez");
			tarjetas.add(disenoTarj);
		}
		
		/**
		 * Se obtiene todos los registros 
		 * de las tarjetas
		 */
		@Override
		public List<DisenoTarjetas> obtenerRegistrosTarjetas() {			
			return tarjetas;
		}
		
		
		/**
		 * Se crea nuevo pedidos
		 * de tarjetas
		 */
		@Override
		public DisenoTarjetas crearDisenoTarjeta(DisenoTarjetas tarjeta) {
			tarjeta.setId(tarjetas.size() + 1L);
			tarjetas.add(tarjeta);
			return tarjeta;
		}
		
		
		/**
		 * Se elimina pedidos de
		 * tarjetas
		 */
		@Override
		public Long eliminarDisenoTarjeta(Long idTarjeta) {
			tarjetas.remove(tarjetas.stream().filter(it -> it.getId().equals(idTarjeta)).findFirst().get());
			return idTarjeta;
		}
}