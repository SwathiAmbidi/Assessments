package com.capg.stud.p1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Courses")
public class Courses {
	
	@Id
	private String courseName;
	private int noOfStudents;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name = "Courses_selected",
			joinColumns = @JoinColumn(name = "Courses"),
			inverseJoinColumns = @JoinColumn(name = "stud_ID"))
	private List<Student> students;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
