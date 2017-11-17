/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kata5P2.model;

/**
 *
 * @author Marcos
 */
public class Mail {
    private final String mail;
    
    public Mail(String mail){
        this.mail = mail;
    }
    
    public String getMail(){
        return mail;
    }
    
    public String getDomain(){
        return mail.split("@")[1];
    }
}
