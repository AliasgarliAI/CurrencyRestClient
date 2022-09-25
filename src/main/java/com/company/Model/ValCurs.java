package com.company.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.List;


@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "ValCurs")
public class ValCurs {

    @JacksonXmlProperty(isAttribute = true,localName = "Date")
    private String date;

    @JacksonXmlProperty(isAttribute = true,localName = "Name")
    private String name;

    @JacksonXmlProperty(isAttribute = true,localName = "Description")
    private String description;

    @JacksonXmlElementWrapper(localName = "Valtype",useWrapping = false)
    @JacksonXmlProperty(localName = "ValType")
    private List<ValType> valType;



}
