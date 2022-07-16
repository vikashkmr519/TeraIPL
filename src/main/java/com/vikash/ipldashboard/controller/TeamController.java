package com.vikash.ipldashboard.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vikash.ipldashboard.model.Match;
import com.vikash.ipldashboard.model.Team;
import com.vikash.ipldashboard.service.MatchService;
import com.vikash.ipldashboard.service.TeamService;

@RestController
@CrossOrigin
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@Autowired
	private MatchService matchService;
	
	@GetMapping("/teams")
	public List<Team> getAllTeam(){
		return this.teamService.findAll();
	}

	@GetMapping("/team/{teamName}/{count}")
	public Team getTeam( @PathVariable("teamName")String teamName, @PathVariable("count")int count) {
		return this.teamService.findByTeamName(teamName, count);
	}
	
	@GetMapping("team/{teamName}/matches")
	public List<Match> getMatchesForTeam(@PathVariable("teamName") String teamName, @RequestParam("year") int year){
		LocalDate startDate = LocalDate.of(year, 1, 1);
		LocalDate endDate = LocalDate.of(year+1, 1, 1);
		
		return this.matchService.getMatchesByTeamBetweenDate(teamName, startDate, endDate);
		
		
	}
}
