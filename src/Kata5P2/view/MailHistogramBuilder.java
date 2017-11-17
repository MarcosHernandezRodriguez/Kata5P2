/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kata5P2.view;

import java.util.List;
import Kata5P2.model.Histogram;
import Kata5P2.model.Mail;

/**
 *
 * @author Marcos
 */
public class MailHistogramBuilder {
    // el objetivo de esta clase es construir a partir de una lista de emails un Histograma
    
    public static Histogram<String> build(List<Mail> mail){
        Histogram<String> histo = new Histogram<String>();
        for(Mail mail1 : mail){
            histo.increment(mail1.getDomain());
        }
        return histo;
    }
}
