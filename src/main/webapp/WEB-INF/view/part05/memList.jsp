<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:태그 쓰기위해서 코어등록(jstl) 커스텀태그-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="memInsert.htm">글쓰기</a>

	<!-- c:foreach는 반복문!! -items!! -->
	<c:forEach items="${aList}" var="toto">
		<!-- ModelAndView로 받아온 aList를써준다! -->
		<p>${toto.num}/ ${toto.name} / ${toto.age} / ${toto.loc}</p>
	</c:forEach>

</body>
</html>