package com.ltts.onlinelaptopstore.bo;

import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.onlinelaptopstore.model.User;
 
@Repository
public class UserBo {

	@Autowired
	SessionFactory sf;
	
	public boolean insertUser(User u)
	{
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(u);
		//s.getTransaction().commit();
		
		s.getTransaction().commit();
		s.close();
		System.out.println("Outside User Bo");
		return false;
		
	}
	

	public User checkUserByUsername(String username) {
		User u=null;
		Session s=sf.openSession();
		s.beginTransaction();
		User u1=(User)s.get(User.class,username);
		s.getTransaction().commit();
		System.out.println("Inside checkUserByUsername");
		return u1;
		
	}

	public boolean updateUser(User u)
	{
		Session s=sf.openSession();
		s.beginTransaction();
		//s.save(u);
		//s.getTransaction().commit();
		//s.merge(u);
		s.saveOrUpdate(u);
		s.getTransaction().commit();
		s.close();
		return true;
	}

}

