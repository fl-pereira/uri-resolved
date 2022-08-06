import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A,B,C,pi;
        pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double aTrian       = A * C / 2;
        double aCirc        = pi * (C * C);
        double aTrapez      = (A + B) / 2 * C;
        double aQuad        = B * B;
        double aRetang      = A * B;

        System.out.printf("TRIANGULO: %.3f%n", aTrian);
        System.out.printf("CIRCULO: %.3f%n", aCirc);
        System.out.printf("TRAPEZIO: %.3f%n", aTrapez);
        System.out.printf("QUADRADO: %.3f%n", aQuad);
        System.out.printf("RETANGULO: %.3f%n", aRetang);

        sc.close();
    }

}
