package models;

import javax.persistence.*;

import io.ebean.Model;


@Entity
@Table(name = "T_DONERS")
public class doners extends Model{
	
	@Id
	@Column(name = "UserName")
	private String UserName;
	
	@Column(name = "Pasword")
	private String Pasword;
	
	@Column(name = "Phone")
	private String phone;
	
	@Column(name = "Addres")
	private String Address;
	
	public doners(String a, String b, String c, String d) {
		this.UserName = a;
		this.Pasword = b;
		this.phone = c;
		this.Address = d;
	}

}
