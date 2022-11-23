package sky.pro.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }
    @GetMapping
    public String getWelcomeMassage() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String getSumNum(Integer num1, Integer num2) {
        return num1 + " + " + num2 + " = " + calculator.getSumNum(num1, num2);
    }

    @GetMapping("/minus")
    public String getDifNum(Integer num1, Integer num2) {
        return num1 + " - " + num2 + " = " + calculator.getDifNum(num1, num2);
    }

    @GetMapping("/multiply")
    public String getMultiplyNum(Integer num1, Integer num2) {
        return num1 + " * " + num2 + " = " + calculator.getMultiplyNum(num1, num2);
    }

    @GetMapping("/divide")
    public String getDivideNum(Integer num1, Integer num2) {
        return num1 + " / " + num2 + " = " + calculator.getDivideNum(num1, num2);
    }

}
