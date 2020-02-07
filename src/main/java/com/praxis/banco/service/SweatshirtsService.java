package com.praxis.banco.service;

import java.util.List;

import com.praxis.banco.domain.Cliente;
import com.praxis.banco.domain.Sweatshirts;

public interface SweatshirtsService {

	List<Sweatshirts> getAll();
	
	Long deletSweat(Long idSweats);
	
}
