package DAL;
import io.ebean.Ebean;
import models.*;

public class surviversDAL {
	
	public void addUser(survivers surviversToAdd) {
		Ebean.save(surviversToAdd);
	}
	
	public Boolean isExists(String name, String pswd) {
		Boolean isExists = false;
		
		if(Ebean.find(survivers.class).where().eq("UserName", name).eq("Pasword", pswd) != null) {
			isExists = true;
		}
		
		return isExists;		
	}
}
