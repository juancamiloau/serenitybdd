
package net.webservicex;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ComputerUnit", targetNamespace = "http://www.webserviceX.NET/", wsdlLocation = "http://www.webservicex.net/ConvertComputer.asmx?WSDL")
public class ComputerUnit
    extends Service
{

    private final static URL COMPUTERUNIT_WSDL_LOCATION;
    private final static WebServiceException COMPUTERUNIT_EXCEPTION;
    private final static QName COMPUTERUNIT_QNAME = new QName("http://www.webserviceX.NET/", "ComputerUnit");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/ConvertComputer.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMPUTERUNIT_WSDL_LOCATION = url;
        COMPUTERUNIT_EXCEPTION = e;
    }

    public ComputerUnit() {
        super(__getWsdlLocation(), COMPUTERUNIT_QNAME);
    }

    public ComputerUnit(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMPUTERUNIT_QNAME, features);
    }

    public ComputerUnit(URL wsdlLocation) {
        super(wsdlLocation, COMPUTERUNIT_QNAME);
    }

    public ComputerUnit(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMPUTERUNIT_QNAME, features);
    }

    public ComputerUnit(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ComputerUnit(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ComputerUnitSoap
     */
    @WebEndpoint(name = "ComputerUnitSoap")
    public ComputerUnitSoap getComputerUnitSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET/", "ComputerUnitSoap"), ComputerUnitSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ComputerUnitSoap
     */
    @WebEndpoint(name = "ComputerUnitSoap")
    public ComputerUnitSoap getComputerUnitSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET/", "ComputerUnitSoap"), ComputerUnitSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMPUTERUNIT_EXCEPTION!= null) {
            throw COMPUTERUNIT_EXCEPTION;
        }
        return COMPUTERUNIT_WSDL_LOCATION;
    }

}
