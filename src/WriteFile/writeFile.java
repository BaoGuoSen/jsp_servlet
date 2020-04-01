package WriteFile;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Entity.Teacher;

public class writeFile{
	public static void main(String[] args) throws IOException {
		ArrayList<Teacher> list=new ArrayList<Teacher>();
		Teacher t1=new Teacher("11703080108","Jiang扒皮","会计学院","会计学","2016","3000");
		Teacher t2=new Teacher("11703080104","佐助","木叶村","千鸟","2012","5000");
		Teacher t3=new Teacher("11703080105","宁次","木叶村","回天","2019","9000");
		Teacher t4=new Teacher("11703080107","卡卡西","木叶村","写轮眼","2011","1000");
		Teacher t5=new Teacher("11703080111","雏田","计算机科学学院","物联网","2022","4000");
		Teacher t6=new Teacher("11703080132","包国森","人工智能学院","软件工程","2013","2000");
		Teacher t7=new Teacher("11703080134","阿卡丽","经济金融学院","大数据","2011","4000");
		Teacher t8=new Teacher("11703080122","德莱文","管理学院","软件工程","2014","5000");
		Teacher t9=new Teacher("11703080102","维嘉","人工智能学院","机器人开发","2031","2000");
		Teacher t10=new Teacher("11703080199","小智","人工智能学院","机器人开发","2011","2000");
		Teacher t11=new Teacher("11703080156","杀生丸","人工智能学院","机器人开发","2121","2000");
		Teacher t12=new Teacher("11703080122","烬","人工智能学院","机器人开发","2321","2000");
		Teacher t13=new Teacher("11703080402","劫","人工智能学院","机器人开发","2331","2000");
		Teacher t14=new Teacher("11703080502","古加斯","人工智能学院","机器人开发","2031","2000");
		Teacher t15=new Teacher("11703080322","faker","人工智能学院","机器人开发","2031","2000");
		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		list.add(t8);
		list.add(t9);
		list.add(t10);
		list.add(t11);
		list.add(t12);
		list.add(t13);
		list.add(t14);
		list.add(t15);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\samsung\\eclipse-workspace\\jsp_work1\\WebContent\\TeacherList.txt");
		ObjectOutputStream obj=new ObjectOutputStream(fos);
		obj.writeObject(list);
		obj.close();
	}
}
