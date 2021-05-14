package com.capg.stud.p1;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity   
@Table(name = "MyStudents")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rollNumber")
	private int rollId;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "Courses_selected",
			joinColumns = @JoinColumn(name = "stud_ID"),
			inverseJoinColumns = @JoinColumn(name = "Courses"))
	private List<Courses> courses;


	@Column(name=" StudentName")
	private String studentName;
	
	@Column(name = "Marks")
	private int marks;
	

	@Override
	public String toString() {
		return "Student [rollId=" + rollId + ", courses=" + courses + ", studentName=" + studentName + ", marks="
				+ marks + ", certification=" + certification + ", nontechnical=" + nontechnical + "]";
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public certifications getCertification() {
		return certification;
	}


	public void setCertification(certifications certification) {
		this.certification = certification;
	}


	@Embedded
	private certifications certification;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "certificateId", column = @Column(name="NonTechCertificateId")),
		@AttributeOverride(name = "certificateName", column = @Column(name="NonTechCertificateName")),
		
	})
	private certifications nontechnical;
	
	public certifications getNontechnical() {
		return nontechnical;
	}


	public void setNontechnical(certifications nontechnical) {
		this.nontechnical = nontechnical;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Courses> getCourses() {
		return courses;
	}
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	public int getRollId() {
		return rollId;
	}


	public void setRollId(int rollId) {
		this.rollId = rollId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
