package com.uniyaz.etut.service.converter;

import com.uniyaz.etut.domain.Ogrenci;
import com.uniyaz.etut.service.dto.OgrenciDto;

public class OgrenciConverter {


    public Ogrenci convertToOgrenci(OgrenciDto ogrenciDto) {

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setId(ogrenciDto.getId());
        ogrenci.setOgrenciAd(ogrenciDto.getOgrenciAd());
        ogrenci.setSinif(ogrenciDto.getSinif());

        return ogrenci;

    }

    public OgrenciDto convertToOgrenciDto(Ogrenci ogrenci) {

        OgrenciDto ogrenciDto = new OgrenciDto();
        ogrenciDto.setId(ogrenci.getId());
        ogrenciDto.setOgrenciAd(ogrenci.getOgrenciAd());
        ogrenciDto.setSinif(ogrenci.getSinif());

        return ogrenciDto;
    }
}
