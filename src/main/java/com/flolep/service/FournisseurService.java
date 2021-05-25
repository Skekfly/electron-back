package com.flolep.service;

import com.flolep.metier.blo.FournisseurBlo;
import com.flolep.metier.dto.FournisseurRequest;
import com.flolep.metier.dto.FournisseurResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("fournisseur")
public class FournisseurService {
	@Resource
	private FournisseurBlo fournisseurBlo;

	@PutMapping("")
	public void addFournisseur(@RequestBody FournisseurRequest fournisseur) {
		fournisseurBlo.addFournisseur(fournisseur);
	}

	@GetMapping("")
	public List<FournisseurResponse> getFournisseurs() {
		return fournisseurBlo.getFournisseurs();
	}

	@GetMapping("/{id}")
	public FournisseurResponse getFournisseur(long id) {
		return fournisseurBlo.getFournisseur(id);
	}

	@DeleteMapping("/{id}")
	public void deleteFournisseur(Long fournisseurId) {
		fournisseurBlo.deleteFournisseur(fournisseurId);
	}
}
