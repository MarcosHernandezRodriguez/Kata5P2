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
import java.io.FileNotFoundException;

/**
 *
 * @author Marcos
 */
public class MailListReader {
    /* el objetivo de esta clase es leer del fichero de texto los emails
    (deserializar) y crear una lista de correos. */
    
    public static List<Mail> read(String fileName) throws FileNotFoundException, IOException{
        List<Mail> mailList = new ArrayList<Mail>();
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))) {
            String mail;
            while((mail = reader.readLine()) != null){
                if(!mail.contains("@")){
                    
                }else{
                    mailList.add(new Mail(mail));
                }
            }
        } catch(FileNotFoundException e){}
        return mailList;
    }
}
