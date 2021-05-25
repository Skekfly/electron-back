package com.flolep.metier.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "t_fournisseur")
@Builder
public class FournisseurEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fou_id")
	private Long id;
	@Column(name = "fou_name")
	private String name;
}
