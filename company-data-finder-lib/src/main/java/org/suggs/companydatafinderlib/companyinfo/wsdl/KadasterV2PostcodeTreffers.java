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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KadasterV2PostcodeTreffers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterV2PostcodeTreffers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="productienummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tijdstip_samenstelling_bericht" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="actualiteit_tijdstip_hypothecair" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="actualiteit_tijdstip_kadastraal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="signalering_tijdstip_beslagen" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="signalering_tijdstip_hypothecair" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="signalering_tijdstip_kadastraal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="betreft" type="{http://www.webservices.nl/soap/}KadasterV2GevraagdGebied"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterV2PostcodeTreffers", propOrder = {

})
public class KadasterV2PostcodeTreffers {

    @XmlElement(required = true)
    protected String productienummer;
    @XmlElement(name = "tijdstip_samenstelling_bericht", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tijdstipSamenstellingBericht;
    @XmlElement(name = "actualiteit_tijdstip_hypothecair")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualiteitTijdstipHypothecair;
    @XmlElement(name = "actualiteit_tijdstip_kadastraal")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualiteitTijdstipKadastraal;
    @XmlElement(name = "signalering_tijdstip_beslagen")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signaleringTijdstipBeslagen;
    @XmlElement(name = "signalering_tijdstip_hypothecair")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signaleringTijdstipHypothecair;
    @XmlElement(name = "signalering_tijdstip_kadastraal")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signaleringTijdstipKadastraal;
    @XmlElement(required = true)
    protected KadasterV2GevraagdGebied betreft;

    /**
     * Gets the value of the productienummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductienummer() {
        return productienummer;
    }

    /**
     * Sets the value of the productienummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductienummer(String value) {
        this.productienummer = value;
    }

    /**
     * Gets the value of the tijdstipSamenstellingBericht property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTijdstipSamenstellingBericht() {
        return tijdstipSamenstellingBericht;
    }

    /**
     * Sets the value of the tijdstipSamenstellingBericht property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTijdstipSamenstellingBericht(XMLGregorianCalendar value) {
        this.tijdstipSamenstellingBericht = value;
    }

    /**
     * Gets the value of the actualiteitTijdstipHypothecair property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualiteitTijdstipHypothecair() {
        return actualiteitTijdstipHypothecair;
    }

    /**
     * Sets the value of the actualiteitTijdstipHypothecair property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualiteitTijdstipHypothecair(XMLGregorianCalendar value) {
        this.actualiteitTijdstipHypothecair = value;
    }

    /**
     * Gets the value of the actualiteitTijdstipKadastraal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualiteitTijdstipKadastraal() {
        return actualiteitTijdstipKadastraal;
    }

    /**
     * Sets the value of the actualiteitTijdstipKadastraal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualiteitTijdstipKadastraal(XMLGregorianCalendar value) {
        this.actualiteitTijdstipKadastraal = value;
    }

    /**
     * Gets the value of the signaleringTijdstipBeslagen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignaleringTijdstipBeslagen() {
        return signaleringTijdstipBeslagen;
    }

    /**
     * Sets the value of the signaleringTijdstipBeslagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignaleringTijdstipBeslagen(XMLGregorianCalendar value) {
        this.signaleringTijdstipBeslagen = value;
    }

    /**
     * Gets the value of the signaleringTijdstipHypothecair property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignaleringTijdstipHypothecair() {
        return signaleringTijdstipHypothecair;
    }

    /**
     * Sets the value of the signaleringTijdstipHypothecair property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignaleringTijdstipHypothecair(XMLGregorianCalendar value) {
        this.signaleringTijdstipHypothecair = value;
    }

    /**
     * Gets the value of the signaleringTijdstipKadastraal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignaleringTijdstipKadastraal() {
        return signaleringTijdstipKadastraal;
    }

    /**
     * Sets the value of the signaleringTijdstipKadastraal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignaleringTijdstipKadastraal(XMLGregorianCalendar value) {
        this.signaleringTijdstipKadastraal = value;
    }

    /**
     * Gets the value of the betreft property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2GevraagdGebied }
     *     
     */
    public KadasterV2GevraagdGebied getBetreft() {
        return betreft;
    }

    /**
     * Sets the value of the betreft property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2GevraagdGebied }
     *     
     */
    public void setBetreft(KadasterV2GevraagdGebied value) {
        this.betreft = value;
    }

}