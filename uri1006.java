import java.util.Locale;
import java.util.Scanner;

public class uri1006 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A,B,C,notaA,notaB,notaC;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();


        notaA = A * 2;
        notaB = B * 3;
        notaC = C * 5;

        double mediaPond = (notaA + notaB + notaC) / 10;

        System.out.printf("MEDIA = %.1f%n", mediaPond);


        sc.close();
    }

}
