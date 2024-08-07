package org.day3;

class Student{
	private String studentName;
	private String studentRollNo;
	private String studentId;
	
	
	
	
	
	public Student(String studentName, String studentRollNo, String studentId) {
		this.studentName=studentName;
		this.studentRollNo=studentRollNo;
		this.studentId=studentId;
		// TODO Auto-generated constructor stub
	}





	public String getStudentName() {
		return studentName;
	}





	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}





	public String getStudentRollNo() {
		return studentRollNo;
	}





	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}





	public String getStudentId() {
		return studentId;
	}





	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}






	
}

public class EncapulationTest {
	public static void main(String[] args) {
		Student student=new Student("Venky","123","101");
		System.out.println(student.getStudentId()+" "+student.getStudentName()+" "+student.getStudentRollNo());
		

	}

}
