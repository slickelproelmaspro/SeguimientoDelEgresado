package pe.edu.udaff.entities;
// Generated 07-nov-2019 2:34:51 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "seguimientoalegresado", uniqueConstraints = @UniqueConstraint(columnNames = "usuario"))
public class Usuario implements java.io.Serializable {

	private Integer idUsuario;
	private Perfil perfil;
	private String usuario;
	private String pass;
	private Byte estado;
	private Set<Persona> personas = new HashSet<Persona>(0);
	private Set<Propuesta> propuestas = new HashSet<Propuesta>(0);
	private Set<Noticia> noticias = new HashSet<Noticia>(0);

	public Usuario() {
	}

	public Usuario(Perfil perfil, String usuario, String pass, Byte estado, Set<Persona> personas,
			Set<Propuesta> propuestas, Set<Noticia> noticias) {
		this.perfil = perfil;
		this.usuario = usuario;
		this.pass = pass;
		this.estado = estado;
		this.personas = personas;
		this.propuestas = propuestas;
		this.noticias = noticias;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idUsuario", unique = true, nullable = false)
	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPerfil")
	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@Column(name = "usuario", unique = true, length = 100)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Column(name = "pass", length = 100)
	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Column(name = "estado")
	public Byte getEstado() {
		return this.estado;
	}

	public void setEstado(Byte estado) {
		this.estado = estado;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(Set<Persona> personas) {
		this.personas = personas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Propuesta> getPropuestas() {
		return this.propuestas;
	}

	public void setPropuestas(Set<Propuesta> propuestas) {
		this.propuestas = propuestas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Noticia> getNoticias() {
		return this.noticias;
	}

	public void setNoticias(Set<Noticia> noticias) {
		this.noticias = noticias;
	}

}
