package org.example.config;


import org.example.Pen;
import org.example.Pencil;
import org.example.Student;
import org.example.Writer;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class Myconfiguration {

    /*

    @Bean(name = "s1")
    public Student student(Writer writer){
        Student st = new Student();
        st.setName("Mohan");
        st.setWriter(writer);
        return st;
    }



//    @Bean(name = "s1")
//    public Student student(){
//        Student st = new Student();
//        st.setName("Mohan");
//        st.setWriter(pen());
//        return st;
//    }
//


    @Bean
    @Primary
    public Pen pen(){
        return new Pen();
    }

    @Bean
    public Pencil pencil(){
        return new Pencil();
    }
    */
}
