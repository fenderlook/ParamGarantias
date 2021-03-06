/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.garParameters.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vargascarr
 */
@Entity
@Table(name = "PARAMETER_GAR")
@XmlRootElement(name = "ParameterGar")
@NamedQueries({
    @NamedQuery(name = "ParameterGar.findAll", query = "SELECT p FROM ParameterGar p")
    , @NamedQuery(name = "ParameterGar.findByIdParameter", query = "SELECT p FROM ParameterGar p WHERE p.idParameter = :idParameter")
    , @NamedQuery(name = "ParameterGar.findByIdParentparameter", query = "SELECT p FROM ParameterGar p WHERE p.idParentparameter = :idParentparameter")
    , @NamedQuery(name = "ParameterGar.findByNameParameter", query = "SELECT p FROM ParameterGar p WHERE p.nameParameter = :nameParameter")
    , @NamedQuery(name = "ParameterGar.findByDescriptionParameter", query = "SELECT p FROM ParameterGar p WHERE p.descriptionParameter = :descriptionParameter")
    , @NamedQuery(name = "ParameterGar.findByValueParameter", query = "SELECT p FROM ParameterGar p WHERE p.valueParameter = :valueParameter")
    , @NamedQuery(name = "ParameterGar.findByAlterValueparameter", query = "SELECT p FROM ParameterGar p WHERE p.alterValueparameter = :alterValueparameter")})
public class ParameterGar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PARAMETER")
    @XmlElement(required = true)
    private Integer idParameter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PARENTPARAMETER")
    @XmlElement(required = true)
    private int idParentparameter;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "NAME_PARAMETER")
    @XmlElement(required = true)
    private String nameParameter;
    @Size(max = 255)
    @Column(name = "DESCRIPTION_PARAMETER")
    private String descriptionParameter;
    @Column(name = "VALUE_PARAMETER")
    private String valueParameter;
    @Column(name = "ALTER_VALUEPARAMETER")
    private String alterValueparameter;

    public ParameterGar() {
    }

    public ParameterGar(Integer idParameter) {
        this.idParameter = idParameter;
    }

    public ParameterGar(Integer idParameter, int idParentparameter, String nameParameter) {
        this.idParameter = idParameter;
        this.idParentparameter = idParentparameter;
        this.nameParameter = nameParameter;
    }

    public Integer getIdParameter() {
        return idParameter;
    }

    public void setIdParameter(Integer idParameter) {
        this.idParameter = idParameter;
    }

    public int getIdParentparameter() {
        return idParentparameter;
    }

    public void setIdParentparameter(int idParentparameter) {
        this.idParentparameter = idParentparameter;
    }

    public String getNameParameter() {
        return nameParameter;
    }

    public void setNameParameter(String nameParameter) {
        this.nameParameter = nameParameter;
    }

    public String getDescriptionParameter() {
        return descriptionParameter;
    }

    public void setDescriptionParameter(String descriptionParameter) {
        this.descriptionParameter = descriptionParameter;
    }

    public String getValueParameter() {
        return valueParameter;
    }

    public void setValueParameter(String valueParameter) {
        this.valueParameter = valueParameter;
    }

    public String getAlterValueparameter() {
        return alterValueparameter;
    }

    public void setAlterValueparameter(String alterValueparameter) {
        this.alterValueparameter = alterValueparameter;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParameter != null ? idParameter.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParameterGar)) {
            return false;
        }
        ParameterGar other = (ParameterGar) object;
        if ((this.idParameter == null && other.idParameter != null) || (this.idParameter != null && !this.idParameter.equals(other.idParameter))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.garParameters.entity.ParameterGar[ idParameter=" + idParameter + " ]";
    }
    
}
