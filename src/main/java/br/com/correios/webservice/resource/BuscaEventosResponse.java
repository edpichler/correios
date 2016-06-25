
package br.com.correios.webservice.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de buscaEventosResponse complex type.
 * <p>
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;complexType name="buscaEventosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://resource.webservice.correios.com.br/}sroxml" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaEventosResponse", propOrder = {
        "_return"
})
public class BuscaEventosResponse {

    @XmlElement(name = "return")
    protected Sroxml _return;

    /**
     * Obtém o valor da propriedade return.
     *
     * @return possible object is
     * {@link Sroxml }
     */
    public Sroxml getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     *
     * @param value allowed object is
     *              {@link Sroxml }
     */
    public void setReturn(Sroxml value) {
        this._return = value;
    }

}
