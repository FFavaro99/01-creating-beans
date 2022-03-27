package main;

import beans.MyBean;
import beans.StereotypeBean;
import config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String... strings) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        //Get the mySecondBean @Primary bean by type
        var myBean = context.getBean(MyBean.class);
        System.out.println(myBean.getText());

        //Get the myStereotypeBean bean by type
        var myStereotypeBean = context.getBean(StereotypeBean.class);
        myStereotypeBean.setText("My Stereotype Bean!");
        System.out.println(myStereotypeBean.getText());

        //Get the myFirstBean bean by name
        var myFirstBean = context.getBean("myFirstBean", MyBean.class);
        System.out.println(myFirstBean.getText());
    }
}
