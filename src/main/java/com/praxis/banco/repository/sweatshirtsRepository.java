package com.praxis.banco.repository;

import java.util.List;

import com.praxis.banco.domain.Sweatshirts;

public interface sweatshirtsRepository {
	/**obtener Lista de productos
	 * @param N/A
	 * @return retorna la lista de productos
	 * */
	
	List<Sweatshirts> getAll();
	/**Elimina el producto 
	 * @param idSwats que se eliminara
	 * @return Retorna el producto eliminado de la lista
	 * */
	Long deletSweat(Long idSweat);
}
