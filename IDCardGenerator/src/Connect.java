import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	static Connection con = null;

	public static Connection getDBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "qwerty");
			
		} catch (Exception e) {

		}
		return con;
	}
	
}

