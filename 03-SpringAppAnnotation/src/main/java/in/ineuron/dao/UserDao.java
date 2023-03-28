package in.ineuron.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public UserDao() {
		System.out.println("Object is created for UserDao class");
	}
	
	public boolean save() {
		System.out.println("able to save in db");
		return true;
	}
}
