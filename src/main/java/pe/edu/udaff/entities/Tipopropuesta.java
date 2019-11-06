package pe.edu.udaff.entities;
// Generated 06-nov-2019 10:11:51 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tipopropuesta generated by hbm2java
 */
@Entity
@Table(name = "tipopropuesta", catalog = "seguimientoalegresado")
public class Tipopropuesta implements java.io.Serializable {

	private Integer idTipoPropuesta;
	private String nombreTipoPropuesta;
	private Set<Propuesta> propuestas = new HashSet<Propuesta>(0);

	public Tipopropuesta() {
	}

	public Tipopropuesta(String nombreTipoPropuesta, Set<Propuesta> propuestas) {
		this.nombreTipoPropuesta = nombreTipoPropuesta;
		this.propuestas = propuestas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idTipoPropuesta", unique = true, nullable = false)
	public Integer getIdTipoPropuesta() {
		return this.idTipoPropuesta;
	}

	public void setIdTipoPropuesta(Integer idTipoPropuesta) {
		this.idTipoPropuesta = idTipoPropuesta;
	}

	@Column(name = "nombreTipoPropuesta", length = 40)
	public String getNombreTipoPropuesta() {
		return this.nombreTipoPropuesta;
	}

	public void setNombreTipoPropuesta(String nombreTipoPropuesta) {
		this.nombreTipoPropuesta = nombreTipoPropuesta;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipopropuesta")
	public Set<Propuesta> getPropuestas() {
		return this.propuestas;
	}

	public void setPropuestas(Set<Propuesta> propuestas) {
		this.propuestas = propuestas;
	}

}