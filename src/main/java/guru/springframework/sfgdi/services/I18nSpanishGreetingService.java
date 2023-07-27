package guru.springframework.sfgdi.services;

/**
 * Created by gd on 6/19/2023
 */
public class I18nSpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }

}
