
package com.chisw.xml.stream;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chisw.xml package. 
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

    private final static QName _Desc_QNAME = new QName("", "Desc");
    private final static QName _StreamId_QNAME = new QName("", "StreamId");
    private final static QName _Img_QNAME = new QName("", "Img");
    private final static QName _BoundingY_QNAME = new QName("", "BoundingY");
    private final static QName _BoundingX_QNAME = new QName("", "BoundingX");
    private final static QName _Summary_QNAME = new QName("", "Summary");
    private final static QName _Height_QNAME = new QName("", "Height");
    private final static QName _ID_QNAME = new QName("", "ID");
    private final static QName _Image_QNAME = new QName("", "Image");
    private final static QName _Width_QNAME = new QName("", "Width");
    private final static QName _Date_QNAME = new QName("", "Date");
    private final static QName _Name_QNAME = new QName("", "Name");
    private final static QName _URL_QNAME = new QName("", "URL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chisw.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LSResponse }
     * 
     */
    public LSResponse createLSResponse() {
        return new LSResponse();
    }

    /**
     * Create an instance of {@link Stream }
     * 
     */
    public Stream createStream() {
        return new Stream();
    }

    /**
     * Create an instance of {@link Anomalies }
     * 
     */
    public Anomalies createAnomalies() {
        return new Anomalies();
    }

    /**
     * Create an instance of {@link Anomaly }
     * 
     */
    public Anomaly createAnomaly() {
        return new Anomaly();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Desc")
    public JAXBElement<String> createDesc(String value) {
        return new JAXBElement<String>(_Desc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StreamId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStreamId(String value) {
        return new JAXBElement<String>(_StreamId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Img")
    public JAXBElement<String> createImg(String value) {
        return new JAXBElement<String>(_Img_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BoundingY")
    public JAXBElement<BigInteger> createBoundingY(BigInteger value) {
        return new JAXBElement<BigInteger>(_BoundingY_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BoundingX")
    public JAXBElement<BigInteger> createBoundingX(BigInteger value) {
        return new JAXBElement<BigInteger>(_BoundingX_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Summary")
    public JAXBElement<String> createSummary(String value) {
        return new JAXBElement<String>(_Summary_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Height")
    public JAXBElement<BigInteger> createHeight(BigInteger value) {
        return new JAXBElement<BigInteger>(_Height_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ID")
    public JAXBElement<BigInteger> createID(BigInteger value) {
        return new JAXBElement<BigInteger>(_ID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Image")
    public JAXBElement<String> createImage(String value) {
        return new JAXBElement<String>(_Image_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Width")
    public JAXBElement<BigInteger> createWidth(BigInteger value) {
        return new JAXBElement<BigInteger>(_Width_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Date")
    public JAXBElement<String> createDate(String value) {
        return new JAXBElement<String>(_Date_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    @XmlElementDecl(namespace = "", name = "URL")
    public JAXBElement<String> createURL(String value) {
        return new JAXBElement<String>(_URL_QNAME, String.class, null, value);
    }

}
