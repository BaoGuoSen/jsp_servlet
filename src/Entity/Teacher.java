package Entity;

import java.io.Serializable;

public class Teacher implements Serializable//可序列化
{
	private String id;
	private String name;
	private String school;
	private String major;
	private String grade;
	private String sarry;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSarry() {
		return sarry;
	}
	public void setSarry(String sarry) {
		this.sarry = sarry;
	}
	public Teacher(String id, String name, String school, String major, String grade, String sarry) {
		super();
		this.id = id;
		this.name = name;
		this.school = school;
		this.major = major;
		this.grade = grade;
		this.sarry = sarry;
	}
	
}
