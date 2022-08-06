import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double calc     = ((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1));
        double distance = Math.sqrt(calc);

        System.out.printf("%.4f%n", distance);

        sc.close();
    }

}
