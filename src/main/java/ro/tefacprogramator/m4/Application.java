package ro.tefacprogramator.m4;

public class Application {

    public static void main(String[] args) {
        System.out.println("New program");

        double rezPow = Calculator.pow(5, 4);
        System.out.println("rez pow = " + rezPow);

        int rezAdd = Calculator.add(100, 45);
        System.out.println("rez add = " + rezAdd);

        int rezSub = Calculator.substract(100, 45);
        System.out.println("rez subtract = " + rezSub);

        double rezDiv = Calculator.devide(100, 45);
        System.out.println("rez divide = " + rezDiv);

        int rezMul = Calculator.multiply(56, 7);
        System.out.println("rez multiply = " + rezMul);
    }
}
