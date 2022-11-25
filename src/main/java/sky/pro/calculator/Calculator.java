package sky.pro.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public Integer getSumNum (Integer num1, Integer num2) {
        if(num1 == null || num2 == null){
            throw new NullPointerException("Укажить два числа!");
        }
        return num1 + num2;
    }

    public Integer getDifNum(Integer num1, Integer num2) {
        if(num1 == null || num2 == null){
            throw new NullPointerException("Укажить два числа!");
        }
        return num1 - num2;
    }

    public Integer getMultiplyNum(Integer num1, Integer num2) {
        if(num1 == null || num2 == null){
            throw new NullPointerException("Укажить два числа!");
        }
        return num1 * num2;
    }

    public Integer getDivideNum(Integer num1, Integer num2) {
        if(num1 == null || num2 == null){
            throw new NullPointerException("Укажить два числа!");
        } else if (num2 == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя!!");
        }
        return num1/num2;
    }


}
