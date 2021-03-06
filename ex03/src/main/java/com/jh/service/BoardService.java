package com.jh.service;

import java.util.List;

import com.jh.domain.BoardVO;
import com.jh.domain.Criteria;
import com.jh.domain.ReplyPageDTO;


public interface BoardService {

	public void register(BoardVO board);

	public BoardVO get(Long bno);

	public boolean modify(BoardVO board);

	public boolean remove(Long bno);

	public List<BoardVO> getList(Criteria cri);

	public int getTotal(Criteria cri);
	
}
