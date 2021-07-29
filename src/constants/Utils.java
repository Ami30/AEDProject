/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constants;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import static java.time.Clock.system;
import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author amishagupta
 */
public class Utils extends EmailConstants {

    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    LocalDateTime now;


    private static final String EMAIL_PATTERN = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public Utils() {
        system = dB4OUtil.retrieveSystem();
        now = LocalDateTime.now();
    }

    public Boolean isStringInputValid(String value) {
        Boolean result = false;
        if (value != null && !"".equals(value.trim())) {
            result = true;
        }
        return result;
    }

    public Boolean isFloatInputValid(float value) {
        Boolean result = false;
        if (value > 0 && value < 100) {
            result = true;
        }
        return result;
    }

    public int countOfString(String val) {
        int count = 0;
        for (int i = 0; i < val.length(); i++) {
            if (val.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public Boolean isEmailValid(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public void showErrorToast(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void setDatabase(EcoSystem system) {
        dB4OUtil.storeSystem(system);
    }

    public Boolean testTime(String time2) {
        String time = now.toString();
        time = time.split("T")[1].split(":")[0];
        int timeNow = Integer.parseInt(time);
        int timeSelected = Integer.parseInt(time2);
        if (timeSelected <= timeNow) {
            return false;
        } else {
            return true;
        }
    }

    public void sendEmail(String recepient, String subject, String emailMessage) {
        String user = "info.care4uus@gmail.com";//change accordingly  
        String password = "care@1234";//change accordingly  
        //Get the session object  
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                // TODO Auto-generated method stub
                return new javax.mail.PasswordAuthentication(user, password);
            }
        });

        //Compose the message  
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            // message.addRecipient(Message.RecipientType.TO, new InternetAddress("thakurkhushbu14@gmail.com"));
            message.setSubject(subject);

            message.setText(emailMessage);

            //send the message  
            Transport.send(message);

            System.out.println("message sent successfully...");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

//    public void sendEmail(String recepient, String subject, String emailMessage, Boolean isHtml) {
//        String user = "info.care4uus@gmail.com";//change accordingly  
//        String password = "care@1234";//change accordingly  
//        //Get the session object  
//        Properties props = new Properties();
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.port", "587");
//        props.put("mail.smtp.starttls.enable", "true");
//
//        Session session = Session.getInstance(props, new Authenticator() {
//            @Override
//            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
//                // TODO Auto-generated method stub
//                return new javax.mail.PasswordAuthentication(user, password);
//            }
//        });
//
//        //Compose the message  
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(user));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress("amishagupta1930@gmail.com"));
//            message.setSubject(subject);
//
//            if (isHtml) {
//                message.setContent(emailMessage, "text/html");
//            } else {
//                message.setText(emailMessage);
//            }
//
//            //send the message  
//            Transport.send(message);
//
//            System.out.println("message sent successfully...");
//
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//    }
}
