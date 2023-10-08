package ie.atu.requestcontrollerlab2;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    /*
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello: " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam int age, String name) {
        return "age, name" + age + name;
    }
    */
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2) {
        return "Num1: "+num1+" Num2: "+num2;
    }
}


