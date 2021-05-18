package com.flolep.metier.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "t_utilisateur")
public class UtilisateurEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "rel_id")
	private Long id;
	@Column(name = "rel_login")
	private String login;
}
