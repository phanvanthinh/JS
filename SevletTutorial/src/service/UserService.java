package service;

import java.util.List;

import user.user;

public interface UserService {
	List<user> findAll();
	
	user findUserByIdAndPassword(String username, String password);
	user findUserByStt(int stt);
	user findUserByName(String username);
	public void editUser(user us);
	public void deleteUser(int stt);
	public void addUser(user us);
}
