//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.02 at 09:16:36 AM GMT 
//


package org.suggs.companydatafinderlib.companyinfo.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geoLocationRDToAddressV2ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoLocationRDToAddressV2ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="address" type="{http://www.webservices.nl/soap/}GeoLocationAddressV2"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoLocationRDToAddressV2ResponseType", propOrder = {

})
public class GeoLocationRDToAddressV2ResponseType {

    @XmlElement(required = true)
    protected GeoLocationAddressV2 address;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationAddressV2 }
     *     
     */
    public GeoLocationAddressV2 getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationAddressV2 }
     *     
     */
    public void setAddress(GeoLocationAddressV2 value) {
        this.address = value;
    }

}