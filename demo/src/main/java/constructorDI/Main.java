package constructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Class1 c1 = (Class1) context.getBean("sanj");
        c1.func();
    }
}
