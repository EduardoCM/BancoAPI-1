package com.praxis.banco.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praxis.banco.domain.DisenoTarjetas;
import com.praxis.banco.repository.DisenoTarjetaRepository;

@RestController
@RequestMapping("/api/v1/disenoTarjetas")
public class DisenoTarjetaController {
	
	
	@Autowired
	private DisenoTarjetaRepository disenoTarjetaRepository;
	
	
	/**
	 * REST -GET- obtener informacion
	 * @return
	 */
	@GetMapping
	public List<DisenoTarjetas> getAllDisenoTarjetas(){
		return disenoTarjetaRepository.obtenerRegistrosTarjetas();
	}
	
	/**
	 * REST -POST- Guardar informacion
	 * @param disenoTarjetas
	 * @return
	 */
	@PostMapping
	public DisenoTarjetas addDisenoTarjetas (@RequestBody DisenoTarjetas disenoTarjetas) {
		return disenoTarjetaRepository.crearDisenoTarjeta(disenoTarjetas);
	}
	
	/**
	 * REST- DELETE - Eliminar informacion
	 * @param idTarjeta
	 * @return
	 */
	@DeleteMapping("/{idTarjeta}")
	public Long deleteDisenoTarjetas (@PathVariable(name = "idTarjeta") Long idTarjeta) {
		return disenoTarjetaRepository.eliminarDisenoTarjeta(idTarjeta);
	}
}