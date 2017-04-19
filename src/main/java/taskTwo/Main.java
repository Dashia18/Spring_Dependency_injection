package taskTwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Daria Serebryakova on 18.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("taskTwoConfig.xml");
        UniversityGroup group1 = (UniversityGroup)context1.getBean("collectionInjectionSI");

        System.out.println("<!--Setter Injection-->");
        System.out.println("group1.getStudentsList() = " + group1.getStudentsList());
        System.out.println("group1.getStudentSet() = " + group1.getStudentSet());
        System.out.println("group1.getStudentMap() = " + group1.getStudentMap());

        ApplicationContext context2 = new ClassPathXmlApplicationContext("taskTwoConfig.xml");
        UniversityGroup group2 = (UniversityGroup)context2.getBean("collectionInjectionCI");

        System.out.println("<!--Constructor Injection-->");
        System.out.println("group2.getStudentsList() = " + group2.getStudentsList());
        System.out.println("group2.getStudentSet() = " + group2.getStudentSet());
        System.out.println("group2.getStudentMap() = " + group2.getStudentMap());
}
}
