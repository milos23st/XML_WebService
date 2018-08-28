package com.xml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xml.backend.domain.DodatnaUsluga;

@Repository
public interface DodatnaUslugaRepository extends JpaRepository<DodatnaUsluga,Long> {
}
