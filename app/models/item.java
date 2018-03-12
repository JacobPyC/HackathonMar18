package models;

import java.util.Date;

import javax.persistence.*;
import io.ebean.Model;

@Entity
@Table(name = "T_ITEMS")
public class item extends Model{
	
	@Column(name = "Item")
	private String Item;

	@Column(name = "UserName_Surviver")
	private String UserName_Surviver;
	
	@Column(name = "UserName_Doner")
	private String UserName_Doner ;
	
	@Column(name = "Publish_Date")
	private Date Publish_Date ;
	 
	@Column(name = "Donated")
	private Boolean Donated ;
	 
	public item (String a, String b, String c, Date d , Boolean e) {
		this.setItem(a);
		this.setUserName_Doner(b);
		this.setUserName_Doner(c);
		this.setPublish_Date(d);
		this.setDonated(e);
	}

	public String getItem() {
		return Item;
	}

	public void setItem(String item) {
		Item = item;
	}

	public String getUserName_Surviver() {
		return UserName_Surviver;
	}

	public void setUserName_Surviver(String userName_Surviver) {
		UserName_Surviver = userName_Surviver;
	}

	public String getUserName_Doner() {
		return UserName_Doner;
	}

	public void setUserName_Doner(String userName_Doner) {
		UserName_Doner = userName_Doner;
	}

	public Date getPublish_Date() {
		return Publish_Date;
	}

	public void setPublish_Date(Date publish_Date) {
		Publish_Date = publish_Date;
	}

	public Boolean getDonated() {
		return Donated;
	}

	public void setDonated(Boolean donated) {
		Donated = donated;
	}
	
}
