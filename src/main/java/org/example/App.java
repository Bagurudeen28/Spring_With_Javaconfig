package org.example;

import org.example.config.Myconfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {


        ApplicationContext context= new AnnotationConfigApplicationContext(Myconfiguration.class);
        Student std = (Student) context.getBean(Student.class);

        std.show();


    }
}
