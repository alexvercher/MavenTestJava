package maven.test.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDataBaseServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String url = "jdbc:mysql://localhost:3306";
        String db = req.getParameter("db");
        String sql = req.getParameter("sql");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url+db, "root", "root");
            Statement statement = connection.createStatement();
            /*String s1 = "CREATE DATABASE cice";
            String s2 = "USE cice";
            String s3 = "CREATE TABLE test (id INT AUTO_INCREMENT, titulo VARCHAR(255) NOT NULL, PRIMARY KEY (id))";
            statement.execute(s1);
            statement.execute(s2);
            statement.execute(s3); */

            statement.execute(sql);
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
