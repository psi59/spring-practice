package practice01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practice01.dao.BoardDao;
import practice01.domain.Board;
import practice01.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao boardDao;
	
	public BoardServiceImpl() {	}

	@Override
	public List<Board> getBoardList() {
		return boardDao.selectBoardList();
	}

}
