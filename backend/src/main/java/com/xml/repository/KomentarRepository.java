package com.xml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xml.backend.domain.Komentar;

@Repository
public interface KomentarRepository extends JpaRepository<Komentar, Long>{

}
