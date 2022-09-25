package com.company.controller;

import com.company.Model.ValCurs;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws JAXBException, MalformedURLException {
        System.out.println(currencyGetter());
    }


    public static ValCurs currencyGetter() throws JAXBException, MalformedURLException {
        URL url = new URL("https://www.cbar.az/currencies/23.09.2022.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (ValCurs) unmarshaller.unmarshal(url);
    }
}


