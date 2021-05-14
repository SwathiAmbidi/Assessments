package com.capg.jpa.p1;

import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.TimeZone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		System.out.println("1");
		
		Session session = factory.openSession();// jdbc -> coonection object
		Transaction t = session.beginTransaction();
		
		// ---- write code for data base operation ----
		
		
		//-------loading the employee object with id 101
		
	/*	@SuppressWarnings("deprecation")
		Object o=session.load(Account.class,new Integer(3));
		Account s=(Account)o;  
	
		session.delete(s);*/
		
		//session.saveOrUpdate(s);
		//s.setBalance(5000);   //updating balance for employee s
		
		
		Account a = new Account();
		a.setAccountHolderName("Raja");
		a.setBalance(7000);
		
		Calendar cd = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		cd.set(Calendar.YEAR,2021);
		cd.set(Calendar.MONTH,2);
		cd.set(Calendar.DAY_OF_MONTH,22);
		
		a.setOpenningDate(cd);
	
		
		Address ad = new Address();
		ad.setCityName("HYD");
		ad.setHouseNumber(13);
		ad.setState("TELANGANA");
		
		Address office_ad = new Address();
		office_ad.setCityName("BAN");
		office_ad.setHouseNumber(13);
		office_ad.setState("KARNATAKA");
		a.setOffice_address(office_ad);
		a.setAddress(ad);		
		
		session.save(a);  // insert into Account .....				
		//a = (Account)session.get(Account.class,3); // get the details whose id is 3
		//System.out.println(a);
		System.out.println("  -->> Data Saved ..");
		t.commit();
	
		session.close();
		System.out.println("All Done");
		
		
	}
}