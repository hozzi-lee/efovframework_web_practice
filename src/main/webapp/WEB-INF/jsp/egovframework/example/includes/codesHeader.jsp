<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<button type="button" onclick="location.href='${contextPath}/codes/codeList.do'">코드 목록</button>
<button type="button" onclick="location.href='${contextPath}/codes/codeWriteForm.do'">코드 등록</button>

<hr>
