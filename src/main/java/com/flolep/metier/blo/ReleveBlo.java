package com.flolep.metier.blo;

import com.flolep.metier.dto.ReleveRequest;
import com.flolep.metier.dto.ReleveResponse;

import java.util.List;

public interface ReleveBlo {
	void addReleve(ReleveRequest releve);

	List<ReleveResponse> getReleves();

	ReleveResponse getReleve(long releveId);

	void updateReleve(ReleveRequest releve);

	void deleteReleve(long releveId);
}
