//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.05.20 at 09:43:44 AM ALMT 
//


package com.wstutorial.ws.tutorialservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tutorialType" type="{http://www.wstutorial.com/ws/TutorialService}TutorialType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tutorialType"
})
@XmlRootElement(name = "updateTutorialRequest")
public class UpdateTutorialRequest {

    @XmlElement(required = true)
    protected TutorialType tutorialType;

    /**
     * Gets the value of the tutorialType property.
     * 
     * @return
     *     possible object is
     *     {@link TutorialType }
     *     
     */
    public TutorialType getTutorialType() {
        return tutorialType;
    }

    /**
     * Sets the value of the tutorialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TutorialType }
     *     
     */
    public void setTutorialType(TutorialType value) {
        this.tutorialType = value;
    }

}
