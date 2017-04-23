package taskFive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Daria Serebryakova on 19.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("taskFiveConfig.xml");
        Children children = (Children) context.getBean("children");

        System.out.println("\n<!--Autowire - No -->");
        System.out.println("children = " + children);

        Father father = (Father) context.getBean("father");

        System.out.println("\n<!--Autowire - by Name -->");
        System.out.println("father = " + father);

        Mother mother = (Mother) context.getBean("mother");

        System.out.println("\n<!--Autowire - by Type -->");
        System.out.println("mother = " + mother);

        Family family = (Family)context.getBean("family");

        System.out.println("\n<!--Autowire - by constructor -->");
        System.out.println("family = " + family);

    }
}
