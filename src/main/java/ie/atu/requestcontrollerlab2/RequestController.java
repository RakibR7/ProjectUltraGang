package ie.atu.requestcontrollerlab2;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2) {
        int total = num1+num2;
        return "Num1: "+num1+" Num2: "+num2+" Total: "+total;
    }
}


