package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by gd on 8/1/2023
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton bean!!!");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
