package com.flolep.metier.blo.impl;

import com.flolep.metier.blo.ReleveBlo;
import com.flolep.metier.dto.ReleveRequest;
import com.flolep.metier.dto.ReleveResponse;
import com.flolep.metier.entity.ReleveEntity;
import com.flolep.metier.repository.ReleveRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReleveBloImpl implements ReleveBlo {
	@Resource
	ReleveRepository releveRepository;

	@Override
	public void addReleve(ReleveRequest releve) {
		releveRepository.save(toEntity(releve));
	}

	@Override
	public List<ReleveResponse> getReleves() {
		List<ReleveEntity> releveEntities = releveRepository.findAll();
		return releveEntities.stream()
				.map(this::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void updateReleve(ReleveRequest releve) {
		//TODO : get old, save new
	}

	@Override
	public void deleteReleve(Long releveId) {
		releveRepository.deleteById(releveId);
	}

	private ReleveResponse fromEntity(ReleveEntity entity) {
		return ReleveResponse.builder()
				.fournisseur(entity.getFournisseur().getName())
				.utilisateur(entity.getUtilisateur().getLogin())
				.dateDebut(entity.getDateDebut())
				.dateFin(entity.getDateFin())
				.hc(entity.getHc())
				.hp(entity.getHp())
				.total(entity.getTotal())
				.build();
	}

	private ReleveEntity toEntity(ReleveRequest releve) {
		return ReleveEntity.builder()
				.fournisseurId(releve.getFournisseurId())
				//TODO : user
				.utilisateurId(1L)
				.dateDebut(releve.getDateDebut())
				.dateFin(releve.getDateFin())
				.hc(releve.getHc())
				.hp(releve.getHp())
				.total(releve.getTotal())
				.build();
	}
}
