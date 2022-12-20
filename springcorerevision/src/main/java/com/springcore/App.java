package com.springcore;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.springcore.auto.wire.annotation.*;
import com.springcore.ci.Addition;
import com.springcore.ci.Person;
import com.springcore.collections.Emp;
import com.springcore.javaconfig.JavaConfig;
import com.springcore.lifecycle.Annotation;
import com.springcore.lifecycle.Pepsi;
import com.springcore.lifecycle.Samosa;
import com.springcore.ref.A;
import com.springcore.spel.Demo;
import com.springcore.stereotype.Student;
import com.springcore.stereotype.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//        com.springcore.javaconfig.Student student = applicationContext.getBean("student", com.springcore.javaconfig.Student.class);
//        System.out.println(student);
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	com.springcore.javaconfig.Student student = context.getBean("con", com.springcore.javaconfig.Student.class);
    	System.out.println(student);
    	student.study();
//        Demo demo = applicationContext.getBean("demo", Demo.class);
//        System.out.println(demo.toString());
        
//        SpelExpressionParser temp = new SpelExpressionParser();
//        org.springframework.expression.Expression expression =  temp.parseExpression("44+11");
//        System.out.println(expression.getValue());
//        Student student = applicationContext.getBean("object", Student.class);
//        System.out.println(student.hashCode()); // 198499365
//
//        Student student1 = applicationContext.getBean("object",Student.class);
//        System.out.println(student1.hashCode());
        
//        Teacher teacher1 = applicationContext.getBean("teacher", Teacher.class);
//        Teacher teacher2 = applicationContext.getBean("teacher", Teacher.class);
//        System.out.println("teacher-1 : "+teacher1.hashCode());
//        System.out.println("teacher-2 : "+teacher2.hashCode());
//        
//        Student student1 = (Student) applicationContext.getBean("student1");
//        Student student2 = (Student) applicationContext.getBean("student2");
//        Emp emp = (Emp) applicationContext.getBean("emp1");
//        A obj = (A) applicationContext.getBean("AObject");
//        Person person = (Person) applicationContext.getBean("person1");
//        Addition addition = (Addition) applicationContext.getBean("addition");
//        Samosa samosa = (Samosa) applicationContext.getBean("s1");
//        Pepsi pepsi = (Pepsi) applicationContext.getBean("p1");
//        System.out.println(samosa.toString());
//        System.out.println(pepsi);
        //applicationContext.registerShutdownHook();
        
//        Annotation annotation = (Annotation) applicationContext.getBean("annotation");
//        System.out.println(annotation);
        
//        Employee emp1 = applicationContext.getBean("employee", Employee.class);
//        System.out.println(emp1);
//        com.springcore.standalone.collections.Person person = applicationContext.getBean("person", com.springcore.standalone.collections.Person.class);
//        System.out.println(person);
//        System.out.println(person.getFriends().getClass().getName());
//        System.out.println("-----------------------------------------");
//        System.out.println(person.getFeeStructure());
//        System.out.println(person.getFeeStructure().getClass().getName());
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//        System.out.println(person.getProperties());
//        System.out.println(person.getProperties().getClass().getName());
        
        
//      addition.doSum();
//        System.out.println(person);
//        System.out.println(obj.getX());
//        System.out.println(obj.getObj().getY());
//        System.out.println(student1);
//        System.out.println(student2); 
//        System.out.println(emp);
//        System.out.println(emp.getName());
//        System.out.println(emp.getCourses());
//        System.out.println(emp.getPhones());
//        System.out.println(emp.getAddresses());
        
    }
}
