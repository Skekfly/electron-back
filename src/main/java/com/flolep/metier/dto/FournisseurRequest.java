package com.flolep.metier.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder
@Getter
@AllArgsConstructor
public class FournisseurRequest {
	private final Long id;
	private final String name;
}
