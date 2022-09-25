package com.company.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Valute {

    @JacksonXmlProperty(isAttribute = true,localName = "Code")
    private String code;

    @JacksonXmlProperty(localName = "Nominal")
    private String nominal;

    @JacksonXmlProperty(localName = "Name")
    private String name;

    @JacksonXmlProperty(localName = "Value")
    private double value;



}
