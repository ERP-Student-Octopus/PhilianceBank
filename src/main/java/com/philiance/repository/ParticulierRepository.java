package com.philiance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.philiance.model.Particulier;

@Repository
public interface ParticulierRepository extends CrudRepository<Particulier, String> {

}
