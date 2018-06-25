package com.xml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xml.backend.domain.Smestaj;

@Repository
public interface SmestajRepository extends JpaRepository<Smestaj, Long> {

}
