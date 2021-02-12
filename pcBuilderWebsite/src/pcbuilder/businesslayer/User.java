package pcbuilder.businesslayer;

//User class
public class User {
	int user_id = -1;
	String first_name = null;
	String last_name = null;
	String email = null;
	
	public void setUserInfo(int user_id, String first_name, String last_name, String email) {
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	
	public int getUser_id() {
		return user_id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public String getEmail() {
		return email;
	}
}