package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_DB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/users";
        String user = "root";
        String password = "";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement statement = con.createStatement();
            String sql = "INSERT INTO users (username, password) "
            		+ "VALUES ('Nikish', 'Abc123')";
            int rowsInserted = statement.executeUpdate(sql);
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
