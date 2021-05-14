package com.flolep.metier.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Releve {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	Long id;
	LocalDate dateDebut;
	LocalDate dateFin;
	int hp;
	int hc;
	int total;
}
