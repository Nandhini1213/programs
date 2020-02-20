package laan;

public class Student {
	int id;
	String Name;
	String course;
	String branch;
	Address add;
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", course=" + course + ", branch=" + branch + ", add=" + add
				+ "]";
	}
	
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}
