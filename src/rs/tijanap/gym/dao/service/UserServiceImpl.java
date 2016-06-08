/**
 * 
 */
package rs.tijanap.gym.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import rs.tijanap.gym.dao.dao.UserDao;
import rs.tijanap.gym.testModel.User;

/**
 * @author tijana.pavicic
 *
 */
public class UserServiceImpl implements UserService {
	
	  
	 @Autowired  
	 UserDao userdao;  

	/* (non-Javadoc)
	 * @see rs.tijanap.gym.dao.UserService#insertData(rs.tijanap.gym.testModel.User)
	 */
	@Override
	public void insertData(User user) {
		userdao.insertData(user);  

	}

	/* (non-Javadoc)
	 * @see rs.tijanap.gym.dao.UserService#getUserList()
	 */
	@Override
	public List<User> getUserList() {
		return userdao.getUserList();  
	}

	/* (non-Javadoc)
	 * @see rs.tijanap.gym.dao.UserService#deleteData(java.lang.String)
	 */
	@Override
	public void deleteData(String id) {
		 userdao.deleteData(id);  

	}

	/* (non-Javadoc)
	 * @see rs.tijanap.gym.dao.UserService#getUser(java.lang.String)
	 */
	@Override
	public User getUser(String id) {
		return userdao.getUser(id);  
	}

	/* (non-Javadoc)
	 * @see rs.tijanap.gym.dao.UserService#updateData(rs.tijanap.gym.testModel.User)
	 */
	@Override
	public void updateData(User user) {
		userdao.updateData(user);  

	}

}
