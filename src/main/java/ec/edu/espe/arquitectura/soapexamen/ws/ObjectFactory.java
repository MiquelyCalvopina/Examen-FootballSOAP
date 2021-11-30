//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.29 a las 08:32:27 PM COT 
//


package ec.edu.espe.arquitectura.soapexamen.ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.espe.arquitectura.soapexamen.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.espe.arquitectura.soapexamen.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAvailableMatchesRequest }
     * 
     */
    public GetAvailableMatchesRequest createGetAvailableMatchesRequest() {
        return new GetAvailableMatchesRequest();
    }

    /**
     * Create an instance of {@link GetAvailableMatchesResponse }
     * 
     */
    public GetAvailableMatchesResponse createGetAvailableMatchesResponse() {
        return new GetAvailableMatchesResponse();
    }

    /**
     * Create an instance of {@link Match }
     * 
     */
    public Match createMatch() {
        return new Match();
    }

    /**
     * Create an instance of {@link GetLocationsMatchRequest }
     * 
     */
    public GetLocationsMatchRequest createGetLocationsMatchRequest() {
        return new GetLocationsMatchRequest();
    }

    /**
     * Create an instance of {@link GetLocationsMatchResponse }
     * 
     */
    public GetLocationsMatchResponse createGetLocationsMatchResponse() {
        return new GetLocationsMatchResponse();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link BuyLocationMatchRequest }
     * 
     */
    public BuyLocationMatchRequest createBuyLocationMatchRequest() {
        return new BuyLocationMatchRequest();
    }

    /**
     * Create an instance of {@link BuyLocationMatchResponse }
     * 
     */
    public BuyLocationMatchResponse createBuyLocationMatchResponse() {
        return new BuyLocationMatchResponse();
    }

}
