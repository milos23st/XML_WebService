package com.xml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xml.backend.domain.Zauzetost;

@Repository
public interface ZauzetostRepository extends JpaRepository<Zauzetost,Long>{

}
