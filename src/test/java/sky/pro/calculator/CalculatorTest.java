package sky.pro.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 6, 10, 12})
    public void plusNums(Integer num1) {


        Calculator calculator = new Calculator();
        Integer sum = calculator.getSumNum(num1, num1);

        Integer sum2 = num1 + num1;


        assertNotNull(sum);
        assertSame(sum, sum2);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 7, 10, 12})
    public void minusNums(Integer num1) {


        Calculator calculator = new Calculator();
        Integer dif = calculator.getDifNum(num1, num1);

        Integer dif2 = num1 - num1;


        assertNotNull(dif);
        assertSame(dif, dif2);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 6, 10, 4})
    public void multiplyNums(Integer num1) {

        Calculator calculator = new Calculator();
        Integer multiply = calculator.getMultiplyNum(num1, num1);

        Integer multiply2 = num1 * num1;


        assertNotNull(multiply);
        assertSame(multiply, multiply2);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 6, 10, 12})
    public void DivideNums(Integer num1) {
        Integer num2 = 2;


        Calculator calculator = new Calculator();
        Integer div = calculator.getDivideNum(num1, num2);

        Integer div2 = num1 / num2;

        assertNotNull(div);
        assertSame(div, div2);
        assertNotSame(num1, 0);
    }
    @Test
    public void DivideNumsOnZero() {
        Integer num1 = 49;
        Integer num2 = 0;

        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.getDivideNum(num1, num2));

    }
}
