package com.xml.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xml.backend.domain.Smestaj;


@Repository
public interface SmestajRepository extends JpaRepository<Smestaj, Long> {
	
	public List<Smestaj> findByAgent (Long agent);

}
