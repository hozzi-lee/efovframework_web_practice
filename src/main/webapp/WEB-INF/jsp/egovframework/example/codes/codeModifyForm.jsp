<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코드 수정 폼</title>

<link rel="stylesheet" href="${contextPath}/css/egovframework/codes.css" />

</head>
<body>

	<c:import url="/WEB-INF/jsp/egovframework/example/includes/codesHeader.jsp" />
	
	<form action="${contextPath}/codes/codeUpdate.do" method="post" name="frm">
	<input type="hidden" name="codeNo" value="${codeDetail.codeNo}">
	<table>
		<tr>
			<th>분류</th>
			<td>
				<select name="gidNo">
				<c:choose>
				<c:when test="${codeDetail.gidNo eq 1}">
					<option value="1" selected="selected">Job(업무)</option>
					<option value="2">Hobby(취미)</option>
				</c:when>
				<c:otherwise>
					<option value="1">Job(업무)</option>
					<option value="2" selected="selected">Hobby(취미)</option>
				</c:otherwise>
				</c:choose>
				</select>
			</td>
		</tr>
		<tr>
			<th>코드명</th>
			<td><input type="text" name="codeName" value="${codeDetail.codeName}"></td>
		</tr>
		<tr>
			<th colspan="2"><button type="submit" onclick="fn_modifyCheck()">수정</button></th>
		</tr>
	</table>
	</form>

</body>

<script>

function fn_modifyCheck() {
	if ( confirm('수정 하시겠습니까?') ) {
		
	} else {
		event.preventDefault();
	}
}

</script>

</html>