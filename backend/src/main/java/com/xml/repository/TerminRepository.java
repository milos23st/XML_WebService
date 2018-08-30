package com.xml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xml.backend.domain.Termin;

@Repository
public interface TerminRepository extends JpaRepository<Termin, Long> {

}
