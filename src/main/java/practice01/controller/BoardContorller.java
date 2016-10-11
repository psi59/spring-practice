package practice01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import practice01.domain.Board;
import practice01.service.BoardService;

@Controller
@RequestMapping("/board/")
public class BoardContorller {

	@Autowired
	BoardService boardService;
	
	public BoardContorller() {	}
	
	@RequestMapping("getboard")
	public ModelAndView getBoard(){
		List<Board> boardList = boardService.getBoardList();
		return new ModelAndView("/index.jsp","board", boardList.get(0));
	}

}
