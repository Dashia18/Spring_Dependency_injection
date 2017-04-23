package taskSeven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Daria Serebryakova on 23.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("taskSevenConfig.xml");
        Mammal mammal = (Mammal) context.getBean("mammal");
        Dog dog = mammal.getDog();
        System.out.println("dog = " + dog);

    }
}
