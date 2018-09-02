
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

    private final static QName _FindAllAccomodations_QNAME = new QName("https://bezbednost/", "findAllAccomodations");
    private final static QName _FindAllAccomodationsResponse_QNAME = new QName("https://bezbednost/", "findAllAccomodationsResponse");
    private final static QName _FindAllCategories_QNAME = new QName("https://bezbednost/", "findAllCategories");
    private final static QName _FindAllCategoriesResponse_QNAME = new QName("https://bezbednost/", "findAllCategoriesResponse");
    private final static QName _FindAllNaseljenoMesto_QNAME = new QName("https://bezbednost/", "findAllNaseljenoMesto");
    private final static QName _FindAllNaseljenoMestoResponse_QNAME = new QName("https://bezbednost/", "findAllNaseljenoMestoResponse");
    private final static QName _FindAllRezervacije_QNAME = new QName("https://bezbednost/", "findAllRezervacije");
    private final static QName _FindAllRezervacijeResponse_QNAME = new QName("https://bezbednost/", "findAllRezervacijeResponse");
    private final static QName _FindAllServices_QNAME = new QName("https://bezbednost/", "findAllServices");
    private final static QName _FindAllServicesResponse_QNAME = new QName("https://bezbednost/", "findAllServicesResponse");
    private final static QName _FindAllTypes_QNAME = new QName("https://bezbednost/", "findAllTypes");
    private final static QName _FindAllTypesResponse_QNAME = new QName("https://bezbednost/", "findAllTypesResponse");
    private final static QName _FindDodatnaUslugaById_QNAME = new QName("https://bezbednost/", "findDodatnaUslugaById");
    private final static QName _FindDodatnaUslugaByIdResponse_QNAME = new QName("https://bezbednost/", "findDodatnaUslugaByIdResponse");
    private final static QName _FindKategorijaById_QNAME = new QName("https://bezbednost/", "findKategorijaById");
    private final static QName _FindKategorijaByIdResponse_QNAME = new QName("https://bezbednost/", "findKategorijaByIdResponse");
    private final static QName _FindKomentarById_QNAME = new QName("https://bezbednost/", "findKomentarById");
    private final static QName _FindKomentarByIdResponse_QNAME = new QName("https://bezbednost/", "findKomentarByIdResponse");
    private final static QName _FindNaseljenoMestoById_QNAME = new QName("https://bezbednost/", "findNaseljenoMestoById");
    private final static QName _FindNaseljenoMestoByIdResponse_QNAME = new QName("https://bezbednost/", "findNaseljenoMestoByIdResponse");
    private final static QName _FindSlikaById_QNAME = new QName("https://bezbednost/", "findSlikaById");
    private final static QName _FindSlikaByIdResponse_QNAME = new QName("https://bezbednost/", "findSlikaByIdResponse");
    private final static QName _FindSmestajById_QNAME = new QName("https://bezbednost/", "findSmestajById");
    private final static QName _FindSmestajByIdResponse_QNAME = new QName("https://bezbednost/", "findSmestajByIdResponse");
    private final static QName _FindTerminById_QNAME = new QName("https://bezbednost/", "findTerminById");
    private final static QName _FindTerminByIdResponse_QNAME = new QName("https://bezbednost/", "findTerminByIdResponse");
    private final static QName _FindTipById_QNAME = new QName("https://bezbednost/", "findTipById");
    private final static QName _FindTipByIdResponse_QNAME = new QName("https://bezbednost/", "findTipByIdResponse");
    private final static QName _FindZauzetostById_QNAME = new QName("https://bezbednost/", "findZauzetostById");
    private final static QName _FindZauzetostByIdResponse_QNAME = new QName("https://bezbednost/", "findZauzetostByIdResponse");
    private final static QName _GetSmestajeAgenta_QNAME = new QName("https://bezbednost/", "getSmestajeAgenta");
    private final static QName _GetSmestajeAgentaResponse_QNAME = new QName("https://bezbednost/", "getSmestajeAgentaResponse");
    private final static QName _Save_QNAME = new QName("https://bezbednost/", "save");
    private final static QName _SaveResponse_QNAME = new QName("https://bezbednost/", "saveResponse");
    private final static QName _SaveSmestajSlika_QNAME = new QName("https://bezbednost/", "saveSmestajSlika");
    private final static QName _SaveSmestajSlikaResponse_QNAME = new QName("https://bezbednost/", "saveSmestajSlikaResponse");
    private final static QName _SaveTermin_QNAME = new QName("https://bezbednost/", "saveTermin");
    private final static QName _SaveTerminResponse_QNAME = new QName("https://bezbednost/", "saveTerminResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.bezbednost
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllAccomodations }
     * 
     */
    public FindAllAccomodations createFindAllAccomodations() {
        return new FindAllAccomodations();
    }

    /**
     * Create an instance of {@link FindAllAccomodationsResponse }
     * 
     */
    public FindAllAccomodationsResponse createFindAllAccomodationsResponse() {
        return new FindAllAccomodationsResponse();
    }

    /**
     * Create an instance of {@link FindAllCategories }
     * 
     */
    public FindAllCategories createFindAllCategories() {
        return new FindAllCategories();
    }

    /**
     * Create an instance of {@link FindAllCategoriesResponse }
     * 
     */
    public FindAllCategoriesResponse createFindAllCategoriesResponse() {
        return new FindAllCategoriesResponse();
    }

    /**
     * Create an instance of {@link FindAllNaseljenoMesto }
     * 
     */
    public FindAllNaseljenoMesto createFindAllNaseljenoMesto() {
        return new FindAllNaseljenoMesto();
    }

    /**
     * Create an instance of {@link FindAllNaseljenoMestoResponse }
     * 
     */
    public FindAllNaseljenoMestoResponse createFindAllNaseljenoMestoResponse() {
        return new FindAllNaseljenoMestoResponse();
    }

    /**
     * Create an instance of {@link FindAllRezervacije }
     * 
     */
    public FindAllRezervacije createFindAllRezervacije() {
        return new FindAllRezervacije();
    }

    /**
     * Create an instance of {@link FindAllRezervacijeResponse }
     * 
     */
    public FindAllRezervacijeResponse createFindAllRezervacijeResponse() {
        return new FindAllRezervacijeResponse();
    }

    /**
     * Create an instance of {@link FindAllServices }
     * 
     */
    public FindAllServices createFindAllServices() {
        return new FindAllServices();
    }

    /**
     * Create an instance of {@link FindAllServicesResponse }
     * 
     */
    public FindAllServicesResponse createFindAllServicesResponse() {
        return new FindAllServicesResponse();
    }

    /**
     * Create an instance of {@link FindAllTypes }
     * 
     */
    public FindAllTypes createFindAllTypes() {
        return new FindAllTypes();
    }

    /**
     * Create an instance of {@link FindAllTypesResponse }
     * 
     */
    public FindAllTypesResponse createFindAllTypesResponse() {
        return new FindAllTypesResponse();
    }

    /**
     * Create an instance of {@link FindDodatnaUslugaById }
     * 
     */
    public FindDodatnaUslugaById createFindDodatnaUslugaById() {
        return new FindDodatnaUslugaById();
    }

    /**
     * Create an instance of {@link FindDodatnaUslugaByIdResponse }
     * 
     */
    public FindDodatnaUslugaByIdResponse createFindDodatnaUslugaByIdResponse() {
        return new FindDodatnaUslugaByIdResponse();
    }

    /**
     * Create an instance of {@link FindKategorijaById }
     * 
     */
    public FindKategorijaById createFindKategorijaById() {
        return new FindKategorijaById();
    }

    /**
     * Create an instance of {@link FindKategorijaByIdResponse }
     * 
     */
    public FindKategorijaByIdResponse createFindKategorijaByIdResponse() {
        return new FindKategorijaByIdResponse();
    }

    /**
     * Create an instance of {@link FindKomentarById }
     * 
     */
    public FindKomentarById createFindKomentarById() {
        return new FindKomentarById();
    }

    /**
     * Create an instance of {@link FindKomentarByIdResponse }
     * 
     */
    public FindKomentarByIdResponse createFindKomentarByIdResponse() {
        return new FindKomentarByIdResponse();
    }

    /**
     * Create an instance of {@link FindNaseljenoMestoById }
     * 
     */
    public FindNaseljenoMestoById createFindNaseljenoMestoById() {
        return new FindNaseljenoMestoById();
    }

    /**
     * Create an instance of {@link FindNaseljenoMestoByIdResponse }
     * 
     */
    public FindNaseljenoMestoByIdResponse createFindNaseljenoMestoByIdResponse() {
        return new FindNaseljenoMestoByIdResponse();
    }

    /**
     * Create an instance of {@link FindSlikaById }
     * 
     */
    public FindSlikaById createFindSlikaById() {
        return new FindSlikaById();
    }

    /**
     * Create an instance of {@link FindSlikaByIdResponse }
     * 
     */
    public FindSlikaByIdResponse createFindSlikaByIdResponse() {
        return new FindSlikaByIdResponse();
    }

    /**
     * Create an instance of {@link FindSmestajById }
     * 
     */
    public FindSmestajById createFindSmestajById() {
        return new FindSmestajById();
    }

    /**
     * Create an instance of {@link FindSmestajByIdResponse }
     * 
     */
    public FindSmestajByIdResponse createFindSmestajByIdResponse() {
        return new FindSmestajByIdResponse();
    }

    /**
     * Create an instance of {@link FindTerminById }
     * 
     */
    public FindTerminById createFindTerminById() {
        return new FindTerminById();
    }

    /**
     * Create an instance of {@link FindTerminByIdResponse }
     * 
     */
    public FindTerminByIdResponse createFindTerminByIdResponse() {
        return new FindTerminByIdResponse();
    }

    /**
     * Create an instance of {@link FindTipById }
     * 
     */
    public FindTipById createFindTipById() {
        return new FindTipById();
    }

    /**
     * Create an instance of {@link FindTipByIdResponse }
     * 
     */
    public FindTipByIdResponse createFindTipByIdResponse() {
        return new FindTipByIdResponse();
    }

    /**
     * Create an instance of {@link FindZauzetostById }
     * 
     */
    public FindZauzetostById createFindZauzetostById() {
        return new FindZauzetostById();
    }

    /**
     * Create an instance of {@link FindZauzetostByIdResponse }
     * 
     */
    public FindZauzetostByIdResponse createFindZauzetostByIdResponse() {
        return new FindZauzetostByIdResponse();
    }

    /**
     * Create an instance of {@link GetSmestajeAgenta }
     * 
     */
    public GetSmestajeAgenta createGetSmestajeAgenta() {
        return new GetSmestajeAgenta();
    }

    /**
     * Create an instance of {@link GetSmestajeAgentaResponse }
     * 
     */
    public GetSmestajeAgentaResponse createGetSmestajeAgentaResponse() {
        return new GetSmestajeAgentaResponse();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link SaveSmestajSlika }
     * 
     */
    public SaveSmestajSlika createSaveSmestajSlika() {
        return new SaveSmestajSlika();
    }

    /**
     * Create an instance of {@link SaveSmestajSlikaResponse }
     * 
     */
    public SaveSmestajSlikaResponse createSaveSmestajSlikaResponse() {
        return new SaveSmestajSlikaResponse();
    }

    /**
     * Create an instance of {@link SaveTermin }
     * 
     */
    public SaveTermin createSaveTermin() {
        return new SaveTermin();
    }

    /**
     * Create an instance of {@link SaveTerminResponse }
     * 
     */
    public SaveTerminResponse createSaveTerminResponse() {
        return new SaveTerminResponse();
    }

    /**
     * Create an instance of {@link SmestajSlika }
     * 
     */
    public SmestajSlika createSmestajSlika() {
        return new SmestajSlika();
    }

    /**
     * Create an instance of {@link Smestaj }
     * 
     */
    public Smestaj createSmestaj() {
        return new Smestaj();
    }

    /**
     * Create an instance of {@link NaseljenoMesto }
     * 
     */
    public NaseljenoMesto createNaseljenoMesto() {
        return new NaseljenoMesto();
    }

    /**
     * Create an instance of {@link Zauzetost }
     * 
     */
    public Zauzetost createZauzetost() {
        return new Zauzetost();
    }

    /**
     * Create an instance of {@link Komentar }
     * 
     */
    public Komentar createKomentar() {
        return new Komentar();
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
     * Create an instance of {@link Kategorija }
     * 
     */
    public Kategorija createKategorija() {
        return new Kategorija();
    }

    /**
     * Create an instance of {@link TipSmestaja }
     * 
     */
    public TipSmestaja createTipSmestaja() {
        return new TipSmestaja();
    }

    /**
     * Create an instance of {@link DodatnaUsluga }
     * 
     */
    public DodatnaUsluga createDodatnaUsluga() {
        return new DodatnaUsluga();
    }

    /**
     * Create an instance of {@link Ocena }
     * 
     */
    public Ocena createOcena() {
        return new Ocena();
    }

    /**
     * Create an instance of {@link Termin }
     * 
     */
    public Termin createTermin() {
        return new Termin();
    }

    /**
     * Create an instance of {@link Rezervacija }
     * 
     */
    public Rezervacija createRezervacija() {
        return new Rezervacija();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllAccomodations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findAllAccomodations")
    public JAXBElement<FindAllAccomodations> createFindAllAccomodations(FindAllAccomodations value) {
        return new JAXBElement<FindAllAccomodations>(_FindAllAccomodations_QNAME, FindAllAccomodations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllAccomodationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findAllAccomodationsResponse")
    public JAXBElement<FindAllAccomodationsResponse> createFindAllAccomodationsResponse(FindAllAccomodationsResponse value) {
        return new JAXBElement<FindAllAccomodationsResponse>(_FindAllAccomodationsResponse_QNAME, FindAllAccomodationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findAllCategories")
    public JAXBElement<FindAllCategories> createFindAllCategories(FindAllCategories value) {
        return new JAXBElement<FindAllCategories>(_FindAllCategories_QNAME, FindAllCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findAllCategoriesResponse")
    public JAXBElement<FindAllCategoriesResponse> createFindAllCategoriesResponse(FindAllCategoriesResponse value) {
        return new JAXBElement<FindAllCategoriesResponse>(_FindAllCategoriesResponse_QNAME, FindAllCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllNaseljenoMesto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findAllNaseljenoMesto")
    public JAXBElement<FindAllNaseljenoMesto> createFindAllNaseljenoMesto(FindAllNaseljenoMesto value) {
        return new JAXBElement<FindAllNaseljenoMesto>(_FindAllNaseljenoMesto_QNAME, FindAllNaseljenoMesto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllNaseljenoMestoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findAllNaseljenoMestoResponse")
    public JAXBElement<FindAllNaseljenoMestoResponse> createFindAllNaseljenoMestoResponse(FindAllNaseljenoMestoResponse value) {
        return new JAXBElement<FindAllNaseljenoMestoResponse>(_FindAllNaseljenoMestoResponse_QNAME, FindAllNaseljenoMestoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllRezervacije }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findAllRezervacije")
    public JAXBElement<FindAllRezervacije> createFindAllRezervacije(FindAllRezervacije value) {
        return new JAXBElement<FindAllRezervacije>(_FindAllRezervacije_QNAME, FindAllRezervacije.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllRezervacijeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findAllRezervacijeResponse")
    public JAXBElement<FindAllRezervacijeResponse> createFindAllRezervacijeResponse(FindAllRezervacijeResponse value) {
        return new JAXBElement<FindAllRezervacijeResponse>(_FindAllRezervacijeResponse_QNAME, FindAllRezervacijeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllServices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findAllServices")
    public JAXBElement<FindAllServices> createFindAllServices(FindAllServices value) {
        return new JAXBElement<FindAllServices>(_FindAllServices_QNAME, FindAllServices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllServicesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findAllServicesResponse")
    public JAXBElement<FindAllServicesResponse> createFindAllServicesResponse(FindAllServicesResponse value) {
        return new JAXBElement<FindAllServicesResponse>(_FindAllServicesResponse_QNAME, FindAllServicesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findAllTypes")
    public JAXBElement<FindAllTypes> createFindAllTypes(FindAllTypes value) {
        return new JAXBElement<FindAllTypes>(_FindAllTypes_QNAME, FindAllTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findAllTypesResponse")
    public JAXBElement<FindAllTypesResponse> createFindAllTypesResponse(FindAllTypesResponse value) {
        return new JAXBElement<FindAllTypesResponse>(_FindAllTypesResponse_QNAME, FindAllTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDodatnaUslugaById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findDodatnaUslugaById")
    public JAXBElement<FindDodatnaUslugaById> createFindDodatnaUslugaById(FindDodatnaUslugaById value) {
        return new JAXBElement<FindDodatnaUslugaById>(_FindDodatnaUslugaById_QNAME, FindDodatnaUslugaById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDodatnaUslugaByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findDodatnaUslugaByIdResponse")
    public JAXBElement<FindDodatnaUslugaByIdResponse> createFindDodatnaUslugaByIdResponse(FindDodatnaUslugaByIdResponse value) {
        return new JAXBElement<FindDodatnaUslugaByIdResponse>(_FindDodatnaUslugaByIdResponse_QNAME, FindDodatnaUslugaByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindKategorijaById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findKategorijaById")
    public JAXBElement<FindKategorijaById> createFindKategorijaById(FindKategorijaById value) {
        return new JAXBElement<FindKategorijaById>(_FindKategorijaById_QNAME, FindKategorijaById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindKategorijaByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findKategorijaByIdResponse")
    public JAXBElement<FindKategorijaByIdResponse> createFindKategorijaByIdResponse(FindKategorijaByIdResponse value) {
        return new JAXBElement<FindKategorijaByIdResponse>(_FindKategorijaByIdResponse_QNAME, FindKategorijaByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindKomentarById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findKomentarById")
    public JAXBElement<FindKomentarById> createFindKomentarById(FindKomentarById value) {
        return new JAXBElement<FindKomentarById>(_FindKomentarById_QNAME, FindKomentarById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindKomentarByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findKomentarByIdResponse")
    public JAXBElement<FindKomentarByIdResponse> createFindKomentarByIdResponse(FindKomentarByIdResponse value) {
        return new JAXBElement<FindKomentarByIdResponse>(_FindKomentarByIdResponse_QNAME, FindKomentarByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNaseljenoMestoById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findNaseljenoMestoById")
    public JAXBElement<FindNaseljenoMestoById> createFindNaseljenoMestoById(FindNaseljenoMestoById value) {
        return new JAXBElement<FindNaseljenoMestoById>(_FindNaseljenoMestoById_QNAME, FindNaseljenoMestoById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindNaseljenoMestoByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findNaseljenoMestoByIdResponse")
    public JAXBElement<FindNaseljenoMestoByIdResponse> createFindNaseljenoMestoByIdResponse(FindNaseljenoMestoByIdResponse value) {
        return new JAXBElement<FindNaseljenoMestoByIdResponse>(_FindNaseljenoMestoByIdResponse_QNAME, FindNaseljenoMestoByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSlikaById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findSlikaById")
    public JAXBElement<FindSlikaById> createFindSlikaById(FindSlikaById value) {
        return new JAXBElement<FindSlikaById>(_FindSlikaById_QNAME, FindSlikaById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSlikaByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findSlikaByIdResponse")
    public JAXBElement<FindSlikaByIdResponse> createFindSlikaByIdResponse(FindSlikaByIdResponse value) {
        return new JAXBElement<FindSlikaByIdResponse>(_FindSlikaByIdResponse_QNAME, FindSlikaByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSmestajById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findSmestajById")
    public JAXBElement<FindSmestajById> createFindSmestajById(FindSmestajById value) {
        return new JAXBElement<FindSmestajById>(_FindSmestajById_QNAME, FindSmestajById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSmestajByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findSmestajByIdResponse")
    public JAXBElement<FindSmestajByIdResponse> createFindSmestajByIdResponse(FindSmestajByIdResponse value) {
        return new JAXBElement<FindSmestajByIdResponse>(_FindSmestajByIdResponse_QNAME, FindSmestajByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTerminById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findTerminById")
    public JAXBElement<FindTerminById> createFindTerminById(FindTerminById value) {
        return new JAXBElement<FindTerminById>(_FindTerminById_QNAME, FindTerminById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTerminByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findTerminByIdResponse")
    public JAXBElement<FindTerminByIdResponse> createFindTerminByIdResponse(FindTerminByIdResponse value) {
        return new JAXBElement<FindTerminByIdResponse>(_FindTerminByIdResponse_QNAME, FindTerminByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTipById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findTipById")
    public JAXBElement<FindTipById> createFindTipById(FindTipById value) {
        return new JAXBElement<FindTipById>(_FindTipById_QNAME, FindTipById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTipByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findTipByIdResponse")
    public JAXBElement<FindTipByIdResponse> createFindTipByIdResponse(FindTipByIdResponse value) {
        return new JAXBElement<FindTipByIdResponse>(_FindTipByIdResponse_QNAME, FindTipByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindZauzetostById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findZauzetostById")
    public JAXBElement<FindZauzetostById> createFindZauzetostById(FindZauzetostById value) {
        return new JAXBElement<FindZauzetostById>(_FindZauzetostById_QNAME, FindZauzetostById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindZauzetostByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "findZauzetostByIdResponse")
    public JAXBElement<FindZauzetostByIdResponse> createFindZauzetostByIdResponse(FindZauzetostByIdResponse value) {
        return new JAXBElement<FindZauzetostByIdResponse>(_FindZauzetostByIdResponse_QNAME, FindZauzetostByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmestajeAgenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "getSmestajeAgenta")
    public JAXBElement<GetSmestajeAgenta> createGetSmestajeAgenta(GetSmestajeAgenta value) {
        return new JAXBElement<GetSmestajeAgenta>(_GetSmestajeAgenta_QNAME, GetSmestajeAgenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmestajeAgentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "getSmestajeAgentaResponse")
    public JAXBElement<GetSmestajeAgentaResponse> createGetSmestajeAgentaResponse(GetSmestajeAgentaResponse value) {
        return new JAXBElement<GetSmestajeAgentaResponse>(_GetSmestajeAgentaResponse_QNAME, GetSmestajeAgentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveSmestajSlika }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "saveSmestajSlika")
    public JAXBElement<SaveSmestajSlika> createSaveSmestajSlika(SaveSmestajSlika value) {
        return new JAXBElement<SaveSmestajSlika>(_SaveSmestajSlika_QNAME, SaveSmestajSlika.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveSmestajSlikaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "saveSmestajSlikaResponse")
    public JAXBElement<SaveSmestajSlikaResponse> createSaveSmestajSlikaResponse(SaveSmestajSlikaResponse value) {
        return new JAXBElement<SaveSmestajSlikaResponse>(_SaveSmestajSlikaResponse_QNAME, SaveSmestajSlikaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTermin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "saveTermin")
    public JAXBElement<SaveTermin> createSaveTermin(SaveTermin value) {
        return new JAXBElement<SaveTermin>(_SaveTermin_QNAME, SaveTermin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveTerminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://bezbednost/", name = "saveTerminResponse")
    public JAXBElement<SaveTerminResponse> createSaveTerminResponse(SaveTerminResponse value) {
        return new JAXBElement<SaveTerminResponse>(_SaveTerminResponse_QNAME, SaveTerminResponse.class, null, value);
    }

}
