package com.xml.service;

import java.util.List;

import com.xml.backend.domain.NaseljenoMesto;



public interface NaseljenoMestoService {
	NaseljenoMesto findOne(Long id);
    NaseljenoMesto insert(NaseljenoMesto nas);
    List<NaseljenoMesto> search(String naziv);

}
