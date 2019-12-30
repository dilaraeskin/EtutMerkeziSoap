package com.uniyaz.etut.service.soap;


import com.uniyaz.etut.service.dto.OgrenciDto;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface OgrenciService {

    @WebMethod
    OgrenciDto saveOgrenci(OgrenciDto ogrenciDto);


}
