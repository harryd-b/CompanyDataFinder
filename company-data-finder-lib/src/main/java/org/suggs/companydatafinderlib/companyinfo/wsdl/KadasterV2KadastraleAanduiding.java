//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.02 at 09:16:36 AM GMT 
//


package org.suggs.companydatafinderlib.companyinfo.wsdl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KadasterV2KadastraleAanduiding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterV2KadastraleAanduiding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="kadastrale_gemeente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sectie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perceelnummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="appartementsrecht_volgnummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterV2KadastraleAanduiding", propOrder = {

})
public class KadasterV2KadastraleAanduiding {

    @XmlElement(name = "kadastrale_gemeente")
    protected String kadastraleGemeente;
    protected String sectie;
    protected BigInteger perceelnummer;
    @XmlElement(name = "appartementsrecht_volgnummer")
    protected BigInteger appartementsrechtVolgnummer;

    /**
     * Gets the value of the kadastraleGemeente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKadastraleGemeente() {
        return kadastraleGemeente;
    }

    /**
     * Sets the value of the kadastraleGemeente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKadastraleGemeente(String value) {
        this.kadastraleGemeente = value;
    }

    /**
     * Gets the value of the sectie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectie() {
        return sectie;
    }

    /**
     * Sets the value of the sectie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectie(String value) {
        this.sectie = value;
    }

    /**
     * Gets the value of the perceelnummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPerceelnummer() {
        return perceelnummer;
    }

    /**
     * Sets the value of the perceelnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPerceelnummer(BigInteger value) {
        this.perceelnummer = value;
    }

    /**
     * Gets the value of the appartementsrechtVolgnummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAppartementsrechtVolgnummer() {
        return appartementsrechtVolgnummer;
    }

    /**
     * Sets the value of the appartementsrechtVolgnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAppartementsrechtVolgnummer(BigInteger value) {
        this.appartementsrechtVolgnummer = value;
    }

}