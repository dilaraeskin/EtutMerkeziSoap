package com.uniyaz.etut.service.soap;


import com.uniyaz.etut.dao.EtutDao;
import com.uniyaz.etut.domain.Etut;
import com.uniyaz.etut.service.converter.EtutConverter;
import com.uniyaz.etut.service.dto.EtutDto;

import javax.jws.WebService;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
/*
@WebServlet(urlPatterns = "/services/*", name = "EtutServiceServlet", loadOnStartup = 1)
@WebListener(value = "com.sun.xml.ws.transport.http.servlet.WSServletContextListener")
@WebService(endpointInterface = "com.uniyaz.etut.service.soap.EtutService", name = "EtutService")
public class EtutServiceImpl implements EtutService{
    @Override
    public EtutDto saveEtut(EtutDto etutDto) {

        EtutConverter etutConverter=new EtutConverter();
        Etut etut=etutConverter.convertToEtut(etutDto);

        EtutDao etutDao = new EtutDao();
        etut=etutDao.saveEtut(etut);

        EtutDto etutDtoSave =etutConverter.convertToEtutDto(etut);

        return etutDtoSave;


    }
}
*/