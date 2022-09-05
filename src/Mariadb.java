import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mariadb implements Database {
    public Connection connectDB() {
        Connection con = null;
        try {
            con = tryConnectDb();
        } catch (SQLException e) {
            System.err.println("Hiba!A kapcsolódás sikertelen!");
        }
        return con;
    }
    public Connection tryConnectDb() throws SQLException {
        Connection con = null;
        String url = "jdb:mariadb://localhost:3306/adaba";
        String user = "adaba";
        String password = "titok";
        
        con = DriverManager.getConnection(url, user, password);
        return con;

    }

    public void closeDb(Connection con) {

    }
}
