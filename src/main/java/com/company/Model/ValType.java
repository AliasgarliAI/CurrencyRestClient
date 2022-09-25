package com.company.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ValType {

    @JacksonXmlProperty(isAttribute = true,localName = "Type")
    private String type;

    @JacksonXmlElementWrapper(localName = "Valute",useWrapping = false)
    @JacksonXmlProperty(localName = "Valute")
    private List<Valute> valute;


}
