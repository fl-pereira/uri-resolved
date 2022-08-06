import java.util.Locale;
import java.util.Scanner;

public class Uri1020 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int diasIn = sc.nextInt();

        int ano     = diasIn / 365;
        int meses   = (diasIn % 365) / 30;
        int dias    = (diasIn % 365) - meses * 30;

        System.out.println(ano + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");


        sc.close();
    }

}
