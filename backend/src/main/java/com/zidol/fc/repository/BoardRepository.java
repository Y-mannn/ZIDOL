package com.zidol.fc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zidol.fc.domain.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
	
	public Board findByBoardCode(String boardCode);
}
