package ie.atu.requestcontrollerlab2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Calculate{
    public int add(@RequestParam int num1, @RequestParam int num2){
        int total = num1+num2;
        return total;
    }
}

