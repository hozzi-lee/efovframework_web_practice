<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코드 등록</title>

<link rel="stylesheet" href="${contextPath}/css/egovframework/codes.css" />

</head>
<body>

	<c:import url="/WEB-INF/jsp/egovframework/example/includes/codesHeader.jsp" />

	<form action="${contextPath}/codes/codeWrite.do" method="post" name="frm">
	<table>
		<tr>
			<th>분류</th>
			<td>
				<select name="gidNo">
					<option value="1">Job(업무)</option>
					<option value="2">Hobby(취미)</option>
				</select>
			</td>
		</tr>
		<tr>
			<th>코드명</th>
			<td><input type="text" name="codeName"></td>
		</tr>
		<tr>
			<th colspan="2"><button type="submit" onclick="fn_submit(); return false;">등록</button><button type="reset">초기화</button></th>
		</tr>
	</table>
	</form>

</body>

<script>

function fn_submit() {
	var frm = document.getElementsByName('frm');
	var codeName = document.getElementsByName('codeName');
	
	if(codeName[0].value == '') {
		alert('코드명을 입력해주세요');
		codeName[0].focus();
		return false;
	}
	frm.submit();
}

</script>

</html>