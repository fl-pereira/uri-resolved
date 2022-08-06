import java.util.Locale;
import java.util.Scanner;

public class Uri1018 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int nota100       = x / 100; // 5
        int nota50resto = x % 100; // 76
        int nota50      = nota50resto / 50; //1
        int nota20resto = nota50resto - nota50 * 50;
        int nota20      = nota20resto / 20;
        int nota10resto = nota20resto - nota20 * 20;
        int nota10      = nota10resto / 10;
        int nota5resto  = nota10resto - nota10 * 10;
        int nota5       = nota5resto / 5;
        int nota2resto  = nota5resto - nota5 * 5;
        int nota2       = nota2resto / 2;
        int nota1resto  = nota2resto - nota2 * 2;


        System.out.println(x);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1resto + " nota(s) de R$ 1,00");

        sc.close();
    }

}
