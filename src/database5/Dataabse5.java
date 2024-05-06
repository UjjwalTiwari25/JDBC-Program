package database5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dataabse5 {
        public static void main(String[] args)throws Exception {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/school.db");
            Statement stm = con.createStatement();
            stm.executeUpdate("create table Temp(a integer,b text)");

            stm.close();
            con.close();


        }
    }



