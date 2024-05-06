import java.sql.*;

class Database {
    public static void main(String[] arg) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/school.db");

        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select * from dept");
        int dno;
        String deptname;
        while (rs.next()) {
            dno = rs.getInt("deptno");
            deptname = rs.getString("deptname");
            System.out.println(dno + " " + deptname);
        }
    }
}