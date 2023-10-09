package ie.atu.requestcontrollerlab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate") //path needed for url
    public Results calculate(@RequestParam int num1, @RequestParam int num2,  @RequestParam String operation) {     //req param is about binding to html
        int total = 0;
        String operator;

        switch(operation){
            case "add":
                total = num1+num2;
                operator = "add";
                break;
            case "subtract":
                total = num1-num2;
                operator = "subtract";
                break;
            case "multiply":
                total = num1*num2;
                operator = "multiply";
                break;
            case "divide":
                total = num1/num2;
                operator = "divide";
                break;
        }
        return new Results(operation, total);
    }
}