package com.flolep.metier.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@IdClass(ReleveIdEntity.class)
@Table(name = "t_releve")
public class ReleveEntity {
	@Id
	@Column(name = "rel_usr_id")
	private Long utilisateurId;
	@Id
	@Column(name = "rel_fou_id")
	private Long fournisseurId;


	@ManyToOne
	@JoinColumn(name = "rel_usr_id", insertable=false, updatable=false)
	private UtilisateurEntity utilisateur;

	@ManyToOne
	@JoinColumn(name = "rel_fou_id", insertable=false, updatable=false)
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
