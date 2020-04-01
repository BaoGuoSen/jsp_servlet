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
 * Servlet implementation class changepage
 */
@WebServlet("/changepage")
public class changepage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public changepage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nowpage=request.getParameter("page");
		int page=Integer.parseInt(nowpage);
		TeacherService teacher=new TeacherService();
		ArrayList<Teacher> list=teacher.getAllTeacher();
		int totalpage=list.size()/10;

		//页码判断
		if(page>=totalpage)
		{
		System.out.println("已经是最后一页");
		request.setAttribute("page", totalpage);
		
		request.getRequestDispatcher("main.jsp?page="+totalpage).forward(request, response);
		}
		if(page<0)
		{
			System.out.println("当前页面是第一页");
			request.getRequestDispatcher("main.jsp?page=0").forward(request, response);
		}
		if(page>=0&&page<totalpage)
		{
			request.setAttribute("page", page);
			request.getRequestDispatcher("main.jsp").forward(request, response);
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
