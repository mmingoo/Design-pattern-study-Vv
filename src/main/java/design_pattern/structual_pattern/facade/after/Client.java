package design_pattern.structual_pattern.facade.after;


public class Client {

    public static void main(String[] args) {

        Mail mail = new Mail();
        mail.sendMail("keesun@whiteship.me", "whiteship@whiteship.me", "127.0.0.1");


    }
}
