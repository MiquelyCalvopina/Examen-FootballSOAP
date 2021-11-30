//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.29 a las 08:32:27 PM COT 
//


package ec.edu.espe.arquitectura.soapexamen.ws;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para match complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="match"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localTeam" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="visitantTeam" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "match", propOrder = {
    "code",
    "localTeam",
    "visitantTeam",
    "dateTime",
    "place"
})
@Entity
@Data
@Table(name = "partido_futbol")
public class Match {

    @Id
    @Column(name = "codigo", nullable = false, length = 30)
    @XmlElement(required = true)
    protected String code;

    @Column(name = "equipo_local", nullable = false, length = 50)
    @XmlElement(required = true)
    protected String localTeam;

    @Column(name = "equipo_visita", nullable = false, length = 50)
    @XmlElement(required = true)
    protected String visitantTeam;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha", nullable = false)
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;

    @Column(name = "lugar", nullable = false, length = 100)
    @XmlElement(required = true)
    protected String place;

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad localTeam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTeam() {
        return localTeam;
    }

    /**
     * Define el valor de la propiedad localTeam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTeam(String value) {
        this.localTeam = value;
    }

    /**
     * Obtiene el valor de la propiedad visitantTeam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitantTeam() {
        return visitantTeam;
    }

    /**
     * Define el valor de la propiedad visitantTeam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitantTeam(String value) {
        this.visitantTeam = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Define el valor de la propiedad dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad place.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Define el valor de la propiedad place.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

}
