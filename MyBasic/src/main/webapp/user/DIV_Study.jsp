<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
p{
align-items:center;
 /* text-align: center; */

}
html, body {
	width: 100%;
	height: 100%;
	margin: 0;
	
	
}

.container {
	width: 100vw;
	height: 100vh;
	background: pink;
	
	  display : flex;
    justify-content : center;
    align-items : center;

}
.fuck2 {
	width: 1200px;
	height:800px;
	background: tomato;
	border: 1px solid white;
    border-radius: 50px;
    /* padding: 10px 30px; */ /* 더커짐 */
    box-shadow: 5px 5px 5px 5px gray;
    
    
    
    display : flex;
    justify-content : space-evenly;
    align-items : center;
    
    	
}
.fuck3 {
	width:300px;
	height:200px;
	background: white;
	border: 2px solid black;
	border-radius: 50px;
	box-shadow: 5px 5px 5px 5px gray;
	
	display : flex;
    justify-content : center;
    align-items : center;


}
</style>
</head>


<body>

	<div class="container">
		<div class="fuck2">
			<div class="fuck3">안녕하세요1</div>
			<div class="fuck3">안녕하세요2</div>
			<div class="fuck3">안녕하세요3</div>			
			
		</div>
	</div>
	
</body>
</html>