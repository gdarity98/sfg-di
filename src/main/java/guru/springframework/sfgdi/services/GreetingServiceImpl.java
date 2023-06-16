package guru.springframework.sfgdi.services;

/**
 * Created by gd on 6/16/2023
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
