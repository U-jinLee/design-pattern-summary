package _facade.before;

import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        String to = "keesun@whiteship.me";
        String from = "keesun@whiteship.me";
        String host = "127.0.0.1";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        try {
            //...
            System.out.println("Mail send complete");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
