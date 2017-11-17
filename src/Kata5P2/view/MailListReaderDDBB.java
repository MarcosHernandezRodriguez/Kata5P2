/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kata5P2.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Kata5P2.model.Mail;
import java.sql.Statement;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Marcos
 */
public class MailListReaderDDBB {
    /* el objetivo de esta clase es leer del fichero de texto los emails
    (deserializar) y crear una lista de correos. */
    
    public static List<Mail> read() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        List<Mail> mailList = new ArrayList<>();
        
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/Marcos/PEOPLE.db");
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT mail FROM MAIL;");
        
        while(rs.next()){
            String mail = rs.getString("mail");
            if(!mail.contains("@")) continue;
            mailList.add(new Mail(mail));
        }
        return mailList;
    }

}
