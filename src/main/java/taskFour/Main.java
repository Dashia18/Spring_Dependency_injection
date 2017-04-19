package taskFour;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Daria Serebryakova on 19.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("taskFourConfig.xml");
        MonthInfo monthInfo = (MonthInfo)context.getBean("mothInfo");

        System.out.println("<!--SpEL-->");
        System.out.println("monthInfo = " + monthInfo);

    }
}
