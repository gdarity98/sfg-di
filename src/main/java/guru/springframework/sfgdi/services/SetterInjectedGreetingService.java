package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by gd on 6/16/2023
 */
@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
