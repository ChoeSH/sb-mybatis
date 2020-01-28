<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="/static/js/jquery-3.4.1.js"></script>
<script src="/static/js/bootstrap.min.js"></script>
<script src="/static/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" type="text/css" href="static/css/bootstrap.min.css"/>
<title>Insert title here</title>
</head>
<style>
table{
top:30%;
left:40%;
position: absolute;
margin:0 auto;
}
</style>
<body>
<table border="1">
<tr>
<th>이름</th>
<td><input name="tiName" id="tiName" type="text" maxlength="100"/></td>
</tr>
<tr>
<th>주소</th>
<td><input name="tiAddr" id="tiAddr" type="text" maxlength="200"/></td>
</tr>
<tr>
<th>비고</th>
<td><textarea name="tiEtc" id="tiEtc" maxlength="1000"></textarea></td>
</tr>
<tr>
<td colspan="2" align='center'><button id="insert">입력</button></td>
</tr>
</table>
<script>
$(document).ready(function(){
	$('#insert').on('click',function(){
		if($('#tiName').val().trim().length<2){
			alert('이름은 2글자 이상입니다.');
			return false;
		}
		if($('#tiAddr').val().trim().length<10){
			alert('주소는 10글자 이상입니다.');
			return false;
		}
		var param = 'tiName=' + $('#tiName').val();
		param += '&tiAddr=' + $('#tiAddr').val();
		param += '&tiEtc=' + $('#tiEtc').val();
		$.ajax({
			url:'/insert',
			method:'POST',
			data:param,
			success:function(res){
				param = JSON.stringify(param);
				console.log(res);
				alert('성공');
			},
			error:function(){
				alert(error);
			}
		})
	})
});
</script>
</body>
</html>