import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DB base = new DB();
				//preparo la consulta
				java.sql.Statement s= null;
//				DB con=new DB();
				try {
					s = base.conectar().createStatement();
					
					String Consulta;
					Consulta="select avg(salaries.salary) from titles inner join salaries on (employees.titles.emp_no = employees.salaries.emp_no)\r\n" + 
							" where title='Senior Engineer'";
					ResultSet rs=s.executeQuery(Consulta);
					while (rs.next()) {
						System.out.println(rs.getString(1)+"-------------" );
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
