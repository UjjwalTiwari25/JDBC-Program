package database2;
import java.sql.*;

public class Database2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");/*Registering a driver*/
        Connection con=DriverManager.getConnection("jdbc:sqlite:C:/sqlite/school.db");/*Establishing connection*/
        Statement stm=con.createStatement();/* Creating sql statement...now we have to execute it*/
        ResultSet rs=stm.executeQuery("select * from students");/* writing sql statement to be executed*/
        while (rs.next())   /*  If there is new record it will return true...then we can print the result*/
        {
            System.out.print(rs.getInt("roll")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("city")+" ");
            System.out.println(rs.getInt(4)+" ");
        }
        stm.close();
        con.close();



    }
}
