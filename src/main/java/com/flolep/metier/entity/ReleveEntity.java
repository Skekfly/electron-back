package com.flolep.metier.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "t_releve")
public class ReleveEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@OneToMany(mappedBy = "rel_usr_id")
	private UtilisateurEntity utilisateur;
	@OneToMany(mappedBy = "rel_fou_id")
	private FournisseurEntity fournisseur;
	@Column(name = "rel_date_debut")
	private LocalDate dateDebut;
	@Column(name = "rel_date_fin")
	private LocalDate dateFin;
	@Column(name = "rel_hp")
	private int hp;
	@Column(name = "rel_hc")
	private int hc;
	@Column(name = "rel_total")
	private int total;
}
