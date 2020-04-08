package lab8;

import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("url","jdbc:postgresql://localhost:5432/lab7");
        properties.setProperty("username", "postgres");
        properties.setProperty("password", "240699");

        PersistEntity epe = new PersistEntity(properties);

        Reception reception = new Reception();
        epe.persist(reception);

        epe.close();
    }
}
