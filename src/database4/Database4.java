package database4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Database4 {
        public static void main(String[] args)throws Exception {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/school.db");
            PreparedStatement stm=con.prepareStatement("insert into students values(?,?,?,?)");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Student Data");
            int r=sc.nextInt();
            String name=sc.next();
            String city=sc.next();
            int deptno= sc.nextInt();
            stm.setInt(1,r);
            stm.setString(2,name);
            stm.setString(3,city);
            stm.setInt(4,deptno);
            stm.executeUpdate();

            stm.close();
            con.close();


        }
    }



