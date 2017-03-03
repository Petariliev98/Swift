package CalculatorClient;

import java.math.BigDecimal;
import java.math.MathContext;

public class Calculator {

    double a;
    double b;
    BigDecimal result;

    BigDecimal sum(double a, double b) {
        BigDecimal abd = BigDecimal.valueOf(a);
        BigDecimal bbd = BigDecimal.valueOf(b);
        result = abd.add(bbd);

        return result;
    }

    BigDecimal subtract(double a, double b) {
        BigDecimal abd = BigDecimal.valueOf(a);
        BigDecimal bbd = BigDecimal.valueOf(b);
        result = abd.subtract(bbd);

        return result;
    }

    BigDecimal multiply(double a, double b) {
        BigDecimal abd = BigDecimal.valueOf(a);
        BigDecimal bbd = BigDecimal.valueOf(b);
        result = abd.multiply(bbd);
        MathContext mc = new MathContext(3);
        result = result.round(mc);
        return result;
    }

    BigDecimal divide(double a, double b) {
        BigDecimal abd = BigDecimal.valueOf(a);
        BigDecimal bbd = BigDecimal.valueOf(b);
        result = abd.divide(bbd);

        return result;
    }

    BigDecimal percentage(double a, double b) {
        BigDecimal abd = BigDecimal.valueOf(a);
        BigDecimal bbd = BigDecimal.valueOf(b);
        BigDecimal temp = BigDecimal.valueOf(100);
        temp = abd.divide(temp);
        result = temp.multiply(bbd);
        return result;
    }
}

