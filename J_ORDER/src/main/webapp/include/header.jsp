
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">



<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
body, html {
	margin: 0;
	padding: 0;
	display: flex;
	align-items: center;
	justify-content: center;
	width: 100vw;
	height: 100vh;
	background-size: cover;
	background-repeat: no-repeat;
	background-position: center/no-repeat;
	background-color: white;
}

.custom-box {
	position: center;
	width: 1280px;
	height: 720px;
	background: url('img/bg.png') center;
	
	border: 1px solid #000000;
	
}

.brand {
	position: fixed;
	top: 5px;
	left: 50%;
	transform: translateX(-50%);
	background-color: color: #fff;
	padding: 10px;
	width: 500px; /* 필요에 따라 너비를 조절하세요. */
	text-align: center;
	font-size: 50px;
	margin-top: 140px;
}

.login-container {
	position: fixed;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	background-color: rgba(255, 255, 255, 0.8); /* 투명한 백그라운드 색상 */
	padding: 20px;
	text-align: center;
}

.login-form {
	max-width: 300px;
	margin: 0 auto;
}

.login-form input {
	width: 100%;
	padding: 10px;
	margin-bottom: 10px;
	box-sizing: border-box;
}

.login-form button {
	width: 100%;
	padding: 10px;
	background-color: #3498db;
	color: #fff;
	border: none;
	cursor: pointer;
}

.login-form button:hover {
	background-color: #2980b9;
}

.signup-button {
	display: inline-block;
	margin-top: 10px;
	color: #3498db;
	text-decoration: none;
}




</style>
<title>제이오더 입니다.</title>
</head>
<body>

	<div class="brand">J-Order</div>  
	<div class="custom-box">J-Order</div>


