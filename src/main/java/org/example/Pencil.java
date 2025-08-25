package org.example;


import org.springframework.stereotype.Component;

@Component
public class Pencil implements Writer{

    void Pencil(){
        System.out.println("I am in Pencil class");
    }

    @Override
    public void writing() {
        System.out.println(" I am writing via Pencil");
    }
}
