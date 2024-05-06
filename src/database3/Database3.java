package database3;
import java.sql.*;
import java.util.Scanner;

public class Database3 {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC"); /* Registering a driver */
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/school.db"); /* Establishing connection */
        PreparedStatement stm = con.prepareStatement("select * from students where deptno=?"); /* Creating sql statement...now we have to execute it */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dept. Number: ");
        int deptno = sc.nextInt();
        stm.setInt(1, deptno);

        ResultSet rs = stm.executeQuery(); /* Execute the prepared statement */
        while (rs.next()) {
            System.out.print(rs.getInt("roll") + " ");
            System.out.print(rs.getString("name") + " ");
            System.out.print(rs.getString("city") + " ");
            System.out.println(rs.getInt("deptno"));
        }
        stm.close();
        con.close();
        sc.close(); // Don't forget to close the Scanner
    }
}
