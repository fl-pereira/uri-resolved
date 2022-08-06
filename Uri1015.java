import java.util.Locale;
import java.util.Scanner;

/* TA RESOLVIDO, MAS O SITE NÃO ACEITA POR ALGUM MOTIVO */
public class Uri1015 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] p1 = new double[2];
        double[] p2 = new double[2];

        for(int i = 0; i < p1.length; i++){
            p1[i] = sc.nextDouble();
        }

        for(int i = 0; i < p2.length; i++){
            p2[i] = sc.nextDouble();
        }

        double calc     = ((p1[1]-p1[0]) * (p1[1]-p1[0])) + ((p2[1]-p2[0]) * (p2[1]-p2[0]));
        double distance = Math.sqrt(calc);

        System.out.printf("%.4f%n", distance);

        sc.close();
    }

}
