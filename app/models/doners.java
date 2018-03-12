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
		this.setUserName(a);
		this.setPasword(b);
		this.setPhone(c);
		this.setAddress(d);
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPasword() {
		return Pasword;
	}

	public void setPasword(String pasword) {
		Pasword = pasword;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	

}
