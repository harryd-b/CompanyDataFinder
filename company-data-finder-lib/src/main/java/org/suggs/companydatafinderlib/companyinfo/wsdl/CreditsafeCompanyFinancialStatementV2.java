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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditsafeCompanyFinancialStatementV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeCompanyFinancialStatementV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="balance_sheet" type="{http://www.webservices.nl/soap/}CreditsafeCompanyBalanceSheetV2" minOccurs="0"/>
 *         &lt;element name="consolidated_accounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number_of_weeks" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="other_financials" type="{http://www.webservices.nl/soap/}CreditsafeCompanyOtherFinancialsV2" minOccurs="0"/>
 *         &lt;element name="profit_and_loss" type="{http://www.webservices.nl/soap/}CreditsafeCompanyProfitAndLossV2" minOccurs="0"/>
 *         &lt;element name="ratios" type="{http://www.webservices.nl/soap/}CreditsafeCompanyRatiosV2" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year_end_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeCompanyFinancialStatementV2", propOrder = {

})
public class CreditsafeCompanyFinancialStatementV2 {

    @XmlElement(name = "balance_sheet")
    protected CreditsafeCompanyBalanceSheetV2 balanceSheet;
    @XmlElement(name = "consolidated_accounts")
    protected Boolean consolidatedAccounts;
    protected String currency;
    @XmlElement(name = "number_of_weeks")
    protected BigInteger numberOfWeeks;
    @XmlElement(name = "other_financials")
    protected CreditsafeCompanyOtherFinancialsV2 otherFinancials;
    @XmlElement(name = "profit_and_loss")
    protected CreditsafeCompanyProfitAndLossV2 profitAndLoss;
    protected CreditsafeCompanyRatiosV2 ratios;
    protected String type;
    @XmlElement(name = "year_end_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar yearEndDate;

    /**
     * Gets the value of the balanceSheet property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyBalanceSheetV2 }
     *     
     */
    public CreditsafeCompanyBalanceSheetV2 getBalanceSheet() {
        return balanceSheet;
    }

    /**
     * Sets the value of the balanceSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyBalanceSheetV2 }
     *     
     */
    public void setBalanceSheet(CreditsafeCompanyBalanceSheetV2 value) {
        this.balanceSheet = value;
    }

    /**
     * Gets the value of the consolidatedAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsolidatedAccounts() {
        return consolidatedAccounts;
    }

    /**
     * Sets the value of the consolidatedAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidatedAccounts(Boolean value) {
        this.consolidatedAccounts = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the numberOfWeeks property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfWeeks() {
        return numberOfWeeks;
    }

    /**
     * Sets the value of the numberOfWeeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfWeeks(BigInteger value) {
        this.numberOfWeeks = value;
    }

    /**
     * Gets the value of the otherFinancials property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyOtherFinancialsV2 }
     *     
     */
    public CreditsafeCompanyOtherFinancialsV2 getOtherFinancials() {
        return otherFinancials;
    }

    /**
     * Sets the value of the otherFinancials property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyOtherFinancialsV2 }
     *     
     */
    public void setOtherFinancials(CreditsafeCompanyOtherFinancialsV2 value) {
        this.otherFinancials = value;
    }

    /**
     * Gets the value of the profitAndLoss property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyProfitAndLossV2 }
     *     
     */
    public CreditsafeCompanyProfitAndLossV2 getProfitAndLoss() {
        return profitAndLoss;
    }

    /**
     * Sets the value of the profitAndLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyProfitAndLossV2 }
     *     
     */
    public void setProfitAndLoss(CreditsafeCompanyProfitAndLossV2 value) {
        this.profitAndLoss = value;
    }

    /**
     * Gets the value of the ratios property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyRatiosV2 }
     *     
     */
    public CreditsafeCompanyRatiosV2 getRatios() {
        return ratios;
    }

    /**
     * Sets the value of the ratios property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyRatiosV2 }
     *     
     */
    public void setRatios(CreditsafeCompanyRatiosV2 value) {
        this.ratios = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the yearEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearEndDate() {
        return yearEndDate;
    }

    /**
     * Sets the value of the yearEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearEndDate(XMLGregorianCalendar value) {
        this.yearEndDate = value;
    }

}