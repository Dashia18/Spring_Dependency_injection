package helloTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Daria Serebryakova on 18.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext contText = new ClassPathXmlApplicationContext("config.xml");
        HelloBean hwB = (HelloBean)contText.getBean("helloBean");
        System.out.println(hwB.getMassage());
    }

}
