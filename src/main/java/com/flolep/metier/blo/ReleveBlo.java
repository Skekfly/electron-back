package com.flolep.metier.blo;

import com.flolep.metier.dto.ReleveRequest;
import com.flolep.metier.dto.ReleveResponse;

import java.util.List;

public interface ReleveBlo {
	void addReleve(ReleveRequest releve);

	List<ReleveResponse> getReleves();

	void updateReleve(ReleveRequest releve);

	void deleteReleve(Long releveId);
}
