import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi, raio, result;
        pi = 3.14159;

        raio = sc.nextDouble();

        result = (4.0 / 3) * pi * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f%n", result);

        sc.close();
    }

}
