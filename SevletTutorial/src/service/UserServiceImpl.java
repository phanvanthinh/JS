package service;

import java.util.List;

import dao.UserDao;
import dao.UserDaoImpl;
import user.user;

public class UserServiceImpl  implements UserService{
	
	
     UserDao userDao = new UserDaoImpl();
     
	@Override
	public List<user> findAll(){
		List<user> lstUser = userDao.findAll();
		return lstUser;
	}

	@Override
	public user findUserByIdAndPassword(String username, String password) {
		user us = userDao.findUserByNameAndPassword(username, password);
		return us;
	}

	@Override
	public void editUser(user us) {
	 userDao.editUser(us);
		
	}

	@Override
	public user findUserByStt(int stt) {
		user userOut = userDao.findUserByStt(stt);
		return userOut;
	}

	@Override
	public void deleteUser(int stt) {
		userDao.deleteUser(stt);
		
	}

	@Override
	public void addUser(user us) {
		userDao.addUser(us);
		
	}

	@Override
	public user findUserByName(String username) {
		user us = userDao.findUserByName(username);
		return us;
	}

}