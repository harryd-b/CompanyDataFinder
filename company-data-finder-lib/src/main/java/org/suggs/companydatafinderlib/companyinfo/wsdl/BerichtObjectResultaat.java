//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.02 at 09:16:36 AM GMT 
//


package org.suggs.companydatafinderlib.companyinfo.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BerichtObjectResultaat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BerichtObjectResultaat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="overzicht" type="{http://www.webservices.nl/soap/}Overzicht" minOccurs="0"/>
 *         &lt;element name="eigendomsbericht" type="{http://www.webservices.nl/soap/}BerichtObject" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BerichtObjectResultaat", propOrder = {

})
public class BerichtObjectResultaat {

    protected Overzicht overzicht;
    protected BerichtObject eigendomsbericht;

    /**
     * Gets the value of the overzicht property.
     * 
     * @return
     *     possible object is
     *     {@link Overzicht }
     *     
     */
    public Overzicht getOverzicht() {
        return overzicht;
    }

    /**
     * Sets the value of the overzicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Overzicht }
     *     
     */
    public void setOverzicht(Overzicht value) {
        this.overzicht = value;
    }

    /**
     * Gets the value of the eigendomsbericht property.
     * 
     * @return
     *     possible object is
     *     {@link BerichtObject }
     *     
     */
    public BerichtObject getEigendomsbericht() {
        return eigendomsbericht;
    }

    /**
     * Sets the value of the eigendomsbericht property.
     * 
     * @param value
     *     allowed object is
     *     {@link BerichtObject }
     *     
     */
    public void setEigendomsbericht(BerichtObject value) {
        this.eigendomsbericht = value;
    }

}