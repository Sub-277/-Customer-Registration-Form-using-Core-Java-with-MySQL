import java.sql.*;

public class Connection {

	java.sql.Connection c;
	Statement s;
	public Connection() {
		try {		
			c = DriverManager.getConnection("jdbc:mysql:///form","root","*********");
			s = c.createStatement();
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
