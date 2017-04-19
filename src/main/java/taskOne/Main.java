package TaskOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Daria Serebryakova on 18.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("taskOneConfig.xml");
        Person person1 = (Person)context.getBean("personSI");

        System.out.println("<!--Setter Injection-->");
        System.out.println("person1 = " + person1);


        Person person2 = (Person)context.getBean("personCI");

        System.out.println("<!--Constructor Injection-->");
        System.out.println("person2 = " + person2);


        University university = (University)context.getBean("universityCI");

        System.out.println("<!--Constructor Injection-->");
        System.out.println("university = " + university);

        Student student1 = (Student)context.getBean("studentSI");

        System.out.println("<!--Setter Injection-->");
        System.out.println("student1 = " + student1);


        Student student2 = (Student)context.getBean("studentCI");

        System.out.println("<!--Constructor Injection-->");
        System.out.println("student2 = " + student2);
    }



}
