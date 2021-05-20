package com.flolep.metier.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "t_fournisseur")
public class FournisseurEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fou_id")
	private Long id;
	@Column(name = "fou_name")
	private String name;
}
