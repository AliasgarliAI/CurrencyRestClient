package com.company.controller;

import com.company.Model.ValCurs;
import com.company.Model.ValType;
import com.company.Model.Valute;
import com.company.Model.ValuteDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("clientusers")
public class ValyutaController {

    @GetMapping(produces = "application/json")
    public ResponseEntity<Object> callUsers() throws IOException, JAXBException {
        ObjectMapper xmlMapper = new XmlMapper();
        URL url = new URL("https://www.cbar.az/currencies/23.09.2022.xml");
        final ValCurs valCurs = xmlMapper.readValue(url, ValCurs.class);
        return ResponseEntity.ok(valCurs);
    }

}
