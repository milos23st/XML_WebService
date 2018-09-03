
package https.bezbednost;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.bezbednost package. 
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

    private final static QName _FindOne_QNAME = new QName("https://bezbednost/", "findOne");
    private final static QName _FindOneResponse_QNAME = new QName("https://bezbednost/", "findOneResponse");
    private final static QName _VerifyAgentLogin_QNAME = new QName("https://bezbednost/", "verifyAgentLogin");
    private final static QName _VerifyAgentLoginResponse_QNAME = new QName("https://bezbednost/", "verifyAgentLoginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.bezbednost
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindOne }
     * 
     */
    public FindOne createFindOne() {
        return new FindOne();
    }

    /**
     * Create an instance of {@link FindOneResponse }
     * 
     */
    public FindOneResponse createFindOneResponse() {
        return new FindOneResponse();
    }

    /**
     * Create an instance of {@link VerifyAgentLogin }
     * 
     */
    public VerifyAgentLogin createVerifyAgentLogin() {
        return new VerifyAgentLogin();
    }

    /**
     * Create an instance of {@link VerifyAgentLoginResponse }
     * 
     */
    public VerifyAgentLoginResponse createVerifyAgentLoginResponse() {
        return new VerifyAgentLoginResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findOne")
    public JAXBElement<FindOne> createFindOne(FindOne value) {
        return new JAXBElement<FindOne>(_FindOne_QNAME, FindOne.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findOneResponse")
    public JAXBElement<FindOneResponse> createFindOneResponse(FindOneResponse value) {
        return new JAXBElement<FindOneResponse>(_FindOneResponse_QNAME, FindOneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyAgentLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "verifyAgentLogin")
    public JAXBElement<VerifyAgentLogin> createVerifyAgentLogin(VerifyAgentLogin value) {
        return new JAXBElement<VerifyAgentLogin>(_VerifyAgentLogin_QNAME, VerifyAgentLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyAgentLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "verifyAgentLoginResponse")
    public JAXBElement<VerifyAgentLoginResponse> createVerifyAgentLoginResponse(VerifyAgentLoginResponse value) {
        return new JAXBElement<VerifyAgentLoginResponse>(_VerifyAgentLoginResponse_QNAME, VerifyAgentLoginResponse.class, null, value);
    }

}
