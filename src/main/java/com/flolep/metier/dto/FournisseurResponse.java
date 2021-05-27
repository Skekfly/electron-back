package com.flolep.metier.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Builder;

import java.io.Serializable;
import java.time.LocalDate;

@Builder
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class FournisseurResponse implements Serializable {
	private final Long id;
	private final String name;
}
