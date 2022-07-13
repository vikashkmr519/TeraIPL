package com.vikash.ipldashboard.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vikash.ipldashboard.model.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
	
	List<Match> getByTeam1OrTeam2OrderByDateDesc(String teamName1, String teamName2, Pageable pageable);
	

	@Query(value ="select * from Match m where (m.team1 = :teamName or m.team2 =  :teamName ) and m.date between :dateStart  and :dateEnd order by m.date desc", nativeQuery= true)
	List<Match> getMatchesByTeamBetweenDates(@Param("teamName")String teamName,
			@Param("dateStart")LocalDate startDate, @Param("dateEnd")LocalDate endDate);


	default List<Match> findLastestMatchesByTeam(String teamName, int count){
		Pageable pageable = PageRequest.of(0,count);
		return getByTeam1OrTeam2OrderByDateDesc(teamName, teamName, pageable);
	}
}
