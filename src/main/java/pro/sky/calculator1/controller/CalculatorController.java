package pro.sky.calculator1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator1.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return "Hello world!";
    }

    @GetMapping ("/plus")
    public String plus (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1,num2);
    }
    @GetMapping ("/minus")
    public String minus (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1,num2);
    }
    @GetMapping ("/multiplication")
    public String multiplication (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " * " + num2 + " = " + calculatorService.multiplication(num1,num2);
    }
    @GetMapping ("/division")
    public String division (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " / " + num2 + " = " + calculatorService.division(num1,num2);
    }
}
