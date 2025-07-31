package design_pattern.structual_pattern.facade.before;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class Client {

    public static void main(String[] args) {
        // 메일 보내기 위힌 개인정보;
        String to = "keesun@whiteship.me";
        String from = "whiteship@whiteship.me";
        String host = "127.0.0.1";

        // 메일 보낵내기 위한 설정정보
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        // 메일 보내기 위한 세션
        Session session = Session.getDefaultInstance(properties);


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
