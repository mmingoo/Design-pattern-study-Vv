package design_pattern.structual_pattern.facade.after;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class Client {

    public static void main(String[] args) {
        Mail mail = new Mail();
        mail.sendMail("keesun@whiteship.me", "whiteship@whiteship.me", "127.0.0.1");
    }
}
