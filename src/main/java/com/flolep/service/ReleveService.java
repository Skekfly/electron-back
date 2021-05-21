package com.flolep.service;

import com.flolep.metier.blo.ReleveBlo;
import com.flolep.metier.dto.ReleveRequest;
import com.flolep.metier.dto.ReleveResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("releve")
public class ReleveService {
	@Resource
	private ReleveBlo releveBlo;

	@PutMapping("")
	public void addReleve(ReleveRequest releve) {
		releveBlo.addReleve(releve);
	}

	@GetMapping("")
	public List<ReleveResponse> getReleve() {
		return releveBlo.getReleves();
	}

	@PostMapping("")
	public void updateReleve(ReleveRequest releve) {
		releveBlo.updateReleve(releve);
	}

	@DeleteMapping("")
	public void deleteReleve(Long releveId) {
		releveBlo.deleteReleve(releveId);
	}
}
