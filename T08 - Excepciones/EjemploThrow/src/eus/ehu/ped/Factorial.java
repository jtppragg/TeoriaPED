package eus.ehu.ped;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce número: ");
            int fact = factorial(sc.next());
            System.out.println(fact);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static int factorial(String arg) throws Exception {
        try {
            int num = Integer.parseInt(arg);
            int fact = factorial(num);
            return fact;
        } catch (NumberFormatException e) {
            throw new Exception("Debes introducir un número entero");
        }
    }

    private static int factorial(int num) throws NumeroNegativoException {
        int fact = 1;
        if (num < 0) {
            throw new NumeroNegativoException();
        }
        while (num > 0) {
            fact *= num--;
        }
        return fact;
    }
}
