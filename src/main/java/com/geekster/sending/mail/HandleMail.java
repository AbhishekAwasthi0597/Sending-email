package com.geekster.sending.mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class HandleMail {
   void sendMail() {
       Properties props = System.getProperties();
       System.out.println(props);
       props.put("mail.smtp.host", "smtp.gmail.com");
       props.put("mail.smtp.port", "465");
       props.put("mail.smtp.ssl.enable","true");
       props.put("mail.smtp.auth","true");
       Session mailSession= Session.getInstance(props,new MailAuthenticator());
       MimeMessage mineMessage=new MimeMessage(mailSession);
       try{
           mineMessage.setFrom(MailConstant.SENDER);
           mineMessage.setRecipient(Message.RecipientType.TO,new InternetAddress(MailConstant.RECEIVERMAIL));
           mineMessage.setSubject(MailConstant.SUBJECT);
           mineMessage.setText(MailConstant.MSG);
           Transport.send(mineMessage);
       }catch (MessagingException e){
           System.out.println("Exception caught"+e);
       }
   }
}
