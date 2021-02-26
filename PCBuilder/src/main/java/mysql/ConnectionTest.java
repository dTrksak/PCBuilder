package mysql;

import java.sql.*;

public class ConnectionTest {
	public ConnectionTest() {
		
	}

	public String getUsers() {
		String users = "[";
		String sqlSelectAllPersons = "SELECT * FROM user";
		String connectionUrl = "jdbc:mysql://localhost:3306/pc_builder?serverTimezone=UTC";

		try (Connection conn = DriverManager.getConnection(connectionUrl, "pc_admin", "404");
				PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				long user_id = rs.getLong("user_id");
				String username = rs.getString("username");

				// do something with the extracted data...
				users += "(user_id= " + user_id + ", username= " + username + "), ";
			}

			ps.close();
			rs.close();
			conn.close();
		} catch (SQLException e) {
			// handle the exception
		}
		users += "]";
		return users;
	}
}
