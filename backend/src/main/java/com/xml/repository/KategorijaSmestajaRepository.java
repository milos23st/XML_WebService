package com.xml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xml.backend.domain.Kategorija;

@Repository
public interface KategorijaSmestajaRepository extends JpaRepository<Kategorija,Long> {

}
