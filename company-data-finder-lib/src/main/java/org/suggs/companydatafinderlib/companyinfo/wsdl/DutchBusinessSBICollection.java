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
 * <p>Java class for DutchBusinessSBICollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessSBICollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="original" type="{http://www.webservices.nl/soap/}DutchBusinessSBICodeArray"/>
 *         &lt;element name="company_info" type="{http://www.webservices.nl/soap/}DutchBusinessSBICodeArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessSBICollection", propOrder = {

})
public class DutchBusinessSBICollection {

    @XmlElement(required = true)
    protected DutchBusinessSBICodeArray original;
    @XmlElement(name = "company_info")
    protected DutchBusinessSBICodeArray companyInfo;

    /**
     * Gets the value of the original property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessSBICodeArray }
     *     
     */
    public DutchBusinessSBICodeArray getOriginal() {
        return original;
    }

    /**
     * Sets the value of the original property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessSBICodeArray }
     *     
     */
    public void setOriginal(DutchBusinessSBICodeArray value) {
        this.original = value;
    }

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessSBICodeArray }
     *     
     */
    public DutchBusinessSBICodeArray getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessSBICodeArray }
     *     
     */
    public void setCompanyInfo(DutchBusinessSBICodeArray value) {
        this.companyInfo = value;
    }

}