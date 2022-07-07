package com.vikash.ipldashboard.data;

import java.time.LocalDate;

import org.springframework.batch.item.ItemProcessor;

import com.vikash.ipldashboard.model.Match;

public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

	@Override
	public Match process(final MatchInput matchInput) throws Exception {

		Match match = new Match();
		match.setID(Long.parseLong(matchInput.getID()));
		match.setCity(matchInput.getCity());
		match.setDate(LocalDate.parse(matchInput.getDate()));
		match.setPlayerOfMatch(matchInput.getPlayer_of_Match());
		match.setVenue(matchInput.getVenue());
		match.setSeason(matchInput.getSeason());
		match.setGameNumber(matchInput.getGameNumber());
		match.setSuperOver(matchInput.getSuperOver());

		String firstinningsTeam = null;
		String secondInningsTeam = null;
		if ("bat".equals(matchInput.getTossDecision())) {
			firstinningsTeam = matchInput.getTossWinner();
			secondInningsTeam = matchInput.getTossWinner().equals(matchInput.getTeam1()) ? matchInput.getTeam2()
					: matchInput.getTeam1();
			match.setTeamOnePlayers(matchInput.getTeam1Players());
			match.setTeamTwoPlayers(matchInput.getTeam2Players());
		} else {
			secondInningsTeam = matchInput.getTossWinner();
			firstinningsTeam = matchInput.getTossWinner().equals(matchInput.getTeam1()) ? matchInput.getTeam2()
					: matchInput.getTeam1();
			match.setTeamOnePlayers(matchInput.getTeam2Players());
			match.setTeamTwoPlayers(matchInput.getTeam1Players());
		}

		match.setWonBy(matchInput.getWonBy());
		match.setTeam1(firstinningsTeam);
		match.setTeam2(secondInningsTeam);
		match.setTossWinner(matchInput.getTossWinner());
		match.setTossDecision(matchInput.getTossDecision());
		match.setUmpire1(matchInput.getUmpire1());
		match.setUmpire2(matchInput.getUmpire2());
		match.setWinningTeam(matchInput.getWinningTeam());
		match.setMargin(matchInput.getMargin());

		return match;

	}
}
