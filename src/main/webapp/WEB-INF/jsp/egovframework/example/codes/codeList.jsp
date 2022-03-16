<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코드 목록</title>

<link rel="stylesheet" href="${contextPath}/css/egovframework/codes.css" />

</head>
<body>

	<c:import url="/WEB-INF/jsp/egovframework/example/includes/codesHeader.jsp" />

	<table>
	<colgroup>
	<col width="20%" />
	<col width="20%" />
	<col width="30%" />
	<col width="30%" />
	</colgroup>
	<caption>코드 목록</caption>
	<thead>
		<tr>
			<td colspan="4">Total: ${codeListMap.codeListCount}</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>코드<br>번호</th>
			<th>분류</th>
			<th>이름</th>
			<th>구분</th>
		</tr>
	</tbody>
	<c:set var="count" value="1" />
	<tfoot>
		<c:forEach items="${codeListMap.codeList}" var="codesVO">
		<tr align="center">
			<td><c:out value="${count}" /></td>
			<td>${codesVO.gidNo}</td>
			<td>${codesVO.codeName}</td>
			<td>
				<button type="button" onclick="fn_modify(${codesVO.codeNo})">수정</button>
				<button type="button" onclick="fn_delete(${codesVO.codeNo})">삭제</button>
			</td>
		</tr>
		<c:set var="count" value="${count + 1}" />
		</c:forEach>
	</tfoot>
	</table>
<%-- 			<c:choose> --%>
<%-- 				<c:when test="${codesVO.gidNo eq 1}"> --%>
<!-- 				<td>JOB(직업)</td> -->
<%-- 				</c:when> --%>
<%-- 				<c:otherwise> --%>
<!-- 				<td>HOBBY(취미)</td> -->
<%-- 				</c:otherwise> --%>
<%-- 			</c:choose> --%>
</body>

<script>

function fn_delete(codeNo) {
	if ( confirm('정말 삭제하시겠습니까?') ) {
		location.href = '${contextPath}/codes/codeDelete.do?codeNo=' + codeNo;
	}
}

function fn_modify(codeNo) {
	location.href='${contextPath}/codes/codeModifyForm.do?codeNo=' + codeNo;
}

</script>

</html>