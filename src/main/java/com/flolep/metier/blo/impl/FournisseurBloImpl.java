package com.flolep.metier.blo.impl;

import com.flolep.metier.blo.FournisseurBlo;
import com.flolep.metier.dto.FournisseurRequest;
import com.flolep.metier.dto.FournisseurResponse;
import com.flolep.metier.entity.FournisseurEntity;
import com.flolep.metier.repository.FournisseurRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FournisseurBloImpl implements FournisseurBlo {
	@Resource
	FournisseurRepository fournisseurRepository;

	@Override
	public void addFournisseur(FournisseurRequest fournisseur) {
		fournisseurRepository.save(toEntity(fournisseur));
	}

	@Override
	public List<FournisseurResponse> getFournisseurs() {
		List<FournisseurEntity> fournisseurEntities = fournisseurRepository.findAll();
		return fournisseurEntities.stream()
				.map(this::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public FournisseurResponse getFournisseur(long fournisseurId) {
		return fromEntity(fournisseurRepository.getById(fournisseurId));
	}

	@Override
	public void deleteFournisseur(long fournisseurId) {
		fournisseurRepository.deleteById(fournisseurId);
	}

	private FournisseurResponse fromEntity(FournisseurEntity entity) {
		return FournisseurResponse.builder()
				.id(entity.getId())
				.name(entity.getName())
				.build();
	}

	private FournisseurEntity toEntity(FournisseurRequest fournisseur) {
		FournisseurEntity fournisseurEntity = new FournisseurEntity();
		fournisseurEntity.setName(fournisseur.getName());
		return fournisseurEntity;
	}
}
