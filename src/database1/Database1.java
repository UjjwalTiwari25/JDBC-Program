package database1;
import java.sql.*;
import java.util.*;

public class Database1 {
        public static void main(String[] args)throws Exception {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/school.db");
            Statement stm = con.createStatement();
            stm.executeUpdate("insert into dept values(70,'Chem')");

            stm.close();
            con.close();


        }
    }

