package com.vikash.ipldashboard.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Match {

	@Id
	private long ID;
	private String City;
	private LocalDate Date;
	private String Season;
	private String gameNumber;
	private String Team1;
	private String Team2;
	private String Venue;
	private String TossWinner;
	private String TossDecision;
	private String SuperOver;
	private String WinningTeam;
	private String WonBy;
	private String Margin;
	private String PlayerOfMatch;
	private String TeamOnePlayers;
	private String TeamTwoPlayers;
	private String Umpire1;
	private String Umpire2;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public String getSeason() {
		return Season;
	}

	public void setSeason(String season) {
		Season = season;
	}



	public String getGameNumber() {
		return gameNumber;
	}

	public void setGameNumber(String gameNumber) {
		this.gameNumber = gameNumber;
	}

	public String getTeam1() {
		return Team1;
	}

	public void setTeam1(String team1) {
		Team1 = team1;
	}

	public String getTeam2() {
		return Team2;
	}

	public void setTeam2(String team2) {
		Team2 = team2;
	}

	public String getVenue() {
		return Venue;
	}

	public void setVenue(String venue) {
		Venue = venue;
	}

	public String getTossWinner() {
		return TossWinner;
	}

	public void setTossWinner(String tossWinner) {
		TossWinner = tossWinner;
	}

	public String getTossDecision() {
		return TossDecision;
	}

	public void setTossDecision(String tossDecision) {
		TossDecision = tossDecision;
	}

	public String getSuperOver() {
		return SuperOver;
	}

	public void setSuperOver(String superOver) {
		SuperOver = superOver;
	}

	public String getWinningTeam() {
		return WinningTeam;
	}

	public void setWinningTeam(String winningTeam) {
		WinningTeam = winningTeam;
	}

	public String getWonBy() {
		return WonBy;
	}

	public void setWonBy(String wonBy) {
		WonBy = wonBy;
	}

	public String getMargin() {
		return Margin;
	}

	public void setMargin(String margin) {
		Margin = margin;
	}

	public String getPlayerOfMatch() {
		return PlayerOfMatch;
	}

	public void setPlayerOfMatch(String playerOfMatch) {
		PlayerOfMatch = playerOfMatch;
	}

	

	public String getTeamOnePlayers() {
		return TeamOnePlayers;
	}

	public void setTeamOnePlayers(String teamOnePlayers) {
		TeamOnePlayers = teamOnePlayers;
	}

	public String getTeamTwoPlayers() {
		return TeamTwoPlayers;
	}

	public void setTeamTwoPlayers(String teamTwoPlayers) {
		TeamTwoPlayers = teamTwoPlayers;
	}

	public String getUmpire1() {
		return Umpire1;
	}

	public void setUmpire1(String umpire1) {
		Umpire1 = umpire1;
	}

	public String getUmpire2() {
		return Umpire2;
	}

	public void setUmpire2(String umpire2) {
		Umpire2 = umpire2;
	}

	
}
