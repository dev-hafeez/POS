package com.example.pos;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    public static Connection connectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect= DriverManager.getConnection("jdbc:mysql://localhost/pos","root","");
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }
}
