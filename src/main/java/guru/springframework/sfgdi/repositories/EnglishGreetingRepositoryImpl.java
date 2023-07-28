package guru.springframework.sfgdi.repositories;

/**
 * Created by gd on 7/28/2023
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
