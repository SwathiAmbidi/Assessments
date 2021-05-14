package com.capg.stud.p1;

import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;


public class StudMain {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		System.out.println("1");
		
		Session session = factory.openSession();// jdbc -> coonection object
		
		
		
		StudMain obj = new StudMain();
		
		Courses c1 = obj.getCourses();
		Courses c2 = obj.getCourses();		
		Courses c3 = obj.getCourses();
		
		Student a1 = obj.getStudents();
		Student a2 = obj.getStudents();
		
		
		List<Student> listfor_stud1 = new ArrayList<Student>();
		listfor_stud1.add(a1);
		listfor_stud1.add(a2);
		
		
		List<Student> listfor_stud2 = new ArrayList<Student>();
		listfor_stud2.add(a1);
		listfor_stud2.add(a2);
		
		
		List<Student> listfor_stud3 = new ArrayList<Student>();
		listfor_stud3.add(a1);
		listfor_stud3.add(a2);
		
		
		List<Courses> listFor_course1 = new ArrayList<Courses>();
		listFor_course1.add(c1);
		listFor_course1.add(c2);
		listFor_course1.add(c3);
		
		List<Courses> listFor_course2 = new ArrayList<Courses>();
		listFor_course2.add(c1);
		listFor_course2.add(c2);
		listFor_course2.add(c3);
		
		List<Courses> listFor_course3 = new ArrayList<Courses>();
		listFor_course3.add(c1);
		listFor_course3.add(c2);
		//listFor_course1.add(c3);
		
		List<Courses> listFor_course4 = new ArrayList<Courses>();
		listFor_course4.add(c1);
		listFor_course4.add(c2);
		listFor_course4.add(c3);	
		
		c1.setStudents(listfor_stud1);
		c2.setStudents(listfor_stud2);
		c3.setStudents(listfor_stud3);
		
		a1.setCourses(listFor_course1);
		a2.setCourses(listFor_course2);
		
		Transaction t = session.beginTransaction();
		
		session.save(c1); 
		session.save(c2); 
		session.save(c3); 
		
		session.save(a1); 
		session.save(a2); 
		
		
		Student a = new Student();
		a.setStudentName("Raja");
		a.setMarks(85);
		
		certifications c = new certifications();
		c.setCertificateId(10);
		c.setCertificateName("ML-Hackathon");
		
		certifications cc = new certifications();
		cc.setCertificateId(111);
		cc.setCertificateName("kho-kho");
		a.setCertification(c);
		a.setNontechnical(cc);
		session.save(a); 
		
		
		/*Criteria cr = session.createCriteria(Student.class);
		cr.addOrder(Order.asc("marks"));
		List l = cr.list();
		System.out.println(l);
		a = (Student)session.get(Student.class,6);
		//System.out.println(a);
	 
		Student aa = new Student();
		aa = (Student)session.get(Student.class,3);
		System.out.println(aa);*/
		
		System.out.println("  -->> Data Saved ..");
		t.commit();
	
		session.close();
		System.out.println("All Done");
	}

	public Courses getCourses() {
		Courses co = new Courses();
		System.out.println("Enter course name");
		co.setCourseName(new Scanner(System.in).nextLine());
		
		System.out.println("Enter active count");
		co.setNoOfStudents(new Scanner(System.in).nextInt());
		
		return co;
	}
	
	public Student getStudents() {
		Student st = new Student();
		System.out.println("Enter student name");
		st.setStudentName(new Scanner(System.in).nextLine());
		System.out.println("Enter marks");
		st.setMarks(Integer.parseInt(new Scanner(System.in).nextLine()));
		for(int i=1; i<=2; i++){
		certifications c = new certifications();
		System.out.println("Enter 1 for techical\n2 for non technical\n3 to exit");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Enter certificate id");
		int id = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.println("Enter certificate Name");
		String name = new Scanner(System.in).nextLine();
		c.setCertificateId(id);
		c.setCertificateName(name);
		if(n==1) {
			st.setCertification(c);
		}
		else {
			st.setNontechnical(c);
		}
		}
		return st;
	}
}













