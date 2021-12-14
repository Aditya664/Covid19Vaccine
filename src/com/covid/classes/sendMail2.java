package com.covid.classes;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;

public class sendMail2
{
	public static void sendMail(String emailID,String message,String ref) throws Exception
	{
		String host = "smtp.gmail.com", user = "covidvaccination37@gmail.com", pass = "Vaccination@123";
		String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		String to = emailID;
		String from = "covidvaccination37@gmail.com";
		String subject = "Covid 19 Registration";
		String messageText = message;
		boolean sessionDebug = true;

		Properties props = System.getProperties();
		props.put("mail.host", host); //Specify SMTP Server
		props.put("mail.transport.protocol.", "smtp");  //specify protocol used for session. For sending mail use smtp or smtps
		props.put("mail.smtp.auth", "true");  ///specify whether authentication required for log in to SMTP Server
		props.put("mail.smtp.", "true");
		props.put("mail.smtp.port", "465"); //specify SMTP Server portno
		props.put("mail.smtp.socketFactory.fallback", "false");
		props.put("mail.smtp.socketFactory.class", SSL_FACTORY);

		Session mailSession = Session.getDefaultInstance(props, null); //Get Mail Session
		mailSession.setDebug(sessionDebug);

		Message msg = new MimeMessage(mailSession);
		msg.setFrom(new InternetAddress(from));
		InternetAddress[] address = {new InternetAddress(to)};
		msg.setRecipients(Message.RecipientType.TO, address);
		msg.setSubject(subject);
                BodyPart attachment1 = new MimeBodyPart();
                attachment1.setDataHandler(new DataHandler(new FileDataSource("C:\\Users\\Aditya\\Desktop\\Rutuja\\Covid19Vaccine\\src\\Certificate\\" + ref + ".pdf")));
		attachment1.setFileName(ref+".pdf");
		BodyPart emailText = new MimeBodyPart();
		emailText.setText(messageText);
		Multipart multipartContent = new MimeMultipart();
                  multipartContent.addBodyPart(emailText);
		multipartContent.addBodyPart(attachment1);
              msg.setContent(multipartContent);
		

		Transport transport = mailSession.getTransport("smtp");
		transport.connect(host, user, pass);

		try
		{
			transport.sendMessage(msg, msg.getAllRecipients());
		}
		catch (Exception e)
		{
			System.out.println("Error" + e.getMessage());
		}
		transport.close();
	}
}