package com.flolep.metier.entity;

import lombok.Getter;

import javax.persistence.Column;
import java.io.Serializable;

@Getter
public class ReleveIdEntity implements Serializable {
	@Column(name = "rel_usr_id")
	private Long utilisateurId;
	@Column(name = "rel_fou_id")
	private Long fournisseurId;
}
