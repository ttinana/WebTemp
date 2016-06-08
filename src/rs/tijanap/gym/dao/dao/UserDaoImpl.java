package rs.tijanap.gym.dao.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import rs.tijanap.gym.dao.UserRowMapper;
import rs.tijanap.gym.testModel.User;

public class UserDaoImpl implements UserDao {
	
	 @Autowired  
	 DataSource dataSource;  

	@Override
	public void insertData(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> getUserList() {
		List<User> userList = new ArrayList<User>();

		String sql = "select * from user";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		userList = jdbcTemplate.query(sql, new UserRowMapper());
		return userList;
	}

	@Override
	public void updateData(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteData(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUser(String id) {
		  List<User> userList = new ArrayList<User>();  
		  String sql = "select * from user where user_id= " + id;  
		  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
		  userList = jdbcTemplate.query(sql, new UserRowMapper());  
		  return userList.get(0);  
	}

}
