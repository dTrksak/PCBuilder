public class User {
	
	int user_id = -1;
	String first_name = null;
	String last_name = null;
	String email = null;
	
	User(int user_id, String first_name, String last_name, String email) {
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
}