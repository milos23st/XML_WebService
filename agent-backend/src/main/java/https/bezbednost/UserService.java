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
 * 2018-09-02T18:44:19.783+02:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "UserService",
                  wsdlLocation = "http://localhost:8081/Service/userServiceSoap?wsdl",
                  targetNamespace = "https://bezbednost/")
public class UserService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://bezbednost/", "UserService");
    public final static QName UserServiceSoapImplPort = new QName("https://bezbednost/", "UserServiceSoapImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8081/Service/userServiceSoap?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UserService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8081/Service/userServiceSoap?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UserService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UserService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public UserService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UserService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UserService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns UserServiceSoap
     */
    @WebEndpoint(name = "UserServiceSoapImplPort")
    public UserServiceSoap getUserServiceSoapImplPort() {
        return super.getPort(UserServiceSoapImplPort, UserServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserServiceSoap
     */
    @WebEndpoint(name = "UserServiceSoapImplPort")
    public UserServiceSoap getUserServiceSoapImplPort(WebServiceFeature... features) {
        return super.getPort(UserServiceSoapImplPort, UserServiceSoap.class, features);
    }

}
