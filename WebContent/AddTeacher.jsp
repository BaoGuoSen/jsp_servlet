<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" >
		
		 function checklegal()
		{
			 	var id=document.getElementById("id").value;
				var name=document.getElementById("name").value;
				var school=document.getElementById("school").value;
				var major=document.getElementById("major").value;
				var grade=document.getElementById("grade").value;
				var sarry=document.getElementById("sarry").value;
			checkid();
			checkname();
			checkschool();
			checkmajor();
			checkgrade();
			checksarry();
		}
		 function checkid()
		{
			if(id==null)
				alert("请输入ID");
		}
		 function checkname()
		{
			if(name==null)
				alert("请输入姓名");
		}
		 function checkschool()
		{
			if(school==null)
				alert("请输入学校");
		}
		function checkmajor()
		{
			if(major==null)
				alert("请输入专业");
		}
		 function checkgrade()
		{
			if(grade==null)
				alert("请输入年级");
		}
	 	 function checksarry()
		{
			if(sarry==null)
				alert("请输入工资");
		}
		</script>
</head>
<body>
	<div>
	
	<form action="AddTeacherServlet" method="post">
		<table>
			<tr>
			<td>请输入ID：</td>
			<td><input type="text" name="id" id="id1"></td>
			</tr>
			
			<tr>
			<td>请输入姓名：</td>
			<td><input type="text" name="name" id="name1"></td>
			</tr>
			
			<tr>
			<td>请输入学院：</td>
			<td><input type="text" name="school" id="school1"></td>
			</tr>
			
			<tr>
			<td>请输入专业：</td>
			<td><input type="text" name="major" id="major1"></td>
			</tr>
			
			<tr>
			<td>请输入年级：</td>
			<td><input type="text" name="grade" id="grade1"></td>
			</tr>
			
			<tr>
			<td>请输入薪水：</td>
			<td><input type="text" name="sarry" id="sarry1"></td>
			</tr>
			
			<tr>
			<td><input type="submit" id="save"value="保存" onclick="checklegal()"></td>
			<td><input type="submit" id="cancel"value="取消"></td>
			</tr>
		</table>
		</form>
		
	</div>
</body>
</html>