<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<div align="center" class="div_center">
	<h3>게시판 글 수정 페이지</h3>
	<hr>
	
	
	<form action="update.board" method="post">
		<!-- 히든태그는 보여주고싶지 않은 데이터를 숨겨서 전송할때 쓴다. -->
		<input type="hidden" name="bno" value="${vo.bno }">
		
		<table border="1" width="500">
			<%--
				<tr>
				<td>글 번호</td>
				<td>${vo.bno }</td>
				</tr>
			 --%>
		
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer" value="${vo.writer }" readonly></td>
			</tr>
			<tr>
				<td>글 제목</td>
				<td><input type="text" name="title" value="${vo.title }"></td>
			</tr>
			<tr>
				<td>글 내용</td>
				<td>
					<textarea rows="10" style="width: 95%;" name="content">${vo.content }
					</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정 하기" onclick="">&nbsp;&nbsp;
					<input type="button" value="목록" onclick="location.href='list.board';">        
				</td>
			</tr>
			
		</table>
	</form>
	
</div>
<%@ include file="../include/footer.jsp"%>