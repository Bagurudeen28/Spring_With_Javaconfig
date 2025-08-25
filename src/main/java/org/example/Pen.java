package org.example;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Writer{

    void Pen(){
        System.out.println("I am in Pen Class");
    }

    @Override
    public void writing() {
        System.out.println(" I am writing via Pen");
    }
}
