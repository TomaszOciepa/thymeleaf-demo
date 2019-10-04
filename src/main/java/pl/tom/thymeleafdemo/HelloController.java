package pl.tom.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String get(Model model){

        Car car = new Car("CLS", "Mercedes");

        model.addAttribute("name", "Tomek");
        model.addAttribute("car", car);

        return "hello";
    }
}
