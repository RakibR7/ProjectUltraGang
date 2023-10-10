package ie.atu.requestcontrollerlab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//a) Is the above exercise using @RequestParam or @PathVariables? its using @RequestParam because
//of the longer links and that req takes out the num1 and num2 values

//c) Which would be correct to use for this example? Why?
//@RequestParam, since we want to have different operations and values and not fixed parameters

//this is the path variable version
//http://localhost:8080/calculate/8/2/divide

@RestController
public class CalculatorController {
    @GetMapping("/calculate/{num1}/{num2}/{operation}") //had to be fixed values compared to @req
    public Results calculate(@PathVariable int num1, @PathVariable int num2, @PathVariable String operation) {     //req param is about binding to html
        int total = 0;

        switch(operation){
            case "add":
                total = num1+num2;
                break;
            case "subtract":
                total = num1-num2;
                break;
            case "multiply":
                total = num1*num2;
                break;
            case "divide":
                total = num1/num2;
                break;
        }
        return new Results(operation, total);
    }
}

