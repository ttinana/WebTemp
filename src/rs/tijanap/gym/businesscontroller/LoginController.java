package rs.tijanap.gym.businesscontroller;

import rs.tijanap.gym.dBbroker.DbBroker;
import rs.tijanap.gym.model.Zaposleni;

public class LoginController {
	
	public boolean loginClan(Zaposleni z){
		
		DbBroker dbInstance = new DbBroker();
		return dbInstance.loginClan(z);
		
	}

}
