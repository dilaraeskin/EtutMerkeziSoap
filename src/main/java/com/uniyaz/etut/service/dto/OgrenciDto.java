package com.uniyaz.etut.service.dto;

public class OgrenciDto {

    private Long id;
    private String ogrenciAd;
    private Integer sinif;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    public Integer getSinif() {
        return sinif;
    }

    public void setSinif(Integer sinif) {
        this.sinif = sinif;
    }
}
