package com.xml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xml.backend.domain.SmestajSlika;

@Repository
public interface SmestajSlikaRepository extends JpaRepository<SmestajSlika, Long> {

}
