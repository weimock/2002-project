package schoolsystem;

public class Score {
	private Student student;
	private int marks;
	
	public Score (Student student, int marks) {
		this.student = student;
		this.marks = marks;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public int getMarks() {
		return marks;
	}
}
