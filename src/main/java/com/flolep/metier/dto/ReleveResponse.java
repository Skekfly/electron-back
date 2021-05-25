package com.flolep.metier.dto;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class ReleveResponse {
	private final long id;
	private final String utilisateur;
	private final String fournisseur;
	private final LocalDate dateDebut;
	private final LocalDate dateFin;
	private final int hp;
	private final int hc;
	private final int total;
}
