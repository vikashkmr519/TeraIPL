package com.vikash.ipldashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikash.ipldashboard.model.Match;
import com.vikash.ipldashboard.repository.MatchRepository;

@Service
public class MatchService {
	
	@Autowired
	private MatchRepository matchRepository;
	
	public List<Match> findLastestMatchesByTeam(String teamName, int count){
		
		return this.matchRepository.findLastestMatchesByTeam(teamName, count);
	}

}
