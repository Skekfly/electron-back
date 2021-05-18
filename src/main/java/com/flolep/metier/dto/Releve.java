package com.flolep.metier.dto;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class Releve {
	private String utilisateur;
	private String fournisseur;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private int hp;
	private int hc;
	private int total;
}
