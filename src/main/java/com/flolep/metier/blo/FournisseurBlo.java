package com.flolep.metier.blo;

import com.flolep.metier.dto.FournisseurRequest;
import com.flolep.metier.dto.FournisseurResponse;

import java.util.List;

public interface FournisseurBlo {
	void addFournisseur(FournisseurRequest fournisseur);

	List<FournisseurResponse> getFournisseurs();

	FournisseurResponse getFournisseur(long fournisseurId);

	void deleteFournisseur(long fournisseurId);
}
