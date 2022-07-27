package com.vikash.ipldashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vikash.ipldashboard.model.Match;
import com.vikash.ipldashboard.repository.MatchRepository;
import com.vikash.ipldashboard.service.MatchService;

@RestController
public class MatchController {

	@Autowired
	private MatchService matchService;
	
	@GetMapping("/match/:matchId")
	public Match getMatch(@PathVariable("matchId") String matchId) {
		return this.matchService.getMatch(Long.valueOf(matchId));
	}
}
