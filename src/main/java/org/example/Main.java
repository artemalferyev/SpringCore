package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/META-INF/spring-config.xml");
        Friend friend = context.getBean("friend", Friend.class);
        friend.interact();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        PetDatabase db = context.getBean("db", PetDatabase.class);

    }
}