
package https.bezbednost;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for smestaj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="smestaj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kapacitet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="naseljenomesto" type="{https://bezbednost/}naseljenoMesto" minOccurs="0"/&gt;
 *         &lt;element name="opis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zauzeto" type="{https://bezbednost/}zauzetost" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="komentari" type="{https://bezbednost/}komentar" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="agent" type="{https://bezbednost/}user" minOccurs="0"/&gt;
 *         &lt;element name="kategorija" type="{https://bezbednost/}kategorija" minOccurs="0"/&gt;
 *         &lt;element name="tipSmestaja" type="{https://bezbednost/}tipSmestaja" minOccurs="0"/&gt;
 *         &lt;element name="images" type="{https://bezbednost/}smestajSlika" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dodatneUsluge" type="{https://bezbednost/}dodatnaUsluga" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rating" type="{https://bezbednost/}ocena" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="terms" type="{https://bezbednost/}termin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "smestaj", propOrder = {
    "id",
    "name",
    "kapacitet",
    "naseljenomesto",
    "opis",
    "address",
    "zauzeto",
    "komentari",
    "agent",
    "kategorija",
    "tipSmestaja",
    "images",
    "dodatneUsluge",
    "rating",
    "terms"
})
public class Smestaj {

    protected Long id;
    protected String name;
    protected Integer kapacitet;
    protected NaseljenoMesto naseljenomesto;
    protected String opis;
    protected String address;
    @XmlElement(nillable = true)
    protected List<Zauzetost> zauzeto;
    @XmlElement(nillable = true)
    protected List<Komentar> komentari;
    protected User agent;
    protected Kategorija kategorija;
    protected TipSmestaja tipSmestaja;
    @XmlElement(nillable = true)
    protected List<SmestajSlika> images;
    @XmlElement(nillable = true)
    protected List<DodatnaUsluga> dodatneUsluge;
    @XmlElement(nillable = true)
    protected List<Ocena> rating;
    @XmlElement(nillable = true)
    protected List<Termin> terms;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the kapacitet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKapacitet() {
        return kapacitet;
    }

    /**
     * Sets the value of the kapacitet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKapacitet(Integer value) {
        this.kapacitet = value;
    }

    /**
     * Gets the value of the naseljenomesto property.
     * 
     * @return
     *     possible object is
     *     {@link NaseljenoMesto }
     *     
     */
    public NaseljenoMesto getNaseljenomesto() {
        return naseljenomesto;
    }

    /**
     * Sets the value of the naseljenomesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaseljenoMesto }
     *     
     */
    public void setNaseljenomesto(NaseljenoMesto value) {
        this.naseljenomesto = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpis(String value) {
        this.opis = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the zauzeto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zauzeto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZauzeto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zauzetost }
     * 
     * 
     */
    public List<Zauzetost> getZauzeto() {
        if (zauzeto == null) {
            zauzeto = new ArrayList<Zauzetost>();
        }
        return this.zauzeto;
    }

    /**
     * Gets the value of the komentari property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the komentari property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKomentari().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Komentar }
     * 
     * 
     */
    public List<Komentar> getKomentari() {
        if (komentari == null) {
            komentari = new ArrayList<Komentar>();
        }
        return this.komentari;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setAgent(User value) {
        this.agent = value;
    }

    /**
     * Gets the value of the kategorija property.
     * 
     * @return
     *     possible object is
     *     {@link Kategorija }
     *     
     */
    public Kategorija getKategorija() {
        return kategorija;
    }

    /**
     * Sets the value of the kategorija property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kategorija }
     *     
     */
    public void setKategorija(Kategorija value) {
        this.kategorija = value;
    }

    /**
     * Gets the value of the tipSmestaja property.
     * 
     * @return
     *     possible object is
     *     {@link TipSmestaja }
     *     
     */
    public TipSmestaja getTipSmestaja() {
        return tipSmestaja;
    }

    /**
     * Sets the value of the tipSmestaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipSmestaja }
     *     
     */
    public void setTipSmestaja(TipSmestaja value) {
        this.tipSmestaja = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the images property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmestajSlika }
     * 
     * 
     */
    public List<SmestajSlika> getImages() {
        if (images == null) {
            images = new ArrayList<SmestajSlika>();
        }
        return this.images;
    }

    /**
     * Gets the value of the dodatneUsluge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dodatneUsluge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDodatneUsluge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DodatnaUsluga }
     * 
     * 
     */
    public List<DodatnaUsluga> getDodatneUsluge() {
        if (dodatneUsluge == null) {
            dodatneUsluge = new ArrayList<DodatnaUsluga>();
        }
        return this.dodatneUsluge;
    }

    /**
     * Gets the value of the rating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ocena }
     * 
     * 
     */
    public List<Ocena> getRating() {
        if (rating == null) {
            rating = new ArrayList<Ocena>();
        }
        return this.rating;
    }

    /**
     * Gets the value of the terms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Termin }
     * 
     * 
     */
    public List<Termin> getTerms() {
        if (terms == null) {
            terms = new ArrayList<Termin>();
        }
        return this.terms;
    }

}
