package hello;



import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Lazy;


@Entity
@Table(name = "alumne")

public class Alumne{
	@Id	
	private Long id;
	private String nom;	
	
	public Long getId() {
	return id;
	}	
	public void setIda(Long id) {
	this.id = id;
	}	
	
	public String getNom() {
	return nom;
	}
	
	public void setNom(String nom) {
	this.nom = nom;
	}

}


