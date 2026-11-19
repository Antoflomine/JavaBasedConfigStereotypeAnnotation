package org.example;

import org.example.config.MyConfigration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigration.class);
        Student st= (Student) context.getBean("student"); //Student st=new Student();

//        st.show();
        System.out.println("Roll No:"+st.getRollNo()); //0
        st.writeExam();
    }
}
