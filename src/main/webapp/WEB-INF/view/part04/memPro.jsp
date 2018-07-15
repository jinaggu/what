<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
p{
  text-align: center;
  color: blue;
}
</style>
</head>
<body>
<p>member data</p>
<p>이름:${name}</p>
<p>나이:${age}</p>
<hr/>
<p>이름 :${memDTO.name}</p>
<p>나이 :${memDTO.age}</p>
<hr/>
<p>${dd.name}</p>
<p>${dd.age}</p>
</body>
</html>