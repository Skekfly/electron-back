package com.flolep.metier.dto;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class FournisseurResponse {
	private final Long id;
	private final String name;
}
