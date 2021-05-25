package com.flolep.metier.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Getter
@AllArgsConstructor
public class ReleveRequest {
	private final Long id;
	private final Long fournisseurId;
	private final LocalDate dateDebut;
	private final LocalDate dateFin;
	private final int hp;
	private final int hc;
	private final int total;
}
