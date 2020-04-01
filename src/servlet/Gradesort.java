package servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Teacher;
import TeacherService.TeacherService;

/**
 * Servlet implementation class Gradesort
 */
@WebServlet("/Gradesort")
public class Gradesort extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gradesort() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TeacherService teacher=new TeacherService();
		ArrayList<Teacher> list=teacher.getAllTeacher();
		Teacher tempTeacher;
	
		for(int i=0;i<list.size();i++)
			for(int j=0;j<=i;j++)
			{
				int a=Integer.parseInt(list.get(i).getGrade());
				int b=Integer.parseInt(list.get(j).getGrade());
				
				if(a<b)
				{
					
					tempTeacher=list.get(i);
					list.set(i, list.get(j));
					list.set(j, tempTeacher);	
				}
			}
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\samsung\\eclipse-workspace\\jsp_work1\\WebContent\\TeacherList.txt");
		ObjectOutputStream obj=new ObjectOutputStream(fos);
		obj.writeObject(list);
		
		obj.close();
		
		request.getRequestDispatcher("main.jsp?page=0").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
