package com.praxis.banco.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praxis.banco.domain.Sweatshirts;
import com.praxis.banco.repository.sweatshirtsRepository;
@Service
public class SweatshirtsServiceImpl implements SweatshirtsService{

	@Autowired
	private sweatshirtsRepository sweatshirtsRepository;
	
	
	@Override
	public List<Sweatshirts> getAll() {
		return sweatshirtsRepository.getAll();
	}


	@Override
	public Long deletSweat(Long idSweats) {
		// TODO Auto-generated method stub
		return sweatshirtsRepository.deletSweat(idSweats);
	}

}
