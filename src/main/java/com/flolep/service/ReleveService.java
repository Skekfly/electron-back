package com.flolep.service;

import com.flolep.metier.blo.ReleveBlo;
import com.flolep.metier.dto.Releve;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("releve")
public class ReleveService {
	@Resource
	private ReleveBlo releveBlo;

	@GetMapping("")
	public List<Releve> getReleve() {
		return releveBlo.getReleves();
	}

}
