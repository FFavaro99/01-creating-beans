package config;

import beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"beans"}) //Component scanning enables spring to look for stereotype annotated beans
public class Config {

    //The name of a bean is the name of the method that declares the bean.
    //You can set a bean's name between parentheses with the @Bean annotation
    @Bean("myFirstBean")
    public MyBean myFirstBean() {
        MyBean bean = new MyBean();
        bean.setText("My First Bean!");
        return bean;
    }

    @Bean
    @Primary
    //A primary bean will be retrieved from the context when more beans of the same type exist
    public MyBean mySecondBean() {
        MyBean bean = new MyBean();
        bean.setText("My Second Bean!");
        return bean;
    }
}
