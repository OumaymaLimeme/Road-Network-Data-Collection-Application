//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.12.08 at 09:17:14 PM CET 
//


package io.spring.guides.roadclosures;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "roads"
})
@XmlRootElement(name = "GetAllRoadsResponse")
public class GetAllRoadsResponse {

    @XmlElement(name = "Roads", required = true)
    protected Roads roads;

    public Roads getRoads() {
        return roads;
    }


    public void setRoads(Roads value) {
        this.roads = value;
    }

}
