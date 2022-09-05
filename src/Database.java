import java.sql.Connection;
import java.sql.SQLException;

public interface Database {
    public Connection connectDb();
    public void closeDb(Connection con);
}
