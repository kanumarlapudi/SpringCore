package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.UserDao;

@Service
public class UserService {
	@Autowired
    private UserDao userDao;
	public UserService() {
		System.out.println("UserService Obj created");
	}
	
	public void storeInDb() {
		boolean status = userDao.save();
		if(status) {
			System.out.println("Storing Success");
		}
		else {
			System.out.println("Failed");
		}
	}
}
