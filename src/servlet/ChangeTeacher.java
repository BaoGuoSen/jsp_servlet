package servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Teacher;
import TeacherService.TeacherService;

/**
 * Servlet implementation class ChangeTeacher
 */
@WebServlet("/ChangeTeacher")
public class ChangeTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString=request.getParameter("id");
		String nameString=request.getParameter("name");
		String schoolString =request.getParameter("school");
		String majorString=request.getParameter("major");
		String gradeString=request.getParameter("grade");
		String sarryString=request.getParameter("sarry");
		
		String nowpage=request.getParameter("page");
		int page=Integer.parseInt(nowpage);
		
		String indexString=request.getParameter("index");
		int index=Integer.parseInt(indexString);
		
		TeacherService teacherService=new TeacherService();
		ArrayList<Teacher> list=teacherService.getAllTeacher();
		Teacher teacher=list.get(index);
		
		teacher.setId(idString);
		teacher.setName(nameString);
		teacher.setSchool(schoolString);
		teacher.setMajor(majorString);
		teacher.setGrade(gradeString);
		teacher.setSarry(sarryString);
		
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\samsung\\eclipse-workspace\\jsp_work1\\WebContent\\TeacherList.txt");
		ObjectOutputStream obj=new ObjectOutputStream(fos);
		obj.writeObject(list);
		obj.close();
		request.getRequestDispatcher("main.jsp?page="+page).forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//解决中文乱码
				response.setContentType("text/html;charset=utf-8");
				request.setCharacterEncoding("utf-8");
				response.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
