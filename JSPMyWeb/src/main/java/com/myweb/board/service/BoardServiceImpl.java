package com.myweb.board.service;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myweb.board.model.BoardDAO;
import com.myweb.board.model.BoardVO;
import com.myweb.user.model.UserVO;

public class BoardServiceImpl implements BoardService {

	private BoardDAO dao = BoardDAO.getInstance();

	@Override
	public void regist(HttpServletRequest request, HttpServletResponse response) {

		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		dao.insert(writer, title, content);

	}

	@Override
	public ArrayList<BoardVO> getList(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<BoardVO> list = dao.getList();

		return list;
	}

	@Override
	public BoardVO getContent(HttpServletRequest request, HttpServletResponse response) {
		
		String bno = request.getParameter("bno");
		System.out.println(bno);
		BoardVO vo = dao.getContent(bno);
		return vo;
	}

	@Override
	public int update(HttpServletRequest request, HttpServletResponse response) {
		String bno = request.getParameter("bno");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
			
		int result = dao.update(bno, title, content);
		
		
		return result;
	}

	@Override
	public void delete(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String bno = request.getParameter("bno");
		dao.delete(bno);
		
	}

	@Override
	public void hitUpdate(HttpServletRequest request, HttpServletResponse response) {
		//쿠키 or 세션을 사용해서 조회수 중복을 막는다.
		//Cokkie coo = new Cookie(키,값)
		//coo.setMaxAge(30)
		//response.addCookie(coo);
		String bno = request.getParameter("bno");
		String cooValue = "";
		boolean flag = true; //if 문의 실행여부 확인
		
		//기존쿠기가 있었는지 확인
		Cookie[] arr = request.getCookies();
		
		if(arr != null) {
			for(Cookie c : arr) {
				
				if(c.getName().equals("hit")) {//hit 쿠키가 있다!
					cooValue = c.getValue(); //쿠키의 값을 저장
					
					if(c.getValue().contains(bno)) {
						System.out.println(true);
						flag = false;
					}
					
					
				}
			}
			
		}
		
		if(flag) { //if 문 실행 안하면
			dao.hitUpdate(bno);
			cooValue += bno + "-";
			
		}
		Cookie coo = new Cookie("hit", cooValue);
		coo.setMaxAge(30);
		response.addCookie(coo);
		
	}
	

}
