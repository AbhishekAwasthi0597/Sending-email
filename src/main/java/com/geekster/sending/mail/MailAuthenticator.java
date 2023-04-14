package com.geekster.sending.mail;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator {
    @Override
    protected PasswordAuthentication getPasswordAuthentication(){

        return new PasswordAuthentication(MailConstant.SENDER,"***********"); //put password
    }
}
