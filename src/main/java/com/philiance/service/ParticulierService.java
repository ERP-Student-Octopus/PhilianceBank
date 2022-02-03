package com.philiance.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.philiance.model.Particulier;
import com.philiance.repository.ParticulierRepository;


@Transactional
@Service
public class ParticulierService {
	
	@Autowired
	private ParticulierRepository particulierRepository;
	
	public Particulier save (Particulier particulier) {
		return particulierRepository.save(particulier);
	}
	
	public List<Particulier> findAll() {
		return(List<Particulier>) particulierRepository.findAll();
	}
	
	public Particulier findById(String value) {
		Optional<Particulier> optional = particulierRepository.findById(value);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}
}
