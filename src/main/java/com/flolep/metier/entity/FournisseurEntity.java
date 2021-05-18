package com.flolep.metier.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "t_fournisseur")
public class FournisseurEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fou_id")
	private Long id;
	@Column(name = "fou_name")
	private String name;
}
