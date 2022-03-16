<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 목록</title>

<link rel="stylesheet" href="${contextPath}/css/egovframework/dept.css" />

</head>
<body>

	<c:import url="/WEB-INF/jsp/egovframework/example/includes/deptHeader.jsp" />

	<table>
		<caption>부서목록</caption>
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서위치</th>
		</tr>
		<c:forEach items="${deptList}" var="deptVO">
		<tr>
			<td>${deptVO.deptNo}</td>
			<td><a href="${contextPath}/dept/deptDetail.do?deptNo=${deptVO.deptNo}">${deptVO.deptName}</a></td>
			<td>${deptVO.deptLoca}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>