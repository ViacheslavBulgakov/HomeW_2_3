package pro.sky.calculator1.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int resultPlus;
    public int resultMinus;
    public int resultMultiplication;
    public double resultDivision;
    public int plus(int num1, int num2){
        return resultPlus = num1 + num2;
    }
    public int minus (int num1, int num2){
        return resultMinus = num1 - num2;
    }
    public int multiplication (int num1, int num2){
        return resultMultiplication = num1 * num2;
    }
    public double division (int num1, int num2){
        return resultDivision = (double) num1 / num2;
    }

}
