package com.xml.service;

import java.util.List;

import com.xml.backend.domain.Komentar;



public interface KomentarService {
	List<Komentar> findAll();
    Komentar findOne(Long id);
    Komentar create(Komentar komentar);
    void delete(Long id);
}
