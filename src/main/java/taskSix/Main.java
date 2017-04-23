package taskSix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Daria Serebryakova on 19.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("taskSixConfig.xml");
        Office office = (Office) context.getBean("office");
        office.printOfficeLocation();
    }
}
