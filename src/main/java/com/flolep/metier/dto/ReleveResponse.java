package com.flolep.metier.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Builder;

import java.io.Serializable;
import java.time.LocalDate;

@Builder
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ReleveResponse implements Serializable {
	private final long id;
	private final String utilisateur;
	private final String fournisseur;
	private final LocalDate dateDebut;
	private final LocalDate dateFin;
	private final int hp;
	private final int hc;
	private final int total;
}
