import java.sql.*;
import java.util.concurrent.Callable;

public class AcolyteTest {
    public static Statement stat;
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:My_cats.db");
            System.out.println("Connected");
            stat = connection.createStatement();
            stat.execute("CREATE TABLE if not exists 'types' ('id' INTEGER PRIMARY KEY AUTOINCREMENT , 'type' text NOT NULL);");


            } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
