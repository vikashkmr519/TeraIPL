package com.vikash.ipldashboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikash.ipldashboard.model.Team;
import com.vikash.ipldashboard.repository.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;
	
	@Autowired
	private MatchService matchService;
	
	public Team findByTeamName(String teamName, int count) {
		
		Team team = this.teamRepository.findByTeamName(teamName);
		team.setMatches(this.matchService.findLastestMatchesByTeam(teamName, count));
		return team;
		
	}
	
	
}
