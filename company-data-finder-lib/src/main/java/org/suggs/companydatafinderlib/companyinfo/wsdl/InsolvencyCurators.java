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
 * <p>Java class for InsolvencyCurators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsolvencyCurators">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="curator" type="{http://www.webservices.nl/soap/}InsolvencyLegalPerformingPersonArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsolvencyCurators", propOrder = {

})
public class InsolvencyCurators {

    @XmlElement(required = true)
    protected InsolvencyLegalPerformingPersonArray curator;

    /**
     * Gets the value of the curator property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyLegalPerformingPersonArray }
     *     
     */
    public InsolvencyLegalPerformingPersonArray getCurator() {
        return curator;
    }

    /**
     * Sets the value of the curator property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyLegalPerformingPersonArray }
     *     
     */
    public void setCurator(InsolvencyLegalPerformingPersonArray value) {
        this.curator = value;
    }

}