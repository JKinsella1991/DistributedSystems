//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.07 at 04:25:14 PM GMT 
//

package ie.gmit.sw.Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="car" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cust" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "orderID", "orderNumber", "date", "car", "cust" })
@XmlRootElement(name = "Order")
public class Order {

	@XmlElement(name = "OrderID")
	protected int orderID;
	@XmlElement(name = "OrderNumber")
	protected int orderNumber;
	@XmlElement(name = "Date", required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar date;
	@XmlElement(name = "car")
	protected int car;
	@XmlElement(name = "cust")
	protected int cust;

	/**
	 * Gets the value of the orderID property.
	 * 
	 */
	public int getOrderID() {
		return orderID;
	}

	/**
	 * Sets the value of the orderID property.
	 * 
	 */
	public void setOrderID(int value) {
		this.orderID = value;
	}

	/**
	 * Gets the value of the orderNumber property.
	 * 
	 */
	public int getOrderNumber() {
		return orderNumber;
	}

	/**
	 * Sets the value of the orderNumber property.
	 * 
	 */
	public void setOrderNumber(int value) {
		this.orderNumber = value;
	}

	/**
	 * Gets the value of the date property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDate() {
		return date;
	}

	/**
	 * Sets the value of the date property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDate(XMLGregorianCalendar value) {
		this.date = value;
	}

	/**
	 * Gets the value of the car property.
	 * 
	 */
	public int getCar() {
		return car;
	}

	/**
	 * Sets the value of the car property.
	 * 
	 */
	public void setCar(int value) {
		this.car = value;
	}

	/**
	 * Gets the value of the cust property.
	 * 
	 */
	public int getCust() {
		return cust;
	}

	/**
	 * Sets the value of the cust property.
	 * 
	 */
	public void setCust(int value) {
		this.cust = value;
	}

}