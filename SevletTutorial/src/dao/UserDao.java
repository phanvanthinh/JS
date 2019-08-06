package dao;

import java.util.List;

import user.user;

public interface UserDao {

	public List<user> findAll() ;
	
    public	user findUserByNameAndPassword(String username, String password);
    
    user findUserByStt(int stt);
    user findUserByName(String username);
    
	
	public void editUser(user us);
	public void deleteUser(int stt);
	public void addUser(user us);
	
	
}
