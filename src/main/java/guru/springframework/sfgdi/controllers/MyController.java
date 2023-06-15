package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by gd on 6/15/2023
 */
@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello World!!!");
        return "Hi Folks!";
    }
}
