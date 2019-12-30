package com.uniyaz.etut.service.soap;


import com.uniyaz.etut.service.dto.EtutDto;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface EtutService {

    @WebMethod
    EtutDto saveEtut(EtutDto etutDto);
}
