package com.praxis.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.praxis.banco.domain.Sweatshirts;

@Repository
public class SweatshirtsImpl implements sweatshirtsRepository{

	//Lista statica clientes simular base de dato.
	private static List<Sweatshirts> sweatshirts = new ArrayList<>();

	//Estudiar bloque statico.
	static {
		Sweatshirts sweatsh= new Sweatshirts();
		
		sweatsh.setId(1L);
		sweatsh.setMarca("Adidas");
		sweatsh.setTipoTela("Algodon");
		
		sweatshirts.add(sweatsh);
	}

	@Override
	public List<Sweatshirts> getAll() {
		// TODO Auto-generated method stub
		return sweatshirts;
	}

	@Override
	public Long deletSweat(Long idSweat) {
		sweatshirts.remove(sweatshirts.stream().
				filter(it -> it.getId().equals(idSweat)).findFirst().get());
		return idSweat;
	}
	

	
	
}
