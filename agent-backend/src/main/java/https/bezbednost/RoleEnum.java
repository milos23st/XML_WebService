
package https.bezbednost;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="roleEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="USER"/&gt;
 *     &lt;enumeration value="AGENT"/&gt;
 *     &lt;enumeration value="ADMIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "roleEnum")
@XmlEnum
public enum RoleEnum {

    USER,
    AGENT,
    ADMIN;

    public String value() {
        return name();
    }

    public static RoleEnum fromValue(String v) {
        return valueOf(v);
    }

}
