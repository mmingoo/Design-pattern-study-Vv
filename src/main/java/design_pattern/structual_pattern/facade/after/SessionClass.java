package design_pattern.structual_pattern.facade.after;


import jakarta.mail.Session;
import java.util.Properties;


public class SessionClass {
    static public Session getSession(Properties properties){
        Session session = Session.getDefaultInstance(properties);
        return session;
    }
}
