package pl.tom.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String get(Model model){

        Car car = new Car("CLS", "Mercedes");
        Car car1 = new Car("X5", "BMW");
        Car car2 = new Car("WRX", "SUBARU");
        Car car3 = new Car("911", "Porshe");

        List<Car> carList = Arrays.asList(car, car1, car2, car3);
        model.addAttribute("name", "Tomek");
        model.addAttribute("cars", carList);

        return "hello";
    }
}
