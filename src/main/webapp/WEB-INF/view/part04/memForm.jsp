<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>member data</p>
 <form name="frm" action="mem.htm" method="post"> <!-- submit이 일어나면 action에있는 url로 넘어간다~ -->
    <label for="fname">이름</label>
    <input type="text" name="name" id="fname" value="" /><br/>
    <label for="fage">나이</label>
    <input type="text" name="age" id="fage" value="" />
    <input type="submit" value="send" />
  </form>
</body>
</html>