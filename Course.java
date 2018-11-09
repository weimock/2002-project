package schoolsystem;

import java.util.ArrayList; 
import java.io.*; 
import java.util.Scanner;
import java.util.List; 
import java.util.StringTokenizer; 

public class Course {
	
	int courseID; 
	int courseVacancy; 
	String courseName;
	String courseType; 
	String courseCoordi; 
	public ArrayList<Assessment> assessmentList = new ArrayList<Assessment>();
	
	public void addAssessment (int weightage, String name, boolean coursework) {
		Assessment assessment = new Assessment(weightage, name, coursework);
		
	}
	
	//private ArrayList<Student> studentList = new ArrayList<Student>; 
	
	public Course (int courseID, String courseName, String courseType, String courseCoordi, int courseVacancy)
	{
		this.courseID = courseID; 
		this.courseName = courseName; 
		this.courseType = courseType; 
		this.courseCoordi = courseCoordi; 
		this.courseVacancy = courseVacancy; 
	}
	
	//For Course ID 
	public int getCourseID()
	{
		return courseID; 
	}
	
	public void setCourseID(int courseID)
	{
		this.courseID = courseID; 
	}
		
	
	//For Course Name 
	public String getCourseName()
	{
		return courseName; 
	}
			
	public void setCourseName(String courseName)
	{
		this.courseName = courseName; 
	}
	
	
	//For Course Type 
	public String getCourseType()
	{
		return courseType; 
	}
	
	public void setCourseType(String courseType)
	{
		this.courseType = courseType; 
	}
	
	
	//For Course Coordinator 
	public String getCourseCoordi()
	{
		return courseCoordi; 
	}
	
	public void setCourseCoordi(String courseCoordi)
	{
		this.courseCoordi = courseCoordi; 
	}
	
	
	//For Course Vacancy 
	public int getcourseVacancy()
	{
		return courseVacancy; 
	}
	
	public void setcourseVacancy(int courseVacancy)
	{
		this.courseVacancy = courseVacancy; 
	}
	
	//For adding of Exam marks 
	public double addExam()
	{
		return 0;
		
	}
	
	//For adding of Coursework marks 	
	public double addCoursework()
	{
		return 0;
		
	}
	

	
}


