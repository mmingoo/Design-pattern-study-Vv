package design_pattern.structual_pattern.facade.after;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;


public class SessionClass {
    static public Session getSession(Properties properties){
        Session session = Session.getDefaultInstance(properties);
        return session;
    }
}
