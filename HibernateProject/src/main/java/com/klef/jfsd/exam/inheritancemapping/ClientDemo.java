package com.klef.jfsd.exam.inheritancemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class ClientDemo {
	public static void main(String aegs[])
	{
		Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    
	    SessionFactory sf  = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    Transaction transcation =  session.beginTransaction();
	    
	    Vehicle v = new Vehicle();
        v.setName("Generic Booster");
        v.setType("Monster");
        v.setMaxspeed("200 km/h");
        v.setColor("green");

        Car c = new Car();
        c.setName("Ford");
        c.setType("Safteycar");
        c.setMaxspeed("150");
        c.setColor("Black");
        c.setNoofdoors(5);

        Truck t = new Truck();
        t.setName("Cargo Truck1");
        t.setType("Loaded Truck");
        t.setMaxspeed("95 ");
        t.setColor("Yellow");
        t.setLoadcapacity(20000);

        // Save objects
        session.save(v);
        session.save(c);
        session.save(t);

	 
	   
	   System.out.println("SUCCESS.....!!!");
	   
	   
	 
	    
	    
	    transcation.commit();
	    sf.close();
	    session.close();
	    
	}

}
