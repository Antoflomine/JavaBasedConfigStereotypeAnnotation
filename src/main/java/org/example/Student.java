package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("101")
    private int rollNo;
    @Autowired
    @Qualifier("pen")
    private Writer writer;

    public  Student(){
        System.out.println("Student constructor");
    }
    public void show(){
        System.out.println("In show method");
    }
    public void writeExam(){
        writer.write();
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Writer getWriter() {
        return writer;
    }

    @Autowired //SetterInjection
//    @Qualifier("pencil")
    public void setWriter(Writer writer) {
        System.out.println("Setter called");
        this.writer = writer;
    }

    @Autowired //ConstructorInjection
    public Student(@Qualifier("pencil") Writer writer) {
        this.writer = writer;
    }
}