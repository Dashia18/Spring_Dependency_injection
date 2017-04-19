package taskTree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Daria Serebryakova on 19.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("taskTreeConfig.xml");
        Person person = (Person)context.getBean("person");
        System.out.println("person = " + person);

        Student student = (Student)context.getBean("student");
        System.out.println("student = " + student);

    }
}
