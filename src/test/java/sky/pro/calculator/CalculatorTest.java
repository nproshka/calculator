package sky.pro.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    @Test
    public void plusNums() {
        Integer num1 = 4;
        Integer num2 = 2;

        Calculator calculator = new Calculator();
        Integer sum = calculator.getSumNum(num1, num2);

        Integer sum2 = num1 + num2;


        assertNotNull(sum);
        assertSame(sum, sum2);
    }

    @Test
    public void minusNums() {
        Integer num1 = 6;
        Integer num2 = 3;

        Calculator calculator = new Calculator();
        Integer dif = calculator.getDifNum(num1, num2);

        Integer dif2 = num1 - num2;


        assertNotNull(dif);
        assertSame(dif, dif2);
    }

    @Test
    public void multiplyNums() {
        Integer num1 = 10;
        Integer num2 = 5;

        Calculator calculator = new Calculator();
        Integer multiply = calculator.getMultiplyNum(num1, num2);

        Integer multiply2 = num1 * num2;


        assertNotNull(multiply);
        assertSame(multiply, multiply2);
    }

    @Test
    public void DivideNums() {
        Integer num1 = 49;
        Integer num2 = 0;

        Calculator calculator = new Calculator();
        Integer div = calculator.getDivideNum(num1, num2);

        Integer div2 = num1 / num2;

        assertNotNull(div);
        assertSame(div, div2);
        assertNotSame(num2, 0);
    }
}
