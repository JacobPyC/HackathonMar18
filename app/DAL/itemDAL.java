package DAL;

import java.util.ArrayList;
import java.util.List;

import io.ebean.Ebean;
import models.*;

public class itemDAL {
	
	public List<item> getAll() {
		
		List<item> listItem = new ArrayList<item>();
		
		listItem = (List<item>) Ebean.find(item.class).where().eq("Donated", true);
		
		return (listItem);
	}
	
	public void add (item itemToAdd) {
		Ebean.save(itemToAdd);
	}
}
