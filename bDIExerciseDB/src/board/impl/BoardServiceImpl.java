package board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.BoardDao;
import board.BoardService;
import board.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	//@Qualifier("xxx")
	//@Resource(name="nnn")
	private BoardDao boardDAO;

	// 메소드오버라이딩
	@Override
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);		
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);		
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		BoardVO vo2 = boardDAO.getBoard(vo);
		return vo2;
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		List<BoardVO> bList = boardDAO.getBoardList(vo);
		return bList;
	}


	

}
