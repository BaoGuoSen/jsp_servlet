package TeacherDao;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Entity.Teacher;

public class TeacherDao {
	
	ArrayList<Teacher> teachers=new ArrayList<Teacher>();
	public List<Teacher> getAllteacher() throws IOException
	{
		 ArrayList<Teacher> teachers=new ArrayList<Teacher>();
		FileInputStream fos=new FileInputStream("C:\\Users\\samsung\\eclipse-workspace\\jsp_work1\\WebContent\\TeacherList.txt");
		ObjectInputStream obj=new ObjectInputStream(fos);
		try {
			teachers=(ArrayList<Teacher>) obj.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teachers;
	}
}
