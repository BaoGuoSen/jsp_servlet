<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String id=(String)request.getAttribute("id");
	String name=(String)request.getAttribute("name");
	String school=(String)request.getAttribute("school");
	String major=(String)request.getAttribute("major");
	String grade=(String)request.getAttribute("grade");
	String sarry=(String)request.getAttribute("sarry");
	int page1=Integer.parseInt(request.getParameter("page"));
	int index=Integer.parseInt(request.getParameter("index"));
%>
	<form action="ChangeTeacher?page=<%=page1%>&&index=<%=index %>" method="post">
		<table>
			<tr>
			<td>ID：</td>
			<td ><input type="text"value="<%=id %>" name="id"></td>
			</tr>
			
			<tr>
			<td>姓名：</td>
			<td ><input type="text"value="<%=name %>" name="name"></td>
			</tr>
			
			<tr>
			<td>学院：</td>
			<td ><input type="text"value="<%=school %>" name="school"></td>
			</tr>
			
			<tr>
			<td>专业：</td>
			<td ><input type="text"value="<%=major %>" name="major"></td>
			</tr>
			
			<tr>
			<td>年级：</td>
			<td ><input type="text"value="<%=grade %>" name="grade"></td>
			</tr>
			
			<tr>
			<td>薪水：</td>
			<td ><input type="text"value="<%=sarry %>" name="sarry"></td>
			</tr>
			<tr>
			<td><input type="submit" id="save"value="确定" ></td>
			</tr>
			</table>
			</form>
</body>
</html>