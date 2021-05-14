package com.flolep.metier.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Fournisseur {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	Long id;
	String name;
}
