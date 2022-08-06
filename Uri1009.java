import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        double salary = sc.nextDouble();
        double amount = sc.nextDouble();
        double total = salary + ((amount * 15) / 100);

        System.out.printf("TOTAL = R$ %.2f%n", total);

        sc.close();
    }

}
