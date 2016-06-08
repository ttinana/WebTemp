/**
 * 
 */
package rs.tijanap.gym.dao.dao;

/**
 * @author tijana.pavicic
 *
 */
import java.util.List;  
import rs.tijanap.gym.testModel.*;  
  
public interface UserDao {  
 public void insertData(User user);  
 public List<User> getUserList();  
 public void updateData(User user);  
 public void deleteData(String id);  
 public User getUser(String id);  
  
}
