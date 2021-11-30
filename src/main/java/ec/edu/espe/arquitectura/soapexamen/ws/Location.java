//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.29 a las 08:32:27 PM COT 
//


package ec.edu.espe.arquitectura.soapexamen.ws;

import lombok.Data;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para location complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="matchCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "location", propOrder = {
    "locationCode",
    "matchCode",
    "available",
    "price"
})
@Entity
@Data
@Table(name = "localidad_partido")
public class Location {

    @Id
    @Column(name = "codigo_localidad", nullable = false, length = 20)
    @XmlElement(required = true)
    protected String locationCode;

    @Column(name = "codigo", nullable = false, length = 30)
    @XmlElement(required = true)
    protected String matchCode;

    @Column(name = "disponibilidad", nullable = false)
    @XmlElement(required = true)
    protected BigDecimal available;

    @Column(name = "precio", nullable = false)
    @XmlElement(required = true)
    protected BigDecimal price;

    /**
     * Obtiene el valor de la propiedad locationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Define el valor de la propiedad locationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad matchCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchCode() {
        return matchCode;
    }

    /**
     * Define el valor de la propiedad matchCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchCode(String value) {
        this.matchCode = value;
    }

    /**
     * Obtiene el valor de la propiedad available.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailable() {
        return available;
    }

    /**
     * Define el valor de la propiedad available.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailable(BigDecimal value) {
        this.available = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

}
