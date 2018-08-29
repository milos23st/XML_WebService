package com.xml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xml.backend.domain.NaseljenoMesto;

@Repository
public interface NaseljenoMestoRepository extends JpaRepository<NaseljenoMesto,Long> {

}
