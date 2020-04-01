<%@page import="org.eclipse.jdt.internal.compiler.ast.ThisReference"%>
<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@page import="Entity.Teacher"%>
<%@page import="java.util.ArrayList"%>
<%@page import="TeacherService.TeacherService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/main.css" charset="utf-8"/>
<script type="text/javascript">
function getpage() {
	var page=document.getElementById("getpage").value-1;
	window.location.href="changepage?page="+page;	
}

function Delete(){
	
	var check=document.getElementsByName("check");
	for(var i=0;i<check.length;i++)
		{
			if(check[i].checked==true)
				{
				window.location.href="DeleteServlet?index="+check[i].value;
				}
		}
}

function DeleteAll()
{
	window.location.href="DeleteAll";
	}

</script>
</head>
<body>

	<% TeacherService teacher=new TeacherService();
		ArrayList<Teacher> list=teacher.getAllTeacher();
	%>
	<% int nowpage=Integer.parseInt(request.getParameter("page"));
				 int i=1+nowpage*10; %>
	
	
	<div class="wrapper">
		<div class="top">
			<hr id="leftpart" style="border: 0; background-color: #c3a080">
			<span id="centerpart">教师信息管理系统</span>
			<hr id="rightpart" style="border: 0; background-color: #c3a080">
			<br> <br> <br> &nbsp;&nbsp;
			<button
				style="background-color: #5cb85c; color: white; width: 96px; height: 40px"
				onclick="window.location.href='AddTeacher.jsp'">新增</button>
			<button
				style="background-color: #d9534f; color: white; width: 96px; height: 40px"
				onclick="Delete()">删除</button>
			<button
				style="background-color: blue; color: white; width: 96px; height: 40px" onclick="javascript:window.location.href='Idsort'">按ID排序</button>
			<button
				style="background-color: yellow; color: white; width: 96px; height: 40px" onclick="javascript:window.location.href='Gradesort'">按年级排序</button>
		</div>
		
		<div class="middle">
			<table cellspacing="0" id="table">
			
				<tr
					style="height: 53px; width: 1200px; font-weight: bold; text-align: center">
					<td><input type="checkbox" name="all" onclick="checkALL()"></td>
					<td>序号</td>
					<td>ID</td>
					<td>姓名</td>
					<td style="width: 300px">学院</td>
					<td>专业</td>
					<td>年级</td>
					<td>薪水</td>
					<td>操作</td>
				</tr>
				<!十行数据>
				
			<%		for(int j=nowpage*10;j<list.size();j++) {%>
					
					<tr style="height: 39px; width: 1229px;">
					<td><input type="checkbox" name="check" value="<%=j%>"></td>
					<td ><%=i %></td>
					<td name="<%=j %>"><%=list.get(j).getId() %></td>
					<td ><%=list.get(j).getName() %></td>
					<td ><%=list.get(j).getSchool() %></td>
					<td ><%=list.get(j).getMajor() %></td>
					<td ><%=list.get(j).getGrade() %></td>
					<td ><%=list.get(j).getSarry() %></td>
				<% if(i%2!=0){%>	
					<td><button id="button1" type="button"
							style="color: red; border-style: none; background-color:#ffffff ;"
							onclick="javascript:window.location.href='checkTeacher?index=<%=j%>&&page=<%=nowpage%>&&flag=1'">查看</button>
						<button id="button2" type="button"
							style="color: red; border-style: none; background-color: #ffffff;"
							onclick="javascript:window.location.href='checkTeacher?index=<%=j%>&&page=<%=nowpage%>&&flag=0'">修改</button></td>
						<%} %>	
				<% if(i%2==0) {%>
							
					<td><button id="button3" type="button"
							style="color: red; border-style: none; background-color: #dadee1;"
							onclick="javascript:window.location.href='checkTeacher?index=<%=j%>&&page=<%=nowpage%>&&flag=1'">查看</button>
						<button id="button4" type="button"
							style="color: red; border-style: none; background-color:#dadee1;"
							onclick="javascript:window.location.href='checkTeacher?index=<%=j%>&&page=<%=nowpage%>&&flag=0'">修改</button></td>
							<% }%>
				</tr>
				<% if(nowpage==0 && list.size()>10 &&j==9) break;%>
				<% if(nowpage==1 && list.size()>20 &&j==19) break;%>
				<% i++; %>
				<% }%>
			
			</table>
		</div>

		<div class="down">
			<% out.println("第"+(nowpage+1)+"页,共"+list.size()+"条"+",（每页显示10条)"); %>&emsp;&emsp;&emsp;
			
			<input type="text"  id="getpage">			
			
			
			<button style="background-color:#dadee1" onclick="getpage()">跳转</button>
			&emsp;<button style="background-color:#dadee1" onclick="DeleteAll()">全部删除</button>
			<br> <label
				style="position: relative; left: 1016px;">
				<button
					style="background-color: #5cb85c; color: white; width: 96px; height: 40px"
					onclick="javascript:window.location.href='changepage?page=<%=nowpage-1%>'">上一页</button></label>
					
				 <label
				style="position: relative; left: 1016px;"><button
					style="background-color: #d9534f; color: white; width: 96px; height: 40px"
					onclick="javascript:window.location.href='changepage?page=<%=nowpage+1%>'">下一页</button></label>					
			
		</div>

	</div>
</body>
</html>