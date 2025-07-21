package design_pattern.structual_pattern.facade.after;

import java.util.Properties;

public class PropertiesClass {
    static public Properties getProperties(String host){
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        return properties;
    }
}
