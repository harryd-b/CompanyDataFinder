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
 * <p>Java class for KadasterV2HypothecairBericht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterV2HypothecairBericht">
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
 *         &lt;element name="betreft" type="{http://www.webservices.nl/soap/}KadasterV2OnroerendeZaak"/>
 *         &lt;element name="hypotheken" type="{http://www.webservices.nl/soap/}KadasterV2HypotheekArray" minOccurs="0"/>
 *         &lt;element name="beslagleggingen" type="{http://www.webservices.nl/soap/}KadasterV2BeslagleggingArray" minOccurs="0"/>
 *         &lt;element name="zakelijk_rechten" type="{http://www.webservices.nl/soap/}KadasterV2ZakelijkRechtArray" minOccurs="0"/>
 *         &lt;element name="aantekeningen" type="{http://www.webservices.nl/soap/}KadasterV2AantekeningArray" minOccurs="0"/>
 *         &lt;element name="stukken" type="{http://www.webservices.nl/soap/}KadasterV2Stukken"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterV2HypothecairBericht", propOrder = {

})
public class KadasterV2HypothecairBericht {

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
    protected KadasterV2OnroerendeZaak betreft;
    protected KadasterV2HypotheekArray hypotheken;
    protected KadasterV2BeslagleggingArray beslagleggingen;
    @XmlElement(name = "zakelijk_rechten")
    protected KadasterV2ZakelijkRechtArray zakelijkRechten;
    protected KadasterV2AantekeningArray aantekeningen;
    @XmlElement(required = true)
    protected KadasterV2Stukken stukken;

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
     *     {@link KadasterV2OnroerendeZaak }
     *     
     */
    public KadasterV2OnroerendeZaak getBetreft() {
        return betreft;
    }

    /**
     * Sets the value of the betreft property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2OnroerendeZaak }
     *     
     */
    public void setBetreft(KadasterV2OnroerendeZaak value) {
        this.betreft = value;
    }

    /**
     * Gets the value of the hypotheken property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2HypotheekArray }
     *     
     */
    public KadasterV2HypotheekArray getHypotheken() {
        return hypotheken;
    }

    /**
     * Sets the value of the hypotheken property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2HypotheekArray }
     *     
     */
    public void setHypotheken(KadasterV2HypotheekArray value) {
        this.hypotheken = value;
    }

    /**
     * Gets the value of the beslagleggingen property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2BeslagleggingArray }
     *     
     */
    public KadasterV2BeslagleggingArray getBeslagleggingen() {
        return beslagleggingen;
    }

    /**
     * Sets the value of the beslagleggingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2BeslagleggingArray }
     *     
     */
    public void setBeslagleggingen(KadasterV2BeslagleggingArray value) {
        this.beslagleggingen = value;
    }

    /**
     * Gets the value of the zakelijkRechten property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2ZakelijkRechtArray }
     *     
     */
    public KadasterV2ZakelijkRechtArray getZakelijkRechten() {
        return zakelijkRechten;
    }

    /**
     * Sets the value of the zakelijkRechten property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2ZakelijkRechtArray }
     *     
     */
    public void setZakelijkRechten(KadasterV2ZakelijkRechtArray value) {
        this.zakelijkRechten = value;
    }

    /**
     * Gets the value of the aantekeningen property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2AantekeningArray }
     *     
     */
    public KadasterV2AantekeningArray getAantekeningen() {
        return aantekeningen;
    }

    /**
     * Sets the value of the aantekeningen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2AantekeningArray }
     *     
     */
    public void setAantekeningen(KadasterV2AantekeningArray value) {
        this.aantekeningen = value;
    }

    /**
     * Gets the value of the stukken property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterV2Stukken }
     *     
     */
    public KadasterV2Stukken getStukken() {
        return stukken;
    }

    /**
     * Sets the value of the stukken property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterV2Stukken }
     *     
     */
    public void setStukken(KadasterV2Stukken value) {
        this.stukken = value;
    }

}