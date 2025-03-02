/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;



/**
 *
 * @author hanee
 */


/**
 * The {@code EmailSender} class provides a static method to send emails using the SMTP protocol
 * with Gmail's email servers. This utility class handles the configuration and sending of email messages.
 */
public class EmailSender {
    
     private static final String USERNAME = "crazycuber123@gmail.com";
    private static final String PASSWORD = "lumv uiig jzcf wvnz";
    
    /**
     * Sends an email to the specified recipient with the provided subject and body content.
     *
     * @param recipient The email address of the recipient.
     * @param subject The subject line of the email.
     * @param body The main content of the email.
     * @throws MessagingException If there is an error during the composition or sending of the email.
     */

     public static void sendEmail(String recipient, String subject, String body) throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USERNAME, PASSWORD);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(USERNAME));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
        message.setSubject(subject);
        message.setText(body);

        Transport.send(message);

        System.out.println("Email sent successfully to " + recipient);
    }
    
}
