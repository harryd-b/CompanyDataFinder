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
 * <p>Java class for KadasterKadastraleKaartResultaatV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterKadastraleKaartResultaatV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="overzicht" type="{http://www.webservices.nl/soap/}DocumentOverzicht" minOccurs="0"/>
 *         &lt;element name="kadastrale_kaart" type="{http://www.webservices.nl/soap/}KadasterKadastraleKaart" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterKadastraleKaartResultaatV2", propOrder = {

})
public class KadasterKadastraleKaartResultaatV2 {

    protected DocumentOverzicht overzicht;
    @XmlElement(name = "kadastrale_kaart")
    protected KadasterKadastraleKaart kadastraleKaart;

    /**
     * Gets the value of the overzicht property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentOverzicht }
     *     
     */
    public DocumentOverzicht getOverzicht() {
        return overzicht;
    }

    /**
     * Sets the value of the overzicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentOverzicht }
     *     
     */
    public void setOverzicht(DocumentOverzicht value) {
        this.overzicht = value;
    }

    /**
     * Gets the value of the kadastraleKaart property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterKadastraleKaart }
     *     
     */
    public KadasterKadastraleKaart getKadastraleKaart() {
        return kadastraleKaart;
    }

    /**
     * Sets the value of the kadastraleKaart property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterKadastraleKaart }
     *     
     */
    public void setKadastraleKaart(KadasterKadastraleKaart value) {
        this.kadastraleKaart = value;
    }

}