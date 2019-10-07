package pl.tom.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    private  List<Car> carList = new ArrayList<>();

    public HelloController() {
        Car car = new Car("CLS", "Mercedes");
        Car car1 = new Car("X5", "BMW");
        Car car2 = new Car("WRX", "SUBARU");
        Car car3 = new Car("911", "Porshe");
       carList.add(car);
       carList.add(car1);
       carList.add(car2);
       carList.add(car3);
    }

    @GetMapping("/hello")
    public String get(Model model){

        model.addAttribute("name", "Tomek");
        model.addAttribute("cars", carList);
        model.addAttribute("newCar", new Car());
        return "hello";
    }

    @PostMapping("/add-car")
    public String addCar(@ModelAttribute Car car){
        carList.add(car);
        return "redirect:/hello";
    }
}
