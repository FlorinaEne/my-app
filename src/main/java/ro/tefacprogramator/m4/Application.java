package ro.tefacprogramator.m4;

public class Application {

    public static void main(String[] args) {
        System.out.println("New program");

        double rezPow = Calculator.pow(5, 4);
        System.out.println("rezult pow = " + rezPow);

        int rezAdd = Calculator.add(100, 45);
        System.out.println("rezult add = " + rezAdd);

        int rezSub = Calculator.substract(100, 45);
        System.out.println("rezult subtract = " + rezSub);

        double rezDiv = Calculator.devide(100, 45);
        System.out.println("rezult divide = " + rezDiv);

        int rezMul = Calculator.multiply(6, 7);
        System.out.println("rezult multiply = " + rezMul);

        int rezDouble = Calculator.doubleNumber(6);
        System.out.println("result doubleNumber = " + rezDouble);
    }
}
