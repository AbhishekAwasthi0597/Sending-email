package com.geekster.sending.mail;

import org.springframework.asm.Handle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SendingMailApplication {

	public static void main(String[] args) {
		System.out.println("To send mail");
			HandleMail mail = new HandleMail();
			mail.sendMail();
	}
}
