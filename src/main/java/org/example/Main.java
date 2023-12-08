package org.example;

import org.example.action.ComplexAction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        ComplexAction action = context.getBean(ComplexAction.class);
        action.takeAction();
    }
}