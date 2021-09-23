package com.sagar.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name="account")
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	 private BigInteger id;
	
	 private String username ;
	 
	 private String password;
	 
	 private String  email;
	 
/*	 @Temporal((TemporalType.TIMESTAMP))
 * 
*/	 
	 @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	 private  DateTime created_on;
	 


	/*	 @Temporal((TemporalType.TIMESTAMP))

*/
	 @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	 private  DateTime last_login;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public DateTime getCreated_on() {
		return created_on;
	}

	public void setCreated_on(DateTime created_on) {
		this.created_on = created_on;
	}

	public DateTime getLast_login() {
		return last_login;
	}

	public void setLast_login(DateTime last_login) {
		this.last_login = last_login;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", created_on=" + created_on + ", last_login=" + last_login + "]";
	}	
}


/*@Temporal is a JPA annotation which can be used to store in the database table on of the following column items:

DATE (java.sql.Date)
TIME (java.sql.Time)
TIMESTAMP (java.sql.Timestamp)*/
