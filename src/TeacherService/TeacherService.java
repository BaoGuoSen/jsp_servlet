package TeacherService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Entity.Teacher;
import TeacherDao.TeacherDao;

public class TeacherService {
	public ArrayList<Teacher> getAllTeacher() throws IOException
	{
		TeacherDao Dao=new TeacherDao();
		return (ArrayList<Teacher>) Dao.getAllteacher();
	}
}
