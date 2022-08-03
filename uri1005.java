import java.util.Locale;
import java.util.Scanner;

public class uri1005 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A,B,notaA,notaB;

        A = sc.nextDouble();
        B = sc.nextDouble();

        notaA = A * 3.5;
        notaB = B * 7.5;

        double mediaPond = (notaA + notaB) / 11;

        System.out.printf("MEDIA = %.5f%n", mediaPond);


        sc.close();
    }

}
