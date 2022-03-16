<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 상세 정보</title>

<link rel="stylesheet" href="${contextPath}/css/egovframework/dept.css" />

</head>
<body>

	<c:import url="/WEB-INF/jsp/egovframework/example/includes/deptHeader.jsp" />

	<form action="${contextPath}/dept/deptWriteSave.do" method="post" name="frm">
		<table>
			<tr>
				<th>부서번호</th>
				<td>${deptDetail.deptNo}</td>
			</tr>
			<tr>
				<th>부서이름</th>
				<td>${deptDetail.deptName}</td>
			</tr>
			<tr>
				<th>부서위치</th>
				<td>${deptDetail.deptLoca}</td>
			</tr>
			<tr>
				<th colspan="2"><button type="button" onclick="location.href='${contextPath}/dept/deptModify.do?deptNo=${deptDetail.deptNo}'">수정</button>&nbsp;
				&nbsp;<button type="button" onclick="location.href='${contextPath}/dept/deptDelete.do?deptNo=${deptDetail.deptNo}'">삭제</button></th>
			</tr>
		</table>
	</form>
</body>
</html>