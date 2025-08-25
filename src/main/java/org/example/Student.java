package org.example;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {


    private int id;
    private String name;
    private int age;


    //Filed Injuction
    @Autowired
    @Qualifier("pencil")
    private Writer writer;


//    Setter injuction
//    @Autowired
//    @Qualifier("pencil")
//    public void setWriter(Writer writer) {
//        this.writer = writer;
//    }

    public void show(){
        System.out.println("Hello i am in the student class");
        writer.writing();
    }


    //Constructor Ijuction
//    @Autowired
//    public void Student(@Qualifier("pencil") Writer writer){
//        this.writer=writer;
//    }




}
