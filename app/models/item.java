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
		this.Item = a;
		this.UserName_Surviver = b;
		this.UserName_Doner = c;
		this.Publish_Date = d;
		this.Donated = e;
	}
}
