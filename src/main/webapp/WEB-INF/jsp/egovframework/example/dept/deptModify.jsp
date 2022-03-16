<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 정보 수정</title>

<link rel="stylesheet" href="${contextPath}/css/egovframework/dept.css" />

</head>
<body>

	<c:import url="/WEB-INF/jsp/egovframework/example/includes/deptHeader.jsp" />

	<form action="${contextPath}/dept/deptUpdate.do" method="get" name="frm">
		<table>
			<tr>
				<th>부서번호</th>
				<td><input type="text" name="deptNo" value="${deptModifyInfo.deptNo}" style="border: none;" readonly></td>
			</tr>
			<tr>
				<th>부서이름</th>
				<td><input type="text" name="deptName" value="${deptModifyInfo.deptName}"></td>
			</tr>
			<tr>
				<th>부서위치</th>
				<td><input type="text" name="deptLoca" value="${deptModifyInfo.deptLoca}"></td>
			</tr>
			<tr>
				<th colspan="2"><button type="submit">수정완료</button>
			</tr>
		</table>
	</form>

</body>
</html>