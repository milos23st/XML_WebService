package com.xml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xml.backend.domain.TipSmestaja;

@Repository
public interface TipSmestajaRepository extends JpaRepository<TipSmestaja,Long> {

}
