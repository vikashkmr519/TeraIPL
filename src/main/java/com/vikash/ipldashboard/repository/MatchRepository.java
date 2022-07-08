package com.vikash.ipldashboard.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikash.ipldashboard.model.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
	
	List<Match> getByTeam1OrTeam2OrderByDateDesc(String teamName1, String teamName2, Pageable pageable);

	default List<Match> findLastestMatchesByTeam(String teamName, int count){
		Pageable pageable = PageRequest.of(0,count);
		return getByTeam1OrTeam2OrderByDateDesc(teamName, teamName, pageable);
	}
}
