package https.bezbednost;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-09-03T10:59:05.481+02:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "SmestajService",
                  wsdlLocation = "http://localhost:8081/Service/smestajServiceSoap?wsdl",
                  targetNamespace = "https://bezbednost/")
public class SmestajService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://bezbednost/", "SmestajService");
    public final static QName SmestajServiceSoapImplPort = new QName("https://bezbednost/", "SmestajServiceSoapImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8081/Service/smestajServiceSoap?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SmestajService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8081/Service/smestajServiceSoap?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SmestajService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SmestajService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SmestajService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SmestajService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SmestajService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SmestajService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SmestajServiceSoap
     */
    @WebEndpoint(name = "SmestajServiceSoapImplPort")
    public SmestajServiceSoap getSmestajServiceSoapImplPort() {
        return super.getPort(SmestajServiceSoapImplPort, SmestajServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SmestajServiceSoap
     */
    @WebEndpoint(name = "SmestajServiceSoapImplPort")
    public SmestajServiceSoap getSmestajServiceSoapImplPort(WebServiceFeature... features) {
        return super.getPort(SmestajServiceSoapImplPort, SmestajServiceSoap.class, features);
    }

}
