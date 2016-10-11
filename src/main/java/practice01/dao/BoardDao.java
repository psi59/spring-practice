package practice01.dao;

import java.util.List;

import practice01.domain.Board;

public interface BoardDao {
	public List<Board> selectBoardList();
}
