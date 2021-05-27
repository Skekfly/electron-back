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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "usr_id")
	private Long id;
	@Column(name = "usr_login")
	private String login;
}
