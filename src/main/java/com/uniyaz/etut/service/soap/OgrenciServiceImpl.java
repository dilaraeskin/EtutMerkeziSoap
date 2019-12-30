package com.uniyaz.etut.service.soap;


import com.uniyaz.etut.dao.OgrenciDao;
import com.uniyaz.etut.domain.Ogrenci;
import com.uniyaz.etut.service.converter.OgrenciConverter;
import com.uniyaz.etut.service.dto.OgrenciDto;

import javax.jws.WebService;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/services/*", name = "OgrenciServiceServlet", loadOnStartup = 1)
@WebListener(value = "com.sun.xml.ws.transport.http.servlet.WSServletContextListener")
@WebService(endpointInterface = "com.uniyaz.etut.service.soap.OgrenciService", name = "OgrenciService")
public class OgrenciServiceImpl implements OgrenciService {
    @Override
    public OgrenciDto saveOgrenci(OgrenciDto ogrenciDto) {

        OgrenciConverter ogrenciConverter=new OgrenciConverter();
        Ogrenci ogrenci= ogrenciConverter.convertToOgrenci(ogrenciDto);

        OgrenciDao ogrenciDao = new OgrenciDao();
        ogrenci=ogrenciDao.saveOgrenci(ogrenci);

        OgrenciDto ogrenciDtoSaved= ogrenciConverter.convertToOgrenciDto(ogrenci);
        return ogrenciDtoSaved;

    }
}
