package ie.atu.requestcontrollerlab2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalculatorController  {
    //@GetMapping("/calculate")
    public int add(@RequestParam int num1, int num2){
        return num1+num2;
    }
}
