package design_pattern.structual_pattern.facade.after;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class Mail {
    public void sendMail(String to, String from,String host){
        // 메일 보내기 위한 설정정보
        Properties properties = PropertiesClass.getProperties(host);
        // 메일 보내기 위한 세션정보
        Session session = SessionClass.getSession(properties);


        // 메일 보내기 로직
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Test Mail from Java Program");
            message.setText("message");

            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
