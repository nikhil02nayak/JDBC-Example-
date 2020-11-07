import java.sql.*;
public class JdbcDemo {
    public static void main(String[] args) {

        try {
            String host = "jdbc:mysql://localhost:3306/employees";
            String uname="root";
            String upass = "";
            Connection con = DriverManager.getConnection(host,uname,upass);
            Statement stat = con.createStatement();
            String sql = "select * from employ";
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next())
            {
                int id = rs.getInt(1);
                String name = rs.getString(2);

                System.out.println(id + " " + name);
            }

        }
        catch (SQLException err)
        {
            System.out.println(err.getMessage());
        }

    }
}
