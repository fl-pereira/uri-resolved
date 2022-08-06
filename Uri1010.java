import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int pieceA,pieceB,qtypcA,qtypcB;
        double pricepcA,pricepcB;

        pieceA = sc.nextInt();
        qtypcA = sc.nextInt();
        pricepcA = sc.nextDouble();
        pieceB = sc.nextInt();
        qtypcB = sc.nextInt();
        pricepcB = sc.nextDouble();

        double total = (qtypcA * pricepcA) + (qtypcB * pricepcB);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }

}
