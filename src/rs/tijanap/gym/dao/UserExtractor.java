/**
 * 
 */
package rs.tijanap.gym.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;

import rs.tijanap.gym.testModel.User;

/**
 * @author tijana.pavicic
 *
 */
public class UserExtractor {

	public User extractData(ResultSet resultSet) throws SQLException, DataAccessException  {
		User user = new User();

		user.setUserId(resultSet.getInt(1));
		user.setFirstName(resultSet.getString(2));
		return user;
	}

}
