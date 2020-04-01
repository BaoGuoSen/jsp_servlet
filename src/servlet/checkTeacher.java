package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Teacher;
import TeacherService.TeacherService;

/**
 * Servlet implementation class checkTeacher
 */
@WebServlet("/checkTeacher")
public class checkTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String index=request.getParameter("index");
		String flagString=request.getParameter("flag");
		Integer integer=Integer.parseInt(index);
		TeacherService teacher=new TeacherService();
		ArrayList<Teacher> list=teacher.getAllTeacher();
		Teacher checkTeacher=list.get(integer);
		String idString=checkTeacher.getId();
		String nameString=checkTeacher.getName();
		String schoolString=checkTeacher.getSchool();
		String majorString=checkTeacher.getMajor();
		String gradeString=checkTeacher.getGrade();
		String sarryString=checkTeacher.getSarry();
		String paString=request.getParameter("page");
		
		request.setAttribute("page", paString);
		request.setAttribute("id", idString);
		request.setAttribute("name", nameString);
		request.setAttribute("school", schoolString);
		request.setAttribute("major", majorString);
		request.setAttribute("grade", gradeString);
		request.setAttribute("sarry", sarryString);
		
		if(flagString.equals("1"))
		{
		request.getRequestDispatcher("check.jsp").forward(request, response);
		System.out.println(flagString);
		}
		if(flagString.equals("0"))
		{
			request.getRequestDispatcher("change.jsp?index="+integer).forward(request, response);
			System.out.println(flagString);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
