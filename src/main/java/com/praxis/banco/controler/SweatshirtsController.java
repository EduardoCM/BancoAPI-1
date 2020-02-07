package com.praxis.banco.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praxis.banco.domain.Sweatshirts;
import com.praxis.banco.service.SweatshirtsService;

@RestController
@RequestMapping("/api/v2/sweatshirts")
public class SweatshirtsController {

	@Autowired
	private SweatshirtsService sweatshirtsService;
	
	/**obtine todos los productos de la lista
	 * @param N/A
	 * @return Lista de Servicio obtenida
	 * */
	@GetMapping
	public List<Sweatshirts> getAll(){
		return sweatshirtsService.getAll();
	}
	/**Elimina el producto 
	 * @param idSweats que se eliminara
	 * @return Servicio de la lista que se elimina
	 * */
	@DeleteMapping ("{idSweats}")
	public Long deletSweats (@PathVariable(name = "idSweats") Long idSweats) {
		return sweatshirtsService.deletSweat(idSweats);
	}
		
}
