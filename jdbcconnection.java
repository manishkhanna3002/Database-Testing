import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.Statement;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String host="localhost";
		String port="3306"; 
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/EMP10","sha2user","pasword");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from EMP10 where name='MANISH10'");
		while (rs.next()) {
		rs.getString("name");
		}
	}

}