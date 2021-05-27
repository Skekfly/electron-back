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
	public ReleveResponse getReleve(long releveId) {
		return fromEntity(releveRepository.getById(releveId));
	}

	@Override
	public void deleteReleve(long releveId) {
		releveRepository.deleteById(releveId);
	}

	private ReleveResponse fromEntity(ReleveEntity entity) {
		return ReleveResponse.builder()
				.id(entity.getId())
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
		ReleveEntity releveEntity = new ReleveEntity();
		releveEntity.setFournisseurId(releve.getFournisseurId());
				//TODO : user
				releveEntity.setUtilisateurId(1L);
				releveEntity.setDateDebut(releve.getDateDebut());
				releveEntity.setDateFin(releve.getDateFin());
				releveEntity.setHc(releve.getHc());
				releveEntity.setHp(releve.getHp());
				releveEntity.setTotal(releve.getTotal());
				return releveEntity;
	}
}
