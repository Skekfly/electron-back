package com.flolep.metier.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "t_utilisateur")
public class UtilisateurEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "rel_id")
	private Long id;
	@Column(name = "rel_login")
	private String login;
}
