/**
 * 
 */
package rs.tijanap.gym.dao.service;

import java.util.List;

import rs.tijanap.gym.testModel.User;

/**
 * @author tijana.pavicic
 *
 */
public interface UserService {
	
	 public void insertData(User user);  
	 public List<User> getUserList();  
	 public void deleteData(String id);  
	 public User getUser(String id);  
	 public void updateData(User user);  

}
