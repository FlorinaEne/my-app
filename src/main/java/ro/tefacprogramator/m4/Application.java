package ro.tefacprogramator.m4;

public class Application {

    public static void main(String[] args) {
        System.out.println("New program");

        int rezPow = Calculator.add(5, 4);
        System.out.println("rez pow = " + rezPow);

        int rezAdd = Calculator.add(100, 45);
        System.out.println("rez add = " + rezAdd);

        int rezSub = Calculator.substract(100, 45);
        System.out.println("rez subtract = " + rezSub);

        int rezDiv = Calculator.substract(100, 45);
        System.out.println("rez divide = " + rezDiv);
    }
}
