package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.copy.ConnectionUtils;
import user.user;

public class UserDaoImpl extends ConnectionUtils implements UserDao{

	@Override
	public List<user> findAll() {
		List<user> lstUser = new ArrayList<>();
		String sqlSelect = "select * from login5 ";
		Connection connectDb = null;
		PreparedStatement p = null;
		ResultSet r = null;
		try {
			 connectDb = super.getMyConnection();
			 p = connectDb.prepareStatement(sqlSelect);
		     r = p.executeQuery();
			while(r.next()) {
				user userlogin = new user();
				userlogin.setStt(r.getInt("STT"));
				userlogin.setRole(r.getInt("Role"));
				userlogin.setUsername(r.getString("Username"));
				userlogin.setPassword(r.getString("Password"));
				userlogin.setAvatar(r.getString("Avatar"));
				lstUser.add(userlogin);
			}
			return lstUser;
		} catch (Exception e) {
			
			
			return null;
		}finally {
				try {
					if (connectDb!= null ) {
						connectDb.close();
						}
					if (p != null) {
					p.close(); 
					   }
					if (r != null) {
					r.close();
					}
				} catch (SQLException e) {
					return null;
				}
	}}
	



	@Override
	public user findUserByNameAndPassword(String username, String password) {
		List<user> userList = new ArrayList<user>();
		
		String sql1 = "SELECT *FROM login5 WHERE " + "username = '" + username + "'" + " AND password = '" +password+"'";
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql1);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				user userOut = new user();
				userOut.setUsername(rs.getString("username"));
				userOut.setPassword(rs.getString("password"));
				userOut.setRole(rs.getInt("Role"));

				userList.add(userOut);
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (userList != null && !userList.isEmpty()) {
			return userList.get(0);
		}
		
		
		
//		Connection cnn = null;
//		PreparedStatement pr = null;
//		ResultSet rs = null;
//		user us = null;
//		try {
//			cnn = super.getMyConnection();
//			 pr = cnn.prepareStatement(sql1);
//		     rs = pr.executeQuery();
//			while(rs.next()) {
//				us = new user();
//				us.setUsername(rs.getString("Username"));
//				us.setPassword(rs.getString("Password"));
//				us.setRole(rs.getInt("Role"));
//			}
//		    return us;
//
//		} catch (Exception e1) {
//			e1.printStackTrace();
//			return null;
//		}finally {
//			try {
//				if (cnn != null ) {
//                    cnn.close();
//					}
//				if (pr != null) {
//				pr.close(); 
//				   }
//				if (rs != null) {
//				rs.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//	}
		return null;
}




	@Override
	public void editUser(user us) {
		String sql = "UPDATE login5 SET Username = '"+us.getUsername()+"', Password='"+us.getPassword()+"', avatar='"+us.getAvatar()+"' Where STT = "+us.getStt()+";";
//		String sql = "UPDATE login SET "
//				+ " Username = '" + us.getUsername() + "' WHERE STT = " + us.getStt();
		System.out.print("sql");
		Connection cnn = null;
		PreparedStatement pr = null;


		try {
			cnn=super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			pr.executeUpdate();
		}catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}




	@Override
	public user findUserByStt(int stt) {
		List<user> uList = new ArrayList<user>();
		String sql = "SELECT * FROM login5 WHERE STT = "+stt+"";
		System.out.print("sql");
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				user userOut = new user();
				userOut.setStt(rs.getInt("STT"));
				userOut.setRole(rs.getInt("Role"));
				userOut.setUsername(rs.getString("Username"));
				userOut.setPassword(rs.getString("Password"));
				userOut.setAvatar(rs.getString("avatar"));
				uList.add(userOut);
			}
		} catch (ClassNotFoundException e1) {		
			e1.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		if (uList != null && !uList.isEmpty()) {
			return uList.get(0);
		}
		return null;
	}




	@Override
	public void deleteUser(int stt) {
		String sql = "DELETE FROM login5 where STT=" +stt + "";
				
		System.out.print("sql");
		Connection cnn = null;
		PreparedStatement pr = null;


		try {
			cnn=super.getMyConnection();
			pr = cnn.prepareStatement(sql);
			pr.executeUpdate();
		}catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}




	@Override
	public void addUser(user us) {
		String sql ="insert into login5(  Username, Password, Role, avatar) values ('"+us.getUsername()+"', '"+us.getPassword()+"', "+us.getRole()+", '"+us.getAvatar()+"'); ";
		System.out.println(sql);
		Connection cnn = null;
		PreparedStatement pr = null;
        try {
        	cnn=super.getMyConnection();
        	pr=cnn.prepareStatement(sql);
        	pr.executeUpdate();
        }catch (ClassNotFoundException e1){
        	e1.printStackTrace();
        	
        }catch (Exception e1) {
        	e1.printStackTrace();
        }
	}




	@Override
	public user findUserByName(String username) {
		List<user> usList = new ArrayList<user>();
		String sql = "SELECT * FROM login5 WHERE Username ='"+username+"';";
		System.out.print("sql");
		Connection conn;
		try {
			conn = super.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				user usOut = new user();
				usOut.setStt(rs.getInt("STT"));
				usOut.setRole(rs.getInt("Role"));
				usOut.setUsername(rs.getString("Username"));
				usOut.setPassword(rs.getString("Password"));
				usOut.setAvatar(rs.getString("avatar"));
				
				usList.add(usOut);
			}
		} catch (ClassNotFoundException e1) {		
			e1.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		if (usList != null && !usList.isEmpty()) {
			return usList.get(0);
		}
		return null;
	}

	}






