package com.vikash.ipldashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vikash.ipldashboard.model.Team;
import com.vikash.ipldashboard.service.TeamService;

@RestController
@CrossOrigin
public class TeamController {
	
	@Autowired
	private TeamService teamService;

	@GetMapping("/team/{teamName}/{count}")
	public Team getTeam( @PathVariable("teamName")String teamName, @PathVariable("count")int count) {
		return this.teamService.findByTeamName(teamName, count);
	}
}
