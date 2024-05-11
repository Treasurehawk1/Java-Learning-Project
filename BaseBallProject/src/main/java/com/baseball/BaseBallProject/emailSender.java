package com.baseball.BaseBallProject;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class emailSender {
	

	private String to = ""; // add these two later
    private String from = "";
    private String host = "smtp.gmail.com";

    public emailSender() {
	   
    }
	
    public void sendEmail(Dodgers info) {
    	 
	    Properties properties = System.getProperties();
	    properties.put("mail.smtp.host", host);
	    properties.put("mail.smtp.port", "587");
	    properties.put("mail.smtp.starttls.enable", "true");
	    properties.put("mail.smtp.auth", "true");
	    
	    Session session = Session.getInstance(properties, new javax.mail.Authenticator(){
	      protected PasswordAuthentication getPasswordAuthentication() {
	    	 String pass = ""; // REMOVE THIS BEFORE UPLOADING ON GITHUB
	         return new PasswordAuthentication(from, pass);
	      }
	    });
	     try {
	      MimeMessage message = new MimeMessage(session);
	      message.setFrom(new InternetAddress(from));
	      message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	      message.setSubject("Dodgers Game Today, " + info.getSubject() + " Playing at " + info.getLocation());
	      message.setText("The Game starts at " + info.getStartTime() + "...Get Excited!");
	      Transport.send(message);
	      
	      } catch (MessagingException mex) {
	        mex.printStackTrace();
	      }
    }
	
	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

}
