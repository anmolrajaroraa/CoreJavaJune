package oops;

public class Subject {
	private String subjectName;
	private String teacherName;
	private byte marks;
	private byte attendance;
	
	public Subject(String subjectName, String teacherName, int marks, int attendance) {
		this.subjectName = subjectName;
		this.teacherName = teacherName;
		this.marks = (byte) marks;
		this.attendance = (byte) attendance;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public byte getMarks() {
		return marks;
	}
	public void setMarks(byte marks) {
		this.marks = marks;
	}
	public byte getAttendance() {
		return attendance;
	}
	public void setAttendance(byte attendance) {
		this.attendance = attendance;
	}

	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", teacherName=" + teacherName + ", marks=" + marks
				+ ", attendance=" + attendance + "]";
	}
	
}
