
package connectionSQL;
import java.sql.Connection;
import java.sql.DriverManager;

public class connectSQL {
    public static Connection openConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://LEVANPHUC:1433;database=QUANLYSINHVIEN";
        String username = "sa";
        String password = "sa";
        Connection con = DriverManager.getConnection(connectionURL, username, password);
        return con;
    }
}
