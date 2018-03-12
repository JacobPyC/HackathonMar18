package DAL;

import io.ebean.Ebean;
import models.*;

public class donersDAL {

	
	public void addUser(doners surviversToAdd) {
		Ebean.save(surviversToAdd);
	}
	
	public Boolean isExists(String name, String pswd) {
		Boolean isExists = false;
		
		if(Ebean.find(doners.class).where().eq("UserName", name).eq("Pasword", pswd) != null) {
			isExists = true;
		}
		
		return isExists;		
	}
}
