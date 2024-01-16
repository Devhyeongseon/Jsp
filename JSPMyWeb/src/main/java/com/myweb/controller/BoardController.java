package com.myweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardVO;
import com.myweb.board.service.BoardService;
import com.myweb.board.service.BoardServiceImpl;

@WebServlet("*.board")///
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doAction(request, response);///

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);///
	}

	protected void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 3. url 주소를 분기(각 요청별로 코드를 만듬)

		request.setCharacterEncoding("utf-8");// 한글처리

		String uri = request.getRequestURI();
		String path = uri.substring(request.getContextPath().length());

		System.out.println(path);
		
		////////////////////////////////////////////
		BoardService service = new BoardServiceImpl();
				
		
		
		if(path.equals("/board/list.board")) {//목록화면
			
			//목록데이터를 가지고 화면으로 이동
			ArrayList<BoardVO> list = service.getList(request, response);
			request.setAttribute("list", list);	
			request.getRequestDispatcher("board_list.jsp").forward(request, response);
			
			
		} else if(path.equals("/board/write.board")) {//글쓰기 화면
			
			request.getRequestDispatcher("board_write.jsp").forward(request, response);
		
		} else if(path.equals("/board/registForm.board")) {//글 등록.
			
			service.regist(request, response);
			//MVC2에서는 redirect를 다시 컨트롤러 연결하는 형태로 사용
			response.sendRedirect("list.board");
			
		}else if (path.equals("/board/content.board")){
			
			service.hitUpdate(request, response);//조회수
			BoardVO vo = service.getContent(request, response);
			request.setAttribute("vo", vo);
			
			request.getRequestDispatcher("board_content.jsp").forward(request, response);
		}else if (path.equals("/board/modify.board")) {
			/*
			 * 1.화면에서는 필요한 값을 넘겨주세요
			 * 2.getContent 메서드를 재활용합니다.
			 * 3. 포워드방식으로 board_modify.jsp로 이동
			 * 4.화면에 수정할 데이터를 미리보여주면된다.
			 */
			BoardVO vo = service.getContent(request, response);
			request.setAttribute("vo", vo);
			request.getRequestDispatcher("board_modify.jsp").forward(request, response);
					
		} else if (path.equals("/board/update.board")) {
			
			/*
			 * 1. service, dao에 update(매개값)을 생성하세요
			 * 2. update() 메서드에서는 sql 문으로 수정을 진행
			 * 3. 성공실패 여부는 정수형으로 반환
			 * 4. 컨트롤러에서는 성공시에 상세화면 redirect,
			 * 		실패시에는 수정화면으로 redirect
			 */
			int result = service.update(request, response);
			
			if(result == 1) {
				//out 객체
				response.sendRedirect("content.board?bno=" + request.getParameter("bno"));
			}else {
				response.sendRedirect("modify.board?bno=" + request.getParameter("bno"));
			}
			
			
		}else if( path.equals("/board/delete.board")) { //삭제기능
			service.delete(request, response);
			response.sendRedirect("list.board"); //목록으로 이동
			
		}
		
	}

}
