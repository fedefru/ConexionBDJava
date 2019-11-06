import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	
	private static String login_ = "root";
	private static String password_ = "admin";
	private static String url_ = "jdbc:mysql://localhost/employees";
	private static Connection connection_;
	private static Statement st_ = null;

	public static Connection conectar() {
		Connection connection_=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection_ = DriverManager.getConnection(url_, login_, password_);
			System.out.println("OK");
//			if (connection_ != null) {
//				
//				System.out.println(" Conexion a base de datos " + db_ + " correcta . ");
//			} else
//				System.out.println(" Conexion fallida . ");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Error: Controlador");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection_;
	}


	
}
