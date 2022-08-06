import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        double gas = sc.nextDouble();

        double consume = (double) km / gas;

        System.out.printf("%.3f km/l%n", consume);

        sc.close();
    }

}
