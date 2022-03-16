<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<a href="${contextPath}/dept/deptList.do"><button>부서 목록 보기</button></a> &nbsp;&nbsp;
<a href="${contextPath}/dept/deptWrite.do"><button>부서 등록 하러 가기</button></a>

<hr>