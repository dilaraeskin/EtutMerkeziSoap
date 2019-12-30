package com.uniyaz.etut.service.converter;

import com.uniyaz.etut.dao.EtutDao;
import com.uniyaz.etut.domain.Etut;
import com.uniyaz.etut.service.dto.EtutDto;

public class EtutConverter {

    public Etut convertToEtut(EtutDto etutDto){

        Etut etut=new Etut();
        etut.setId(etutDto.getId());
        etut.setDate(etutDto.getDate());
        etut.setOgretmen(etutDto.getOgretmen());

        return etut;

    }

    public EtutDto convertToEtutDto(Etut etut){

        EtutDto etutDto=new EtutDto();
        etutDto.setId(etut.getId());
        etutDto.setDate(etut.getDate());
        etutDto.setOgretmen(etut.getOgretmen());

        return etutDto;

    }


}
