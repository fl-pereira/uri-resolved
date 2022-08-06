import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int distance = sc.nextInt();
        int consume = 12;

        double litres = (double) time *  distance / consume;
        System.out.printf("%.3f%n", litres);

        sc.close();
    }

}
