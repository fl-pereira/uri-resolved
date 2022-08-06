import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        int nota100     = (int) x / 100;
        int nota50resto = (int) x % 100;
        int nota50      = nota50resto / 50;
        int nota20resto = nota50resto - nota50 * 50;
        int nota20      = nota20resto / 20;
        int nota10resto = nota20resto - nota20 * 20;
        int nota10      = nota10resto / 10;
        int nota5resto  = nota10resto - nota10 * 10;
        int nota5       = nota5resto / 5;
        int nota2resto  = nota5resto - nota5 * 5;
        int nota2       = nota2resto / 2;
        int moeda1r     = nota2resto - nota2 * 2;

        double m = x - (long) x;
        double moedas   = m * 100;

        int moeda50c    = (int) moedas / 50;
        int moeda50cr   = Math.round((int) moedas % 50);
        int moeda25c    = moeda50cr / 25;
        int moeda25cr   = Math.round(moeda50cr - moeda25c * 25);
        int moeda10c    = moeda25cr / 10;
        int moeda10cr   = Math.round(moeda25cr - moeda10c * 10);
        int moeda5c     = moeda10cr / 5;
        int moeda5cr   = Math.round(moeda10cr - moeda5c * 5);
        int moeda1c     = Math.round(moeda5cr);

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1r + " moeda(s) de R$ 1.00");
        System.out.println(moeda50c + " moeda(s) de R$ 0.50");
        System.out.println(moeda25c + " moeda(s) de R$ 0.25");
        System.out.println(moeda10c + " moeda(s) de R$ 0.10");
        System.out.println(moeda5c + " moeda(s) de R$ 0.05");
        System.out.println(moeda1c + " moeda(s) de R$ 0.01");

        sc.close();
    }


}
