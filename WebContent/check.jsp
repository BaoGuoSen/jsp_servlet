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
%>
	<form action="changepage?page=<%=page1%>" method="post">
		<table>
			<tr>
			<td>ID：</td>
			<td><%=id %></td>
			</tr>
			
			<tr>
			<td>姓名：</td>
			<td><%=name %></td>
			</tr>
			
			<tr>
			<td>学院：</td>
			<td><%=school %></td>
			</tr>
			
			<tr>
			<td>专业：</td>
			<td><%=major %></td>
			</tr>
			
			<tr>
			<td>年级：</td>
			<td><%=grade %></td>
			</tr>
			
			<tr>
			<td>薪水：</td>
			<td><%=sarry %></td>
			</tr>
			<tr>
			<td><input type="submit" id="save"value="确定" ></td>
			</tr>
			</table>
			</form>
</body>
</html>