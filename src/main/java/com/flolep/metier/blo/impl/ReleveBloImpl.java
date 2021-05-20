package com.flolep.metier.blo.impl;

import com.flolep.metier.blo.ReleveBlo;
import com.flolep.metier.dto.Releve;
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
	public List<Releve> getReleves() {
		List<ReleveEntity> releveEntities = releveRepository.findAll();
		return releveEntities.stream().map(entity ->
				Releve.builder()
						.fournisseur(entity.getFournisseur().getName())
						.utilisateur(entity.getUtilisateur().getLogin())
						.dateDebut(entity.getDateDebut())
						.dateFin(entity.getDateFin())
						.hc(entity.getHc())
						.hp(entity.getHp())
						.total(entity.getTotal())
						.build())
				.collect(Collectors.toList());
	}
}
